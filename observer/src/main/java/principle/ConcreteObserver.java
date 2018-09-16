package principle;

/**
 * @author wensen
 * @since 2018/4/10
 */
public class ConcreteObserver implements Observer{

    /**
     * 示意，观察者的状态
     */
    private String ObserverState;

    /**
     * @param subject 传入目标对象，方便获取相应的目标对象的状态
     */
    public void update(Subject subject) {
        //具体的更新实现
        //这里可能需要更新观察者的状态，使其目标的状态保持一致
        ObserverState = ((ConcreteSubject) subject).getSubjectState();
    }
}
