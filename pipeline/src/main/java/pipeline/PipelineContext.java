package pipeline;

/**
 * @author wensen
 * @since 2019-04-08
 */
public interface PipelineContext extends PipelineStates{
    void invokeNext();
}
