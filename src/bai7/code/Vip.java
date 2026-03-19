package bai7.code;

public class Vip extends Room {
    public Vip(int night) {
        super(night, 2000000);
    }
    @Override
    public double getPrice() {
        return night*price;
    }
}
