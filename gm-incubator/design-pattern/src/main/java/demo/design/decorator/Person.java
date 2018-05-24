package demo.design.decorator;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    public void show(){
        System.out.println(name + " is wearing ");
    }

}
