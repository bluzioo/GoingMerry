package demo.design.chain;

public class ChainClient {

    public static void main(String[] args) {
        Handler first = new FirstHandler();
        Handler second = new SecondHandler();
        Handler third = new ThirdHandler();

        first.setSuccessor(second);
        second.setSuccessor(third);

        int[] arr = {23, 3, 14, 29};
        for (int i=0; i< arr.length; i++) {
            first.handle(arr[i]);
        }
    }

}
