package bai6.code;

public class order {
    private int count;
    private Product[] list;

    public order(int size) {
        list= new Product[size];
        count = 0;
    }
    public void addProduct(Product p) {
        if (count < list.length) {
            list[count] = p;
            count++;
        } else {
            System.out.println("Order is full!");
        }
    }
    public double getTotalPrice() {
        double total = 0;

        for (int i = 0; i < count; i++) {
            total += list[i].getFinalPrice();
        }
        return total;
    }
    public void printOrder() {
        for (int i = 0; i < count; i++) {
            Product p = list[i];
            double price = p.getFinalPrice();

            if (p instanceof Electronic) {
                System.out.println(p.getName() + " - Electronics - " + price);
            } else {
                System.out.println(p.getName() + " - Food - " + price);
            }
        }
    }
}
