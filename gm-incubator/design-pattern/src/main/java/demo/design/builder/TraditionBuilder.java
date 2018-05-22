package demo.design.builder;

public class TraditionBuilder implements Builder {
    Product product = new Product();

    @Override
    public void buildRoof() {
        product.setRoof("tradition roof");
    }

    @Override
    public void buildCeil() {
        product.setCeil("tradition ceil");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
