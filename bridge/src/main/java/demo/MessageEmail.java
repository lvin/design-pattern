package demo;

/**
 * @autor wensen on 2017/7/22.
 */
public class MessageEmail implements MessageImplementor{
    public void send(String message, String toUser) {
        System.out.println("使用E-mail的方法，发送消息" + message + "给" + toUser);
    }
}
