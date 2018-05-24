package demo.design.decorator;

public class Decorator extends Person {

    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

}
