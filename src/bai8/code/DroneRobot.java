package bai8.code;

public class DroneRobot extends Robot implements Flyable,GPS {
    public DroneRobot(int id, String modelName) {
        super(id, modelName);
    }
    @Override
    public void performMainTask(){
        System.out.println("drone dang giam sat");
    }
    @Override
    public void fly(){
        System.out.println("drone dang bay");
    }
    @Override
    public void getCoordinates(){
        System.out.println("drone dang lay toa do");
    }
}
