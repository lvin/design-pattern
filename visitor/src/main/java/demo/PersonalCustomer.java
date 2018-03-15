package demo;

/**
 * @author wensen
 * @since 15/03/2018
 */
public class PersonalCustomer extends Customer{
    private String telephone;
    private int age;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPersonalCustomer(this);
    }
}
