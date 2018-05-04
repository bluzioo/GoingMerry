package demo.design.chain;

public class ThirdHandler extends Handler {


    @Override
    public void handle(int request) {
        if (request > 20 && request < 30) {
            System.out.println("third handler deal the number " + request);
        } else if (successor != null) {
            successor.handle(request);
        }

    }
}
