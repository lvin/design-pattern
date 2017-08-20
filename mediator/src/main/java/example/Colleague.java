package example;

/**
 *
 * @autor wensen on 2017/8/20.
 */
public class Colleague {
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
