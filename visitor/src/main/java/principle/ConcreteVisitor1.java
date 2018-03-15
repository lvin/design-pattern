package principle;

/**
 * @author wensen
 * @since 15/03/2018
 */
public class ConcreteVisitor1 implements Visitor{
    @Override
    public void visitConcreteElementA(ConcreteElementA elementA) {
        elementA.operationA();
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB elementB) {
        elementB.operationB();
    }
}
