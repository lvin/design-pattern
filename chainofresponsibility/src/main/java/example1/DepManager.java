package example1;

/**
 */
public class DepManager extends Handler{
    public String handlerRequest(String user, double fee) {
        String str = "";

        if (fee < 1000) { //如果属于自己的处理范围
            //doHanler
            return str;
        } else { //如果不属于自己的处理范围
            if (this.successor != null) {
                this.successor.handlerRequest(user, fee);
            }
        }

        return str;
    }
}
