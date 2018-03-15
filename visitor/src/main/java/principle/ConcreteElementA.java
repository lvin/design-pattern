package principle;

/**
 * @author wensen
 * @since 15/03/2018
 */
public class ConcreteElementA extends Element{
    @Override
    public void accept(Visitor visitor) {
        //回调访问者对象的相应放方法
        visitor.visitConcreteElementA(this);
    }

    public void operationA() {
        //已有的功能实现
    }
}
