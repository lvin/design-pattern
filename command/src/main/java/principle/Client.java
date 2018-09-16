package principle;

/**
 * @autor wensen
 * @since 2018/1/22
 */
public class Client {

    public void assemble() {
        //创建命令对象
        Receiver receiver = new Receiver();

        //创建命令对象，设定它的接收者
        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.runCommand();



    }
}
