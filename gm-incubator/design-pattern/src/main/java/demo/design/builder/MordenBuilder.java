package demo.design.builder;

public class MordenBuilder implements Builder {

    Product product = new Product();

    @Override
    public void buildRoof() {
        product.setRoof("morden roof");
    }

    @Override
    public void buildCeil() {
        product.setCeil("morden ceil");
    }

    @Override
    public Product getResult() {
        return product;
    }


}
