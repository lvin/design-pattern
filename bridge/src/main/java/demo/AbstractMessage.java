package demo;

/**
 * 抽象的消息对象
 * @autor wensen on 2017/7/22.
 */
public abstract class AbstractMessage {
    /**
     * 持有一个实现部分的对象
     */
    protected MessageImplementor impl;

    /**
     * 构造方法，传入实现部分的对象
     * @param impl
     */
    public AbstractMessage(MessageImplementor impl) {
        this.impl = impl;
    }

    /**
     * 发送消息，转调实现部分的方法
     * @param messsage
     * @param toUser
     */
    public void sendMessage(String messsage, String toUser) {
        this.impl.send(messsage, toUser);
    }
}
