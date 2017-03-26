package example1;

/**
 */
public class GeneralManager extends Handler{
    public String handlerRequest(String user, double fee) {
        String str = "";
        if (fee >= 1000) {
            //doHandler
            return str;
        } else {
            if (this.successor != null) {
                this.successor.handlerRequest(user, fee);
            }
        }

        return str;
    }
}