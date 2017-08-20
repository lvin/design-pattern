package demo;

/**
 * 中介者，定义各个同事对象通信的接口
 * @autor wensen on 2017/8/20.
 */
public interface Mediator {
    /**
     * 同事对象在自身改变的时候来通知中介者的方法
     * 让中介者去负责相应的与其他同事对象的交互
     * @param colleague 同事对象本身，好让中介者对象通过对象去获取同事对象的状态
     */
    public void changed(Colleague colleague);
}
