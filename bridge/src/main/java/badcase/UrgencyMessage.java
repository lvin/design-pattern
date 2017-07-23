package badcase;

/**
 * @autor wensen on 2017/7/22.
 */
public interface UrgencyMessage extends Message {
    /**
     * 监控某消息的处理过程
     * @param messageId 被监控的消息的编号
     * @return 包含监控的数据对象，这里示意一下，所以用了object
     */
    Object watch(String messageId);
}
