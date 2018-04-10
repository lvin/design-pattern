package demo2;

/**
 * 订单对象的接口定义
 * @author wensen
 * @since 16/03/2018
 */
public class Order implements OrderApi{

    /**
     * 订单订购的产品名称
     */
    private String productName;

    /**
     * 订单订购的数量
     */
    private int orderNum;


    /**
     * 创建订单的人员
     */
    private String orderUser;

    public Order(String productName, int orderNum, String orderUser) {
        this.productName = productName;
        this.orderNum = orderNum;
        this.orderUser = orderUser;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(String orderUser) {
        this.orderUser = orderUser;
    }

    public void setProductName(String productName, String user) {
    }

    public void setOrderNum(int orderNum, String user) {

    }

    public void setOrderUser(String orderUser, String user) {

    }
}
