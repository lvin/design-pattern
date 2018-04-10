package demo2;

/**
 * @author wensen
 * @since 16/03/2018
 */
public interface OrderApi {

    /**
     * 获取订单订购的产品名称
     * @return
     */
    public String getProductName();

    /**
     * 设置订单订购的产品名称
     * @param productName
     * @param user
     */
    public void setProductName(String productName, String user);

    /**
     * 获取订单订购的数量
     * @return 订单订购的数量
     */
    public int getOrderNum();

    /**
     * 设置订单订购的数量
     * @param orderNum
     * @param user
     */
    public void setOrderNum(int orderNum, String user);

    /**
     * 获取创建订单的renyuan
     * @return
     */
    public String getOrderUser();

    /**
     * 修改订单创建人
     */
    public void setOrderUser(String orderUser, String user);


}
