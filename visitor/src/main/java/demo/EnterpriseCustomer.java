package demo;


/**
 * @author wensen
 * @since 15/03/2018
 */
public class EnterpriseCustomer extends Customer{
    private String linkman;
    private String linkTelephone;
    private String registerAddress;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitEnterpriseCustomer(this);
    }

}
