package demo;

/**
 * 观察者，比如报纸的读者
 * @author wensen
 * @since 2018/4/10
 */
public interface Observer {

    /**
     * 被通知的方法
     *
     * @param subject 具体的目标对象，可以获取报纸的对象
     */
    void update(Subject subject);
}
