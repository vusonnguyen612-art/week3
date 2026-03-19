package bai8.code;

public abstract class Robot {
    private int id;
    private String modelName;
    private int batteryLevel;

    public Robot(int id, String modelName) {
        this.id=id;
        this.modelName=modelName;
        this.batteryLevel=60;
    }
    public void chargeBattery(){
        batteryLevel=100;
        System.out.println("pin da day");
    }
    public final void showIdentity() {
        System.out.println("Robot ID: " + id + " | Model: " + modelName);
    }
    public abstract void performMainTask();

}
