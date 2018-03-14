package demo2;

/**
 * 命令接口，声明执行的操作，支持可撤销的操作
 *
 * @author wensen
 * @since 12/03/2018
 */
public interface Command {

    /**
     * 执行命令对应的操作
     */
    public void execute();


    /**
     * 执行撤销命令对应的操作
     */
    public void undo();
}
