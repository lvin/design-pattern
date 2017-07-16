import java.util.List;

/**
 * @autor wensen on 2017/7/16.
 */
public interface LogFileOperateApi {

    /**
     * 读取日志文集爱你，从文件里面获取存储的日志列表对象
     * @return
     */
    public List<LogModel> readLogFile();

    /**
     * 写日志文件，把日志列表写出日志文件中去
     *
     * @param list
     */
    void writeLogFile(List<LogModel> list);
}
