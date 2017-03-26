package example2;

/**
 */
public class FeeRequestModel extends RequestModel{

    /**
     * 约定具体的业务类型
     */
    public final static String FEE_TYPE = "fee";


    public FeeRequestModel() {
        super(FEE_TYPE);
    }

    /**
     * 申请人
     */
    private String user;

    private double fee;


    public static String getFeeType() {
        return FEE_TYPE;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
