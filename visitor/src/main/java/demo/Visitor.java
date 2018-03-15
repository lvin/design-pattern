package demo;

/**
 * @author wensen
 * @since 15/03/2018
 */
public interface Visitor {
    public void visitEnterpriseCustomer(EnterpriseCustomer enterpriseCustomer);

    public void visitPersonalCustomer(PersonalCustomer personalCustomer);


}
