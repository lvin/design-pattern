package demo;

/**
 * @autor wensen on 2017/7/23.
 */
public class OldCustomerStrategy implements Strategy{
    public double clacPrice(double goodsPrice) {
        System.out.println("对于老客户，统一折扣5%");
        return goodsPrice * (1 - 0.05);
    }
}
