package demo;

/**
 * @autor wensen on 2017/9/17.
 */
public class Client {
    public static void main(String[] args) {
        Api api = Factory.createApi(1);
        api.operation("正在使用简单工厂");
    }
}
