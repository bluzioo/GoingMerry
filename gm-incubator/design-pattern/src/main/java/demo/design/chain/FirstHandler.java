package demo.design.chain;

public class FirstHandler extends Handler {
    @Override
    public void handle(int request) {
        if (request > 0 && request < 10) {
            System.out.println("first handler deal the number " + request);
        } else if (successor != null) {
            successor.handle(request);
        }

    }
}
