package principle;

/**
 * @author wensen
 * @since 15/03/2018
 */
public class ConcreteElementB extends Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public void operationB() {
    }
}
