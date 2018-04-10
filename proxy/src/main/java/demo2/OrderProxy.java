package demo2;

/**
 * 订单的代理对象
 * @author wensen
 * @since 16/03/2018
 */
public class OrderProxy implements OrderApi{

    /**
     * 持有被代理的具体的具体对象
     */
    private Order order = null;

    /**
     * 构造方法，传入被代理的具体的目标对象
     * @param order
     */
    public OrderProxy(Order order) {
        this.order = order;
    }

    public String getProductName() {
        return order.getProductName();
    }

    public void setProductName(String productName, String user) {
        //控制访问权限,只有创建订单的人员才能够修改
        if (user != null && user.equals(this.getOrderUser())) {
            order.setProductName(productName, user);
        } else {
            System.out.println("对不起" + user + "您无权修改订单中的产品名称");
        }
    }

    public int getOrderNum() {
        return 0;
    }

    public void setOrderNum(int orderNum, String user) {
    }

    public String getOrderUser() {
        return null;
    }

    public void setOrderUser(String orderUser, String user) {
        //控制访问权限,只有创建订单的人员才能够修改
        if (user != null && user.equals(this.getOrderUser())) {
            order.setOrderUser(orderUser, user);
        } else {
            System.out.println("对不起" + user + "您无权修改订单中的产品名称");
        }

    }
}
