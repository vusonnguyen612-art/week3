package bai10.code;
import java.util.*;
public class Main10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String type = sc.next();

            if (type.equals("E")) {
                String name = sc.next();
                double salary = sc.nextDouble();
                list.add(new Employee(name, salary));

            } else if (type.equals("D")) {
                String name = sc.next();
                double salary = sc.nextDouble();
                int overtime = sc.nextInt();
                list.add(new Developer(name, salary, overtime));

            } else if (type.equals("T")) {
                String name = sc.next();
                double salary = sc.nextDouble();
                int bugs = sc.nextInt();
                list.add(new Tester(name, salary, bugs));
            }
        }

        for (Employee e : list) {
            double bonus = e.calculateBonus();

            System.out.println(e.getName() + " - Bonus: " + bonus);

            if (e instanceof Developer) {
                System.out.println("Tặng  AWS");
            } else if (e instanceof Tester) {
                System.out.println("Tặng tool Test");
            }

            System.out.println();
        }
    }
}
