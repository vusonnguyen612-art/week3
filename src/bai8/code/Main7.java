package bai8.code;
import java.util.*;

public class Main7 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        Robot[] robots = new Robot[n];
        for (int i=0; i<n; i++){
            System.out.println("nhap vao loai A/D/F: ");
            String c= sc.nextLine();
            System.out.println("nhap vao id:");
            int id= sc.nextInt();
            sc.nextLine();
            System.out.println("nhap vao ten:");
            String name= sc.nextLine();
            if (c.equals("A")) {
                robots[i] = new AmphibiousRobot(id,name);

            } else if (c.equals("D")) {
                robots[i] = new DroneRobot(id,name);

            } else if (c.equals("F")) {
                robots[i] = new FishRobot(id,name);
            }

        }


        for(Robot r : robots){
            r.performMainTask();
        }

        Robot r = robots[0];

        if(r instanceof Flyable){
            ((Flyable) r).fly();
        }

        if(r instanceof GPS){
            ((GPS) r).getCoordinates();
        }

    }
}