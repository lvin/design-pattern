package demo;

/**
 * 同事类
 * @autor wensen on 2017/8/20.
 */
public abstract class Colleague {
    /**
     * 只有中介者对象，每个同事类都知道它的中介者对象
     */
    private Mediator mediator;


    /**
     * 构造方法，传入中介者对象
     * @param mediator
     */
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
