package demo;

/**
 * @autor wensen on 2017/7/23.
 */
public class Price {
    private Strategy strategy = null;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 报价，计算对客户的报价
     * @param goodsPrice
     * @return
     */
    public double quote(double goodsPrice) {
        return this.strategy.clacPrice(goodsPrice);
    }
}

