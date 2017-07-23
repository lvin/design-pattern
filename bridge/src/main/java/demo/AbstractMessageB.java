package demo;

/**
 * 由后向部分的对象自己来创建相应的implementor对象
 * @autor wensen on 2017/7/22.
 */
public class AbstractMessageB {
    protected MessageImplementor impl;

    public AbstractMessageB(int type) {
        if (type == 1) {
            this.impl = new MessageSMS();
        } else if (type == 2) {
            this.impl = new MessageEmail();
        } else if (type == 3) {
            this.impl = new MessageMobie();
        }
    }
}
