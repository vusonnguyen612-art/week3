package bai7.code;

public abstract class Room {
    protected int night;
    protected double price;

    public Room(int night, double price) {
        this.night=night;
        this.price=price;
    }
    public abstract double getPrice();
}
