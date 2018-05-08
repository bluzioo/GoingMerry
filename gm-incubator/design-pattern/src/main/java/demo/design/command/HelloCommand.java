package demo.design.command;

public class HelloCommand extends Command {

    public HelloCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    void execute() {
        receiver.sayHello();
    }
}
