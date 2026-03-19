package bai8.code;

public class FishRobot extends Robot implements Swimmable{
    public FishRobot(int id, String modelName) {
        super(id, modelName);
    }
    @Override
    public void Swim(){
        System.out.println("FishRobot dang boi");
    }
    @Override
    public void performMainTask(){
        System.out.println("FishRobot dang tham hiem dai duong");
    }
}
