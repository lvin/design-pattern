package demo2;

/**
 * @author wensen
 * @since 16/03/2018
 */
public class Client {
    public static void main(String[] args) {
        //张三登录了系统创建了一个订单
        OrderApi orderApi = new OrderProxy(new Order("设计模式", 100, "张三"));

        //李四想要来修改，那就会报错
        orderApi.setOrderNum(123, "李四");

        //输出order
        System.out.println("李四修改后订单记录没有变化:" + orderApi.getOrderNum());

        //张三修改就不会有问题
        orderApi.setOrderNum(123, "张三");

        //再次输出order
        System.out.println("张三修改后，订单记录"+orderApi);
    }

}
