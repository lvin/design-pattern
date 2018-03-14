package principle;

/**
 * @author wensen
 * @since 14/03/2018
 */
public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    /**
     * 添加的状态
     */
    private String addedState;

    public String getAddedState() {
        return addedState;
    }

    public void setAddedState(String addedState) {
        this.addedState = addedState;
    }

    @Override
    public void operation() {
        //调用父类的方法，可以在调用前后执行一些附加的动作
        //在这里进行处理的时候，可以使用动态添加的状态
        super.operation();
    }
}
