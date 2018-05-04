package demo.design.chain;

public class SecondHandler extends Handler {


    @Override
    public void handle(int request) {
        if (request > 10 && request < 20) {
            System.out.println("second handler deal the number " + request);
        } else if (successor != null) {
            successor.handle(request);
        }

    }
}
