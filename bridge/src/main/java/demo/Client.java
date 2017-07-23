package demo;

/**
 * @autor wensen on 2017/7/22.
 */
public class Client {
    public static void main(String[] args) {
        MessageImplementor impl = new MessageSMS();
        //创建一个普通消息对象
        AbstractMessage m = new CommonMessage(impl);

        m.sendMessage("请喝一杯茶", "小李");

        m = new UrgencyMessage(impl);

        m.sendMessage("请喝一杯茶", "小李");


        //把实现方法切换成手机消息，然后再实现一个
        impl = new MessageMobie();

        m = new CommonMessage(impl);
        m.sendMessage("请喝一杯茶", "小李");

        m = new UrgencyMessage(impl);
        m.sendMessage("请喝一杯茶", "小李");

    }
}
