package demo;

/**
 * 重启机器命令的实现，实现Command接口
 * 持有重启机器命令的真正实现，通过调用接收者的方法来实现
 * @author wensen
 * @since 12/03/2018
 */
public class ResetCommand implements Command{

    /**
     * 持有真正实现命令的接收者--主板
     */
    private MainBoardApi mainBoardApi = null;

    public ResetCommand(MainBoardApi mainBoardApi) {
        this.mainBoardApi = mainBoardApi;
    }


    public void execute() {
        mainBoardApi.reset();
    }
}
