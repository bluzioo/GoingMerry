package demo.design.strategy;

public class StrategyContext {

    private Strategy strategy;

    public StrategyContext(StragegyType type) {
        switch (type) {
            case NORMAL:
                strategy = new NormalStrategy();
                break;
            case EIGHT_DISCOUNT:
                strategy = new DiscountStrategy(0.8);
                break;
            case ONE_HUNDRED_RETURN:
                strategy = new ReturnStrategy(100, 20);
                break;
            default:
                break;
        }
    }

    public double getResult(double money){
        return strategy.acceptMoney(money);
    }


}
