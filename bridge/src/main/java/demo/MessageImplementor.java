package demo;

/**
 * 实现发送消息的统一接口
 * @autor wensen on 2017/7/22.
 */
public interface MessageImplementor {
    /**
     * 发送消息
     * @param message
     * @param toUser
     */
    void send(String message, String toUser);
}
