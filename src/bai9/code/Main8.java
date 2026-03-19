package bai9.code;
import java.util.*;
public class Main8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Ipayable[] list = new Ipayable[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();

            if (type.equals("S")) {
                String id = sc.next();
                String name = sc.next();
                int hours = sc.nextInt();
                double rate = sc.nextDouble();

                list[i] = new PartTimeStaff(id, name, hours, rate);

            } else if (type.equals("I")) {
                String item = sc.next();
                int quantity = sc.nextInt();
                double price = sc.nextDouble();

                list[i] = new Invoice(item, quantity, price);
            }
        }

        double total = 0;

        for (Ipayable p : list) {
            double payment = p.getPaymentAmount();

            if (p instanceof PartTimeStaff) {
                PartTimeStaff s = (PartTimeStaff) p;
                System.out.println("PartTimeStaff " + s.getName() + " - Payment: " + payment);

            } else if (p instanceof Invoice) {
                Invoice inv = (Invoice) p;
                System.out.println("Invoice " + inv.getItemName() + " - Payment: " + payment);
            }

            total += payment;
        }

        System.out.println("Total Payment = " + total);
    }

}
