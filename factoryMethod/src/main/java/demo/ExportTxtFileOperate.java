package demo;

/**
 * 具体的创建器实现对象，实现创建导出成文本文件格式的对象
 * @autor wensen on 2017/8/20.
 */
public class ExportTxtFileOperate extends ExportOperate{
    protected ExportFileApi factoryMethod() {
        //创建导出成文本文件格式的对象
        return new ExportTxtFile();
    }
}
