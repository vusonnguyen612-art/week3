package bai6.code;

import java.time.LocalDate;
import java.util.*;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so luong oder");
        int n= sc.nextInt();
        sc.nextLine();


        order order = new order(n);
        for(int i=0; i<n; i++){
            System.out.println("nhap kieu san pham F/E");
            String c= sc.nextLine();

            System.out.print("Nhap id: ");
            String id = sc.nextLine();

            System.out.print("Nhap ten:");
            String name = sc.nextLine();


            System.out.print("Nhap gia: ");
            double price = Double.parseDouble(sc.nextLine());

            if(c.equals("F")){
                System.out.print("Nhap ngay het han (yyyy-MM-dd): ");
                LocalDate date = LocalDate.parse(sc.nextLine());
                order.addProduct(new Food(id,name, price, date));
            }
            else if (c.equals("E")) {
                System.out.print("Nhap phi bao hanh: ");
                double fee = Double.parseDouble(sc.nextLine());
                order.addProduct(new Electronic(id,name, price, fee));
            }
        }
        order.printOrder();
        System.out.println("Total: " + order.getTotalPrice());
    }
}