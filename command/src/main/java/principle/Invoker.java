package principle;

/**
 * 调用者
 * @autor wensen
 * @since 2018/1/18
 */
public class Invoker {

    /**
     * 持有命令对象
     */
    private Command command = null;

    /**
     * 设置调用者持有的命令对象
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 示意方法，要求命令执行请求
     */
    public void runCommand() {
        command.execute();
    }

}
