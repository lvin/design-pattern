package demo;

/**
 * @autor wensen on 2017/7/22.
 */
public class CommonMessage extends AbstractMessage{
    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String messsage, String toUser) {
        //对于普通消息，什么都不干，直接调用父类的方法，把消息发送出去就可以了
        super.sendMessage(messsage, toUser);
    }
}
