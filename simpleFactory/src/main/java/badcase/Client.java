package badcase;

/**
 * @autor wensen on 2017/9/17.
 */
public class Client {
    public static void main(String[] args) {
        Api api = new Impl();
        api.test1("哈哈，不要紧张，只是个测试而已");
    }
}
