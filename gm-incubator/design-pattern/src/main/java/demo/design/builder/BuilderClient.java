package demo.design.builder;

public class BuilderClient {

    public static void main(String[] args) {

        Builder mordenBuilder = new MordenBuilder();
        Builder traditionBuilder = new TraditionBuilder();

        Director director1 = new Director(mordenBuilder);
        Product product1 = director1.build();
        product1.show();


        Director director2 = new Director(traditionBuilder);
        Product product2 = director2.build();
        product2.show();

    }

}
