package badcase;

/**
 * @autor wensen on 2017/7/22.
 */
public class UrgencyMessageEmail implements UrgencyMessage {
    public void send(String message, String toUser) {
        message = "加急" + message;

        System.out.println("使用E-mail的方法，发送消息" + message + "给" + toUser);
    }

    public Object watch(String messageId) {
        //获取相应的数据，组织成监控的数据对象，然后返回
        return null;
    }
}
