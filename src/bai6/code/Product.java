package bai6.code;

public class Product {
    protected String id;
    protected String name;
    protected double price;

    public Product(String id, String name , double price) {
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public double getFinalPrice(){
        return price;
    }

    public String getName() {
        return name;
    }
}
