package demo;

/**
 * 实现导出数据的业务功能对象
 * @autor wensen on 2017/8/20.
 */
public abstract  class ExportOperate {
    public boolean export(String data) {
        //使用工厂方法
        ExportFileApi api = factoryMethod();

        return api.export(data);
    }

    protected abstract ExportFileApi factoryMethod();
}
