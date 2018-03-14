package principle;

/**
 * 装饰器的具体实现对象，向组件对象添加职责
 * @author wensen
 * @since 14/03/2018
 */
public class ConcreteDecoratorB extends Decorator{
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
    }

    private void addedBehavior() {
        //需要添加的职责实现
    }
}
