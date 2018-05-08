package demo.design.command;

public class SorryCommand extends Command{
    public SorryCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    void execute() {
        receiver.saySorry();
    }
}
