package demo;

/**
 * 策略，定义报价算法的接口
 * @autor wensen on 2017/7/23.
 */
public interface Strategy {
    public double clacPrice(double goodsPrice);
}
