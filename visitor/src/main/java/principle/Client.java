package principle;

/**
 * @author wensen
 * @since 15/03/2018
 */
public class Client {
    public static void main(String[] args) {
        //创建ObjectStructure
        ObjectStructure os = new ObjectStructure();

        //创建要加入对象结构的元素
        Element elementA = new ConcreteElementA();
        Element elementB = new ConcreteElementB();

        //把元素加入结构对象
        os.addElement(elementA);
        os.addElement(elementB);

        //创建访问者
        Visitor visitor = new ConcreteVisitor1();
        //调用业务处理方法
        os.handleRequest(visitor);
    }
}
