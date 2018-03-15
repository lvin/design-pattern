package badcase;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author wensen
 * @since 15/03/2018
 */
public class Client {
    public static void main(String[] args) {
        //准备些测试数据
        Collection<Customer> colCustomer = preparedTestData();
        //循环对客户进行操作
        colCustomer.stream().forEach(cm -> {
            cm.predilectionAnalyze();
            cm.worthAnalyze();
        });

    }

    private static Collection<Customer> preparedTestData() {
        Collection<Customer> colCustomer = new ArrayList<Customer>();

        //为了测试方便，准备些数据
        Customer cm1 = new EnterpriseCustomer();
        cm1.setName("ABC Group");
        colCustomer.add(cm1);


        return colCustomer;
    }
}
