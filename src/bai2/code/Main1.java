package bai2.code;
public class Main1 {
public static void main(String[] args) {
    Animal[] zoo = new Animal[4];
    zoo[0] = new Dog();
    zoo[1] = new Cat();
    zoo[2] = new Duck();
    zoo[3] = new Dog();
    for(int n=0; n<4; n++){
        zoo[n].makeSound();
    }
    // bài 3.4
    Animal a = new Dog();
    if (a instanceof Cat) {
        Cat c = (Cat) a;
        c.makeSound();
    } else {
        System.out.println("Đây không phải là Mèo!");}
}
}