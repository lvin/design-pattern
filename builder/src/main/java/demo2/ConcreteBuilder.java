package demo2;

/**
 * 构造保险合同对象的构建器
 * @autor wensen on 2017/7/23.
 */
public class ConcreteBuilder {
    private String contractId;
    private String personName;
    private String companyName;
    private long beginDate;
    private long endDate;
    private String otherData;

    /**
     * 构造方法，传入必须要有的参数
     * @param contractId
     * @param beginData
     * @param endDate
     */
    public ConcreteBuilder(String contractId, long beginData, long endDate) {
        this.contractId = contractId;
        this.beginDate = beginData;
        this.endDate = endDate;
    }

    /**
     * 选填数据，被保险人员的名称
     * @param personName
     * @return
     */
    public ConcreteBuilder setPersonName(String personName) {
        this.personName = personName;
        return this;
    }

    /**
     * 选填数据，被保险公司的名称
     * @param companyName
     * @return
     */
    public ConcreteBuilder setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public ConcreteBuilder setOtherData(String otherData) {
        this.otherData = otherData;
        return this;
    }

    public InsuranceContract build() {
        if (contractId == null || contractId.trim().length() == 0) {
            throw new IllegalArgumentException("合同编号不能为空");
        }

        boolean signPerson = personName != null && personName.trim().length() > 0;

        boolean signCompany = companyName != null && companyName.trim().length() > 0;

        return new InsuranceContract(this);
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getPersonName() {
        return personName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public long getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(long beginDate) {
        this.beginDate = beginDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }

    public String getOtherData() {
        return otherData;
    }
}
