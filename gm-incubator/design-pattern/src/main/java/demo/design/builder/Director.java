package demo.design.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product build() {
        builder.buildRoof();
        builder.buildCeil();
        return builder.getResult();
    }



}
