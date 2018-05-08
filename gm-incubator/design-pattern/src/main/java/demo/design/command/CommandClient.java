package demo.design.command;

/**
 * 命令模式客户端
 */
public class CommandClient {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        Command hello = new HelloCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(hello);

        invoker.executeCommand();

    }
}
