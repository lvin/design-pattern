package demo3;

/**
 * 装饰器的对象，需要和被装饰的对象实现同样的接口
 * @author wensen
 * @since 14/03/2018
 */
public abstract class Decorator implements GoodSaleEbi{

    /**
     * 持有被装饰的组件对象
     */
    protected GoodSaleEbi ebi;

    /**
     * 通过构造方法传入被装饰的对象
     * @param ebi
     */
    public Decorator(GoodSaleEbi ebi) {
        this.ebi = ebi;
    }

}
