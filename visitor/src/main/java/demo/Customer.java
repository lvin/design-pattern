package demo;

/**
 * @author wensen
 * @since 15/03/2018
 */
public abstract class Customer {
    private String customerId;
    private String name;

    /**
     * 接受访问者的访问
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}
