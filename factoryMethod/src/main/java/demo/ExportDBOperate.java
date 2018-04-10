package demo;

/**
 * 具体的创建器实现对象，实现创建导出成数据库备份文件形式
 * @autor wensen on 2017/8/20.
 */
public class ExportDBOperate extends ExportOperate{
    @Override
    protected ExportFileApi factoryMethod() {
        //创建导出成数据库备份文件形式的对象
        return new ExportDB();
    }
}
