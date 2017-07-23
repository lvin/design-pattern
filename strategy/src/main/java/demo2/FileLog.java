package demo2;

/**
 * @autor wensen on 2017/7/23.
 */
public class FileLog extends LogStrategyTemplate{
    protected void doLog(String msg) {
        System.out.println("现在把" + msg + "记录到文件中");
    }
}
