package demo;

/**
 * @autor wensen on 2017/7/23.
 */
public class LargeCustoerStrategy implements Strategy{
    public double clacPrice(double goodsPrice) {
        System.out.println("对于大客户，统一折扣10%");
        return goodsPrice * (1 -0.1);
    }
}
