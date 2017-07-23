package demo;

import badcase.ExportDataModel;
import badcase.ExportFooterModel;
import badcase.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * 指导者，指导使用生成器点接口来构建输出点文件点对象
 * @autor wensen on 2017/7/23.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(ExportHeaderModel ehm, Map<String, Collection<ExportDataModel>> mapData, ExportFooterModel exportFooterModel) {
        //1. 先构建Header
        builder.buildHeader(ehm);

        //2.然后构建Body
        builder.buildBody(mapData);

        //3.再构建Footer
        builder.buildFooter(exportFooterModel);
    }
}

