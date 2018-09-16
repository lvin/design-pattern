package badcase;

import java.util.List;

/**
 * 定义操作日志的应用接口，为了示例的简单，只是简单地定义了增删改查的
 * @author wensen
 * @since 2018/9/9
 */
public interface LogDbOperateApi {

    /**
     * 新增日志
     * @param logModel 需要新增的日志对象
     */
    public void createLog(LogModel logModel);

    /**
     * 修改日志
     * @param logModel
     */
    public void updateLog(LogModel logModel);

    /**
     * 删除日志
     * @param logModel
     */
    public void removeLog(LogModel logModel);

    /**
     * 获取所有的日志
     * @return 所有日志对象
     */
    public List<LogModel> getAllLog();
}
