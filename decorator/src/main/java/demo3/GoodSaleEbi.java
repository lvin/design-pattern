package demo3;

/**
 * 商品销售管理的业务接口
 * @author wensen
 * @since 14/03/2018
 */
public  interface GoodSaleEbi {

    /**
     * 保存销售信息，本来销售数据应该是多条，太麻烦了，为了演示，简单点
     * @param user
     * @param customer
     * @param saleModel
     * @return
     */
    public boolean sale(String user, String customer, SaleModel saleModel);
}
