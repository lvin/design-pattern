package impl.valves;

import pipeline.PipelineContext;
import pipeline.Valve;

/**
 * @author wensen
 * @since 2019-04-08
 */
public class Valve2 implements Valve {
    public void invoke(PipelineContext pipelineContext) {
        System.out.println("valve2");
    }
}
