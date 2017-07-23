package demo;

import badcase.ExportDataModel;
import badcase.ExportFooterModel;
import badcase.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * 实现导出数据到文本文件的生成器对象
 * @autor wensen on 2017/7/23.
 */
public class TxtBuilder implements Builder{

    /**
     * 用来记录构建的文件的内容，相当于产品
     */
    private StringBuffer buffer = new StringBuffer();

    /**
     * 用来记录
     * @param exportHeaderModel
     */
    public void buildHeader(ExportHeaderModel exportHeaderModel) {
        buffer.append(exportHeaderModel.getDepId() + "," + exportHeaderModel.getExportDate() + "\n");
    }

    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        for (String tblName : mapData.keySet()) {
            //先拼接表名称
            buffer.append(tblName + "\n");
            //然后循环拼接具体数据
            for (ExportDataModel edm : mapData.get(tblName)) {
                buffer.append(edm.getProductId() + "," + edm.getPrice() + "," + edm.getAmount() + "\n");
            }

        }
    }

    public void buildFooter(ExportFooterModel exportFooterModel) {
        buffer.append(exportFooterModel.getExportUser());

    }

    public StringBuffer getResult() {
        return buffer;
    }

}
