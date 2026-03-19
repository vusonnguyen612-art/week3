package bai1.code;
public class Manager extends Employee{
    String department;
    public Manager(String name,double salary, String departmant) {
        super(name,salary );
        this.department=departmant;
        System.out.println("3.Manager is create");
    }
}
