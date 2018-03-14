package demo;

/**
 * @autor wensen on 2017/9/17.
 */
public class Factory {

    /**
     * 具体创建Api对象的方法
     * @param condition
     * @return
     */
    public static Api createApi(int condition) {
        Api api = null;
        if (condition == 1) {
            api = new ImplA();
        } else if (condition == 2) {
            api = new ImplB();
        }

        return api;
    }

}
