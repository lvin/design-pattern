package demo;

import badcase.ExportDataModel;
import badcase.ExportFooterModel;
import badcase.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * 生成器接口，定义创建一个输出文件对象所需点各个部件点操作
 * @autor wensen on 2017/7/23.
 */
public interface Builder {

    /**
     * 构建输出文件的header部分
     * @param exportHeaderModel
     */
    public void buildHeader(ExportHeaderModel exportHeaderModel);

    /**
     * 构建输出文件的Body部分
     * @param mapData
     */
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData);

    /**
     * 构建输出文件的Footer部分
     * @param exportFooterModel
     */
    public void buildFooter(ExportFooterModel exportFooterModel);
}
