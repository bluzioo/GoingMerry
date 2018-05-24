package demo.design.decorator;

public class PantsDecorator extends Decorator {

    public void show() {
        this.component.show();
        System.out.println("Pants ");
    }


}
