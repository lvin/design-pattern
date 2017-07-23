package example;

/**
 * @autor wensen on 2017/7/22.
 */
public class RefineAbstraction extends Abstraction{
    public RefineAbstraction(Implementor impl) {
        super(impl);
    }

    /**
     * 示例操作，实现一定的功能
     */
    public void otherOperation() {
        //实现一定的功能，可能会使用具体实现部分的实现方法
        //但是本犯方法更大的可能是使用Abstraction来定义的方法
        //通过组合使用Abstraction中定义的方法来完成更多的功能
    }
}
