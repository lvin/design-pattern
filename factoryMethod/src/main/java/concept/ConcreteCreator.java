package concept;

/**
 * 具体的创建器实现对象
 * @autor wensen on 2017/8/20.
 */
public class ConcreteCreator extends Creator{
    @Override
    protected Product factoryMethod() {
        //重定义工厂方法，返回一个具体的Product
        return new ConcreteProduct();
    }
}
