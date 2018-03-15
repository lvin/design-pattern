package badcase;

/**
 * @author wensen
 * @since 15/03/2018
 */
public class EnterpriseCustomer extends Customer{

    /**
     * 联系人
     */
    private String linkman;

    /**
     * 联系电话
     */
    private String linkTelephone;

    /**
     * 企业注册地址
     */
    private String registerAddress;

    /**
     * 企业客户提供服务请求的方法,示意一下
     */
    @Override
    public void serviceRequest() {
        //企业客户提出的具体服务请求
        System.out.println(this.getName()+"企业提出服务请求");
    }

    @Override
    public void predilectionAnalyze() {
        System.out.println("现在企业客户"+getName()+"进行产品偏好分析");
    }

    @Override
    public void worthAnalyze() {
        System.out.println("现在企业客户" + getName() + "进行价值分析");

    }
}
