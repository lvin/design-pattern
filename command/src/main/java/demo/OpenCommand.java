package demo;

/**
 * 开机命令的实现，实现Command接口
 * 持有开机命令的真正实现，通过调用接收者的方法来实现命令
 * @autor wensen
 * @since 2018/1/22
 */
public class OpenCommand implements Command{

    /**
     * 持有命令真正的接收者--主板对象
     */
    private MainBoardApi mainBoard = null;


    /**
     * 构造方法，传入主板对象
     * @param mainBoard
     */
    public OpenCommand(MainBoardApi mainBoard) {
        this.mainBoard = mainBoard;
    }

    public void execute() {
        /**
         * 对于命令对象，根本不知道如何开机，会转调主板的对象
         * 让主板去开机
         */
        this.mainBoard.open();
    }
}
