package demo2;

/**
 * @autor wensen on 2017/7/23.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder("001", 12345L, 67890);

        //设置需要的数据，然后构建保险合同对象
        InsuranceContract contract = builder.setPersonName("张三").setOtherData("test").build();

        //操作保险合同对象的方法
        contract.someOperation();
    }
}
