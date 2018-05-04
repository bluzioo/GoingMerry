package demo.design.strategy;

public class StrategyClient {

    public static void main(String[] args) {
        StrategyContext context = new StrategyContext(StragegyType.ONE_HUNDRED_RETURN);

        double result = context.getResult(140);
        System.out.println(result);

    }
}
