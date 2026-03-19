package bai1.code;
public class Employee extends Person{
    double salary;
    public Employee(String name, double salary) {
        super(name);
        this.salary=salary;
        System.out.println("2.Employee is created");
    }
}
