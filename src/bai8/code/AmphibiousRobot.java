package bai8.code;

public class AmphibiousRobot extends Robot implements Flyable, Swimmable, GPS {

    public AmphibiousRobot(int id, String modelName) {
        super(id, modelName);
    }

    @Override
    public void performMainTask() {
        System.out.println("AmphibiousRobot thuc hien nhiem vu da moi truong");
    }

    @Override
    public void fly() {
        System.out.println("AmphibiousRobot dang bay");
    }

    @Override
    public void Swim() {
        System.out.println("AmphibiousRobot dang boi");
    }

    @Override
    public void getCoordinates() {
        System.out.println("AmphibiousRobot dang lay toa do");
    }
}