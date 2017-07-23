package demo2;

/**
 * @autor wensen on 2017/7/23.
 */
public class LogContext {
    public void log(String msg) {
        LogStrategy logStrategy = new DbLog();

        try {
            logStrategy.log(msg);
        } catch (Exception e) {
            logStrategy = new FileLog();
            logStrategy.log(msg);
        }
    }
}
