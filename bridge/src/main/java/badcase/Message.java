package badcase;

/**
 * 消息统一接口
 * @autor wensen on 2017/7/22.
 */
public interface Message {
     /**
      * 发送消息
      * @param message 发送的消息内容
      * @param toUser 发送的消息的目的用户
      */
     void send(String message, String toUser);
}
