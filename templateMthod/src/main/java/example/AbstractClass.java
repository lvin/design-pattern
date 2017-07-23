package example;

/**
 * @autor wensen on 2017/7/23.
 */
public abstract class AbstractClass {

    /**
     * 原语操作1，所谓的原语操作就是抽象的操作，必须要由子类提供实现
     */
    public abstract void doPrimitiveOperation1();

    /**
     * 原语操作2
     */
    public abstract void doPrimitiveOperation2();

    /**
     * 模板方法，定义算法骨架
     */
    public final void templateMethod() {
        doPrimitiveOperation1();
        doPrimitiveOperation2();
    }
}
