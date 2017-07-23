package badcase;

/**
 * 描述输出到文件头点内的对象
 * @autor wensen on 2017/7/23.
 */
public class ExportHeaderModel {

    /**
     * 分公司或门市点编号
     */
    private String depId;

    /**
     * 导出数据的日期
     */
    private String exportDate;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getExportDate() {
        return exportDate;
    }

    public void setExportDate(String exportDate) {
        this.exportDate = exportDate;
    }
}

