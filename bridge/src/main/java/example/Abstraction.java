package example;

/**
 * 定义抽象部分的接口
 * @autor wensen on 2017/7/22.
 */
public abstract  class Abstraction {
    /**
     * 持有一个实现部分的接口
     */
    protected Implementor impl;

    /**
     * 构造方法，传入实现部分的对象
     * @param impl
     */
    public Abstraction(Implementor impl) {
        this.impl = impl;
    }

    /**
     * 示例操作，实现一定的功能，可能需要转调实现部分代码的具体实现
     */
    public void operation() {
        impl.operationImpl();
    }
}
