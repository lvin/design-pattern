package example1;

/**
 * 定义职责处理对象
 */
public abstract class Handler {

    /**
     * 定义下一个处理对象
     */
    protected Handler successor = null;


    /**
     * 设置下一个处理对象
     * @param successor 下一个处理请求的对象
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract String handlerRequest(String user, double fee);
}
