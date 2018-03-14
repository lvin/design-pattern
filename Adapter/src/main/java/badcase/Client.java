package badcase;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wensen
 * @since 12/03/2018
 */
public class Client {
    public static void main(String[] args) {
        //准备日志内容，也就是测试的数据
        LogModel lml = new LogModel();
        lml.setLogId("001");
        lml.setOperateUser("admin");
        lml.setOperateTime("2010-03-02 10:08:18");
        lml.setLogContent("这就是一个测试");

        List<LogModel> list = new ArrayList<LogModel>();
        list.add(lml);
        //创建操作日志文件的对象
        LogFileOperateApi api = new LogFileOperate("api");

        //保存日志文件
        api.writeLogFile(list);

        //读取日志文件的内容
        List<LogModel> readLog = api.readLogFile();
        System.out.println("readlog=" + readLog);
    }
}
