package principle;

/**
 * @author wensen
 * @since 2018/9/11
 */
public class Client {
    public void someOperation() {
        String[] name = {"张三","李四", "王五"};

        //创建聚合对象
        Aggregate aggregate = new ConcreteAggregate(name);

        //循环输出聚合对象中的值
        Iterator it = aggregate.createIterator();

        //首先设置迭代器到第一个元素
        it.first();

        while (!it.isDone()) {
            //取出当前元素
            Object obj = it.currentItem();
            System.out.println("this obj==" + obj);

            //如果还没有迭代到最后，那么就向下迭代一个
            it.next();
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.someOperation();
    }

}
