package demo;

import badcase.ExportDataModel;
import badcase.ExportFooterModel;
import badcase.ExportHeaderModel;

import java.util.*;

/**
 * @autor wensen on 2017/7/23.
 */
public class Client {
    public static void main(String[] args) {
        //准备测试数据
        ExportHeaderModel ehm = new ExportHeaderModel();

        ehm.setDepId("一分公司");
        ehm.setExportDate("2010-05-18");

        Map<String, Collection<ExportDataModel>> mapData = new HashMap<String, Collection<ExportDataModel>>();
        Collection<ExportDataModel> col = new ArrayList<ExportDataModel>();

        ExportDataModel edm1 = new ExportDataModel();
        edm1.setProductId("产品001号");
        edm1.setPrice(100);
        edm1.setAmount(80);

        ExportFooterModel efm = new ExportFooterModel();
        efm.setExportUser("张三");

        TxtBuilder txtBuilder = new TxtBuilder();
        //创建指导者对象
        Director director = new Director(txtBuilder);
        director.construct(ehm, mapData, efm);

        System.out.println("输出到文本文件点内容:\n" + txtBuilder.getResult());

    }
}
