package badecase;

/**
 * 价格管理，主要完成计算向客户锁报价格的功能
 * @autor wensen on 2017/7/23.
 */
public class Price {
    public double quote(double goodsPrice, String customerType) {
        if ("普通客户".equals(customerType)) {
            System.out.println("对于新客户或者是普通客户，没有折扣价格");
            return goodsPrice;
        } else if ("老客户".equals(customerType)) {
            System.out.println("对于老客户，统一折扣5%");
            return goodsPrice * (1 - 0.05);
        } else if ("大客户".equals(customerType)) {
            System.out.println("对于大客户，统一折扣10%");
            return goodsPrice * (1 - 0.1);
        }

        //其余人员报价
        return goodsPrice;
    }
}
