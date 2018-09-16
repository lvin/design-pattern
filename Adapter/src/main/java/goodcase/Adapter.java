package goodcase;

import badcase.LogDbOperateApi;
import badcase.LogFileOperateApi;
import badcase.LogModel;

import java.util.List;

/**
 * 适配器对象，将记录日志到文件的功能适配成第二版需要的增删改查功能
 * @author wensen
 * @since 2018/9/9
 */
public class Adapter implements LogDbOperateApi {

    /**
     * 持有需要被适配的接口对象
     */
    private LogFileOperateApi adaptee;

    /**
     * 构造方法，传入需要被适配的对象
     * @param adaptee
     */
    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    public void createLog(LogModel logModel) {

        //1. 先读取文件的内容
        List<LogModel> list = adaptee.readLogFile();
        //2.加入新的日志对象
        list.add(logModel);
        //3.重新写入文件
        adaptee.writeLogFile(list);
    }

    public void updateLog(LogModel logModel) {

    }

    public void removeLog(LogModel logModel) {
        //1:先读取文件的内容
        List<LogModel> list = adaptee.readLogFile();
        //2:删除相应的日志对象
        list.remove(logModel);
        //3.重新写入文件
        adaptee.writeLogFile(list);
    }

    public List<LogModel> getAllLog() {
        return adaptee.readLogFile();
    }
}
