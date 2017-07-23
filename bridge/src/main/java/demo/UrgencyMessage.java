package demo;

/**
 * @autor wensen on 2017/7/22.
 */
public class UrgencyMessage extends AbstractMessage{
    public UrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String messsage, String toUser) {
        messsage = "加急：" + messsage;
        super.sendMessage(messsage, toUser);
    }

    public Object watch(String messageId) {
        return null;
    }
}
