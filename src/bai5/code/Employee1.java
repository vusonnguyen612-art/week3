package bai5.code;

public  abstract class  Employee1 {
    String Name;
    String Date;
    String Id;

    public  abstract String info() ;
    public Employee1(String Name, String Date, String Id) {
        this.Date = Date;
        this.Name=Name;
        this.Id=Id;
    }
    public abstract double calculateSalary();

    public String getName() {
        return Name;
    }
}
