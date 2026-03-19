package bai7.code;

public class Standard extends Room {
    public Standard(int night) {
        super(night, 500000);
    }

    @Override
    public double getPrice(){
        double total= night*price;
        if (night>3){
            total=total*0.95;
        }
        return total;
    }
}
