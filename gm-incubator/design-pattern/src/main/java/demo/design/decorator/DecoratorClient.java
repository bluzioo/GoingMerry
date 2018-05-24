package demo.design.decorator;

public class DecoratorClient {

    public static void main(String[] args) {
        Person person = new Person("admin");

        TshirtDecorator td = new TshirtDecorator();
        PantsDecorator pd = new PantsDecorator();

        td.decorate(person);
        pd.decorate(td);

        pd.show();
    }
}
