package bai5.code;
import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Employee1[] list = new Employee1[n];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();

            char type = line.charAt(0);

            int first = line.indexOf("\"");
            int last = line.lastIndexOf("\"");
            String name = line.substring(first + 1, last);

            String[] parts = line.substring(last + 1).trim().split(" ");

            if (type == 'F') {
                double base = Double.parseDouble(parts[0]);
                double bonus = Double.parseDouble(parts[1]);
                double penalty = Double.parseDouble(parts[2]);

                list[i] = new FullTimeEmployee(name, "N/A", "N/A", base, bonus, penalty);

            } else {
                int hours = Integer.parseInt(parts[0]);
                double rate = Double.parseDouble(parts[1]);

                list[i] = new PartTimeEmployee(name, "N/A", "N/A", hours, rate);
            }
        }

        for (Employee1 e : list) {
            if (e instanceof FullTimeEmployee) {
                System.out.println(e.getName() + " - Full-time - " + e.calculateSalary());
            } else {
                System.out.println(e.getName() + " - Part-time - " + e.calculateSalary());
            }
        }
    }
}
