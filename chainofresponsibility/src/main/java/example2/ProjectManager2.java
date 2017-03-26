package example2;

/**
 */
public class ProjectManager2 extends ProjectManager{

    public Object handlerRequest(RequestModel requestModel) {
        if (PreFeeRequestModel.FEE_TYPE.equals(requestModel.getType())) {
            return myHandler(requestModel);
        } else {
            return super.handlerRequest(requestModel);
        }
    }

    private Object myHandler(RequestModel requestModel) {
        PreFeeRequestModel preFeeRequestModel = null;
        if (requestModel instanceof PreFeeRequestModel) {
            preFeeRequestModel = (PreFeeRequestModel)requestModel;
        }

        if (preFeeRequestModel.getFee() < 5000) {
            //doHandler
            return true;
        } else {
            if (null != this.successor) {
                this.successor.handlerRequest(requestModel);
            }
            return false;
        }
    }
}
