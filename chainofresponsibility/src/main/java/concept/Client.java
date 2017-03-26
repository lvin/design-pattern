package concept;

/**
 */
public class Client {
    public static void main(String[] args) {
        //先要组装职责链
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();


        handler1.setSuccessor(handler2);

        handler1.handlerRequest();
    }
}
