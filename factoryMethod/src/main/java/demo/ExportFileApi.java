package demo;

/**
 * 导出文件对象的接口
 * @autor wensen on 2017/8/20.
 */
public interface ExportFileApi {

    /**
     * 导出内容成为文件
     * @param data 示意：需要保存的数据
     * @return 是否保存成功
     */
    public boolean export(String data);
}
