package demo;

/**
 * 导出成文本文件的对象
 * @autor wensen on 2017/8/20.
 */
public class ExportTxtFile implements ExportFileApi{
    public boolean export(String data) {
        //简单示意一下，这里需要操作文件
        System.out.println("导出数据" + data + "到文本文件");
        return true;
    }

}
