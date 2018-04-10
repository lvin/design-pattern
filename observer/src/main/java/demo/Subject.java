package demo;


import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，作为被观察者
 * @author wensen
 * @since 2018/4/10
 */
public class Subject {

    /**
     * 用来保存注册的观察者对象，也就是报纸的订阅者
     */
    private List<Observer> readers = new ArrayList<>();

    /**
     * 报纸的订阅者需要向报社订阅，要先注册
     * @param reader
     */
    public void attach(Observer reader) {
        readers.add(reader);
    }

    /**
     * 报纸的订阅者可以取消订阅
     * @param reader
     */
    public void detach(Observer reader) {
        readers.remove(reader);
    }

    protected void notifyObservers() {
        readers.stream().forEach(reader ->{
            reader.update(this);
        });
    }
}
