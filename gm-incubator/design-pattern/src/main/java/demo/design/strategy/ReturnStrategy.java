package demo.design.strategy;

/**
 * 满减
 */
public class ReturnStrategy implements Strategy {

    private double moneyCondition;
    private double moneyReturn;

    public ReturnStrategy(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptMoney(double money) {
        if (money > moneyCondition) {
            return moneyReturn;
        }
        return 0;
    }
}
