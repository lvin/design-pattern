package demo3;

/**
 * @author wensen
 * @since 14/03/2018
 */
public class GoodsSaleEbo implements GoodSaleEbi {

    public boolean sale(String user, String customer, SaleModel saleModel) {
        System.out.println(user + "保存了" + customer + "购买" + saleModel + "的销售数据");

        return true;
    }
}
