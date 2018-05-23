package demo.design.facade;

public class Facade {

    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();

    public void methodA() {
        subSystemA.methodB();
        subSystemB.methodD();

    }


    public void methodB() {
        subSystemA.methodA();
        subSystemB.methodC();

    }

}
