package demo2;

/**
 * @autor wensen on 2017/7/23.
 */
public class DbLog extends LogStrategyTemplate{
    protected void doLog(String msg) {
        //制造错误
        if (msg != null && msg.trim().length() > 5) {
            int a = 5 / 10;
        }

        System.out.println("现在把" + msg + "记录到数据库中");
    }
}
