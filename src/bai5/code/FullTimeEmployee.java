package bai5.code;

public class FullTimeEmployee extends Employee1 {
    double baseSalary;
    double Bonus;
    double penalty;

    public FullTimeEmployee(String Name, String Date, String Id,double baseSalary,double Bonus,double penalty) {
        super(Name, Date, Id);
        this.baseSalary=baseSalary;
        this.Bonus=Bonus;
        this.penalty=penalty;
    }
    @Override
    public double calculateSalary(){
        return baseSalary+(Bonus-penalty);
    }
    @Override
    public String info(){
        return "Full time";
    }
}
