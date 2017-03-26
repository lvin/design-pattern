package example2;

/**
 */
public abstract class Handler {

    /**
     * 下一个处理请求对象
     */
    protected Handler successor = null;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 通用的请求处理方法
     * @param requestModel
     * @return
     */
    public Object handlerRequest(RequestModel requestModel) {
        if (null != successor) {
            return this.successor.handlerRequest(requestModel);
        } else {
            System.out.println("没有后续处理或暂时不支持这样的功能处理");
        }

        return false;

    }
}
