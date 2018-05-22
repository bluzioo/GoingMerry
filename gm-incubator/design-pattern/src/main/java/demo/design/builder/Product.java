package demo.design.builder;

public class Product {

    private String roof;

    private String ceil;

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getCeil() {
        return ceil;
    }

    public void setCeil(String ceil) {
        this.ceil = ceil;
    }


    public void show() {
        System.out.println( roof + " and " + ceil);
    }
}
