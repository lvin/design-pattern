package demo;

/**
 * @autor wensen on 2017/7/22.
 */
public class SpecialUrgencyMessage extends AbstractMessage{
    public SpecialUrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    public void hurry(String messageId) {
        //执行催促的任务，发出催促的消息
    }

    @Override
    public void sendMessage(String messsage, String toUser) {
        messsage = "特急:" + messsage;
        super.sendMessage(messsage, toUser);
        //还需要增加一条待催促的消息
    }
}
