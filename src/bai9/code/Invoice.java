package bai9.code;

public class Invoice implements Ipayable {
    private String itemName;
    private  int quantity;
    private double pricePerItem;

    public Invoice(String itemName, int quantity, double pricePerItem) {
        this.itemName=itemName;
        this.quantity=quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }

    public String getItemName() {
        return itemName;
    }
}
