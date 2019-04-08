package pipeline;

import java.util.Map;

/**
 * @author wensen
 * @since 2019-04-08
 */
public interface PipelineStates {

    /**
     * Pipeline 执行完毕
     *
     * @return the boolean
     */
    boolean isFinish();


    /**
     * 检查pipeline将是否被中断。
     *
     * @return the boolean
     */
    boolean isBroken();


    /**
     * 是否被需取消了
     *
     * @return the boolean
     */
    boolean isCanceled();

    /**
     * 取得当前pipeline执行的状态的整个上下文的Map。
     * <p/>
     *
     * @return the attribute
     */
    Map<String, Object> getAttributeMap();

    /**
     * 获取外部的上下文
     *
     * @param <T> the type parameter
     *
     * @return the outer context
     */
    <T> T getOuterContext();


    /**
     * 设置外部上下文
     *
     * @param <T>     the type parameter
     * @param context the context
     */
    <T> void setOuterContext(T context);
}

