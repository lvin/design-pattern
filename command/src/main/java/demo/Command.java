package demo;

/**
 * 命令接口，声明执行的操作
 * @autor wensen
 * @since 2018/1/22
 */
public interface Command {

    /**
     * 执行命令对应的操作
     */
    public void execute();
}
