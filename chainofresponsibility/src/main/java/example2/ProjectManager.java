package example2;

/**
 */
public class ProjectManager extends Handler{
    public Object handlerRequest(RequestModel rm) {
        if (FeeRequestModel.FEE_TYPE.equals(rm.getType())) {
            return handlerRequest(rm);
        } else {
            return super.handlerRequest(rm);
        }
    }

    private Object handleFeeRequest(RequestModel rm) {
        FeeRequestModel frm = (FeeRequestModel)rm;

        String str = "";

        //doHandler

        return str;
    }
}


