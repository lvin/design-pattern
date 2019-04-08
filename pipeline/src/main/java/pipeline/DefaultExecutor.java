package pipeline;

import impl.valves.Valve1;
import impl.valves.Valve2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wensen
 * @since 2019-04-08
 */
public class DefaultExecutor implements Executor{

    private volatile Pipeline pipeline;

    public DefaultExecutor() {
        List<Valve> valves = new ArrayList<Valve>(10);
        valves.add(new Valve1());
        valves.add(new Valve2());
        Pipeline pipeline = new DefaultPipeline(valves);
        this.pipeline = pipeline;
    }

    public void execute() {
        final PipelineContext pipelineContext = pipeline.newInvocation();
        pipelineContext.invokeNext();

    }
}
