package demo;

/**
 * @autor wensen
 * @since 2018/1/22
 */
public class Box {

    /**
     * 开机命令对象
     */
    private Command openCommand;

    public void setOpenCommand(Command openCommand) {
        this.openCommand = openCommand;
    }

    /**
     * 提供给客户使用，接收并响应用户请求，相当于按钮被按下触发的
     */
    public void openButtonPressed() {
        /**
         * 按下按钮，执行命令
         */
        openCommand.execute();
    }
}
