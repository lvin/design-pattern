package concept;

/**
 * 职责链模式
 */
public abstract class Handler {

    /**
     * 持有后继的职责链对象
     */
    protected Handler successor;

    /**
     * 设置后继对象
     * @param successor
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 示意处理请求的方法，虽然这个方法是没有参数的，但实际是可传参的，根据具体需要来选择是否需要传参
     */
    public abstract void handlerRequest();
}
