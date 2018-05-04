package demo.design.strategy;

/**
 * 打折
 */
public class DiscountStrategy implements Strategy {

    private double discount;

    public DiscountStrategy(double discount) {
        this.discount = discount;
    }

    @Override
    public double acceptMoney(double money) {
        return money * (1-discount);
    }
}
