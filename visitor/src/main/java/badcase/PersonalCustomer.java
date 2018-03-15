package badcase;

/**
 * 个人客户
 * @author wensen
 * @since 15/03/2018
 */
public class PersonalCustomer extends Customer{

    /**
     * 联系电话
     */
    private String telephone;

    /**
     * 年龄
     */
    private int age;

    /**
     * 企业注册地址
     */
    private String registerAddress;

    /**
     * 个人客户提出服务请求的方法，示意一下
     */
    @Override
    public void serviceRequest() {
        System.out.println("客户"+getName()+"提出服务请求");
    }

    @Override
    public void predilectionAnalyze() {
        System.out.println("现在个人客户"+getName()+"进行产品偏好分析");
    }

    @Override
    public void worthAnalyze() {
        System.out.println("现在个人客户"+getName()+"进行产品价值分析");

    }
}
