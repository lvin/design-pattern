package theory;

/**
 * @autor wensen on 2017/7/17.
 */
public class Proxy implements Subject{

    /**
     * 持有被代理的具体的目标对象
     */
    private RealSubject realSubject = null;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void request() {

        //在转调具体的目标对象前，可以执行一些功能

        //转调具体的目标对象的方法
        realSubject.request();


        //在转调具体的目标对象后，可以执行一些功能
    }
}
