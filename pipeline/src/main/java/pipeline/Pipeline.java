package pipeline;

/**
 * @author wensen
 * @since 2019-04-07
 */
public interface Pipeline {

    PipelineContext newInvocation();
}
