package principle;

/**
 * 观察者接口，定义一个更新的接口给那些在目标发生改变的时候被通知
 * @author wensen
 * @since 2018/4/10
 */
public interface Observer {

    /**
     * 更新的接口
     * @param subject 传入目标对象，方便获取相应的目标对象的状态
     */
    void update(Subject subject);
}
