package demo2;


/**
 * 保险合同的对象
 * @autor wensen on 2017/7/23.
 */
public class InsuranceContract {

    /**
     * 保险合同编号
     */
    private String contractid;

    /**
     * 被保险人员的名称，同一份保险合同，要么跟人员签订，要么跟公司签订，也就是说，"被保险人员"和"被保险公司"这两个属性
     * 不可能同时有
     */
    private String personName;

    /**
     * 保险开始生效的日期
     */
    private String companyName;

    /**
     * 保险开始生效点日期
     */
    private long beginDate;

    /**
     * 保险失效日期，一定会大雨保险开始生效点日期
     */
    private long endDate;

    /**
     * 示例：其他数据
     */
    private String otherData;

    private InsuranceContract(ConcreteBuilder builder) {
        this.contractid = builder.getContractId();
        this.personName = builder.getPersonName();
        this.companyName = builder.getPersonName();
        this.beginDate = builder.getBeginDate();
        this.endDate = builder.getEndDate();
        this.otherData = builder.getOtherData();
    }

    public void someOperation() {
        System.out.println("Now in Insurance Contract someOperation" + this.contractid);

    }


}
