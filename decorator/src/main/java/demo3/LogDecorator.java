package demo3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @author wensen
 * @since 14/03/2018
 */
public class LogDecorator extends Decorator{
    public LogDecorator(GoodSaleEbi ebi) {
        super(ebi);
    }

    public boolean sale(String user, String customer, SaleModel saleModel) {
        //执行业务功能
        boolean f = this.ebi.sale(user, customer, saleModel);

        //在执行业务功能后记录日志
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("日志记录");

        return f;
    }
}
