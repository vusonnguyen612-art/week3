package bai6.code;

public class Electronic extends Product{
    private double fee;

    public Electronic(String id, String name, double price,double fee) {
        super(id, name, price);
        this.fee=fee;
    }
    @Override
    public double getFinalPrice(){
        return price*1.1+fee;
    }
}
