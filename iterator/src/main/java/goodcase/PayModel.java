package goodcase;

/**
 * 工资描述模型对象
 * @author wensen
 * @since 2018/9/11
 */
public class PayModel {

    /**
     * 支付工资的人员
     */
    private String userName;

    /**
     * 支付的工资数额
     */
    private double pay;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PayModel{");
        sb.append("userName='").append(userName).append('\'');
        sb.append(", pay=").append(pay);
        sb.append('}');
        return sb.toString();
    }
}
