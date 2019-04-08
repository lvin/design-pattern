package pipeline;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wensen
 * @since 2019-04-08
 */
public class DefaultPipeline implements Pipeline{
    private final List<Valve> valves;

    public DefaultPipeline(List<Valve> valves) {
        if (valves != null && !valves.isEmpty()) {
            this.valves = Collections.unmodifiableList(valves);
        } else {
            this.valves = Collections.EMPTY_LIST;
        }
    }

    public PipelineContext newInvocation() {
        return new DefaultPipelineContext();
    }

    class DefaultPipelineContext implements PipelineContext {

        private volatile  Iterator<Valve> iterator;

        //下面三个状态由 lock 保护
        private boolean broken;

        private boolean finished;

        private boolean canceled;

        private final Lock lock = new ReentrantLock();

        private final Condition condition = lock.newCondition();

        public DefaultPipelineContext() {
            this.iterator = valves.listIterator();
        }


        public void invokeNext() {
            if (this._isFinish()) {
                return;
            }

            if (!isBroken() && iterator.hasNext()) {
                Valve valve = iterator.next();
                valve.invoke(this);
            } else {
                finish(false);
            }
        }

        public boolean isBroken() {
            try {
                lock.lock();
                return broken;
            } finally {
                lock.unlock();
            }
        }

        private boolean _isFinish() {
            try {
                lock.lock();
                return finished;
            } finally {
                lock.unlock();
            }

        }

        public boolean isFinish() {
            try {
                lock.lock();
                return !canceled && !broken && finished;
            } finally {
                lock.unlock();
            }
        }

        private void finish(boolean cancel) {
            try {
                lock.lock();
                if (cancel) {
                    this.canceled = true;
                }
                finished = true;
                condition.signalAll();
            } finally {
                lock.unlock();
            }
        }

        public void breakPipeline() {
            try {
                lock.lock();
                broken = true;
            } finally {
                lock.unlock();
            }
            invokeNext();
        }

        public boolean isCanceled() {
            return false;
        }

        public Map<String, Object> getAttributeMap() {
            return null;
        }

        public <T> T getOuterContext() {
            return null;
        }

        public <T> void setOuterContext(T context) {

        }
    }
}
