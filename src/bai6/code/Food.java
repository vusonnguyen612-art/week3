package bai6.code;

import java.time.LocalDate;
public class Food extends Product{
    private LocalDate date;
    public Food(String id, String name, double price, LocalDate date) {
        super(id, name, price);
        this.date = date;
    }
    @Override
    public double getFinalPrice(){
        LocalDate today= LocalDate.now();
        LocalDate discount= date.minusDays(7);
        if(!today.isBefore(discount) && !today.isAfter(date)){
            return price*0.8;
        }
        else{
            return price;
        }
    }

}
