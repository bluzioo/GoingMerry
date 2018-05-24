package demo.design.decorator;

public class TshirtDecorator extends Decorator {

    public void show() {
        this.component.show();
        System.out.println("Thirt ");
    }


}
