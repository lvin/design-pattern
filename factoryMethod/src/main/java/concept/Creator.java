package concept;

/**
 * @autor wensen on 2017/8/20.
 */
public abstract class Creator {

    /**
     * 创建Product的工厂方法
     * @return Product对象
     */
    protected abstract Product factoryMethod();

    public void someOperation() {
        //通常在这些方法实现中需要调用工厂方法来获取product
        Product product = factoryMethod();
    }
}
