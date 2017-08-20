package example;


/**
 * 光驱类，一个同事类
 * @autor wensen on 2017/8/20.
 */
public class CDDriver extends Colleague{
    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    private String data = "";

    public String getData() {
        return this.data;
    }

    public void readCD() {
        this.data = "设计模式,值得好好研究";
        //通知主板，自己的状态发生了改变
        this.getMediator().changed(this);
    }
}
