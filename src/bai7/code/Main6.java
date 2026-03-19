package bai7.code;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào loại phòng: 1 --- Standard || 2 --- Vip");
        int type = sc.nextInt();

        System.out.println("Nhập vào số đêm muốn ở:");
        int nights = sc.nextInt();

        Room room;

        if (type == 1) {
            room = new Standard(nights);
        } else {
            room = new Vip(nights);
        }

        double total = room.getPrice();
        System.out.println("Tổng tiền: " + total);

        sc.close();
    }
}