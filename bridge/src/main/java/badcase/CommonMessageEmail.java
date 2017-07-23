package badcase;

/**
 * @autor wensen on 2017/7/22.
 */
public class CommonMessageEmail implements Message{
    public void send(String message, String toUser) {
        System.out.println("使用E-mail的方式，发消息" + message + "给" + toUser);
    }
}
