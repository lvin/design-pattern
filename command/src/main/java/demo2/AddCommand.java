package demo2;

/**
 * @author wensen
 * @since 12/03/2018
 */
public class AddCommand implements Command{

    private OperationApi operationApi = null;

    private int opeNum;

    public void execute() {
        //转调接收者去真正执行功能，这个命令是做加法
        operationApi.add(opeNum);
    }

    public void undo() {
        //转调接收者去真正执行功能
        operationApi.substract(opeNum);
    }

    public AddCommand(OperationApi operationApi, int opeNum) {
        this.operationApi = operationApi;
        this.opeNum = opeNum;
    }
}
