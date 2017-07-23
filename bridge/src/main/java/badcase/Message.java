package badcase;

/**
 * 消息统一接口
 * @autor wensen on 2017/7/22.
 */
public interface Message {
     void send(String message, String toUser);
}
