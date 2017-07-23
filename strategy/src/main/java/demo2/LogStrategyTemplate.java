package demo2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @autor wensen on 2017/7/23.
 */
public abstract  class LogStrategyTemplate implements LogStrategy{
    public final void log(String msg) {
        //第一步：为消息添加记录日志的时间
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        msg = df.format(new Date()) + "内容是:" + msg;
        doLog(msg);
    }

    /**
     * 真正执行日志记录，让子类去具体实现
     * @param msg
     */
    protected abstract void doLog(String msg);
}
