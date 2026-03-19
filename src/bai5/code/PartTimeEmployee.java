package bai5.code;

public class PartTimeEmployee extends Employee1 {
    private int workingHours;
    private double hourlyRate;
    public PartTimeEmployee(String id, String name, String dob, int workingHours, double hourlyRate) {
        super(id, name, dob);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
        }
        @Override
        public double calculateSalary() {
            return workingHours * hourlyRate;
        }
        @Override
        public String info() {
        return "Part-time";
        }
}
