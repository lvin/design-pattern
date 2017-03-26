package example2;

/**
 * Created by wensen on 2017/3/25.
 */
public class PreFeeRequestModel extends RequestModel{

    public static final String FEE_TYPE = "preFee";

    public PreFeeRequestModel(String type) {
        super(type);
    }

    private String user;

    private Double fee;

    public static String getFeeType() {
        return FEE_TYPE;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }
}
