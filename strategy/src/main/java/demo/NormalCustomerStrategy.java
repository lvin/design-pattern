package demo;

/**
 * @autor wensen on 2017/7/23.
 */
public class NormalCustomerStrategy implements Strategy{
    public double clacPrice(double goodsPrice) {
        System.out.println("对于新客户或者是普通客户，没有折扣");
        return goodsPrice;
    }
}
