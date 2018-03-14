package demo2;

/**
 * @author wensen
 * @since 12/03/2018
 */
public class Operation implements OperationApi{

    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void add(int num) {
        //实现加法的功能
        result += num;
    }

    public void substract(int num) {
        result -= num;
    }
}
