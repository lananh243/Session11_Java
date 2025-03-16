package Bai3;

public class Car extends Vihicle{
    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void displayInfo(){
        System.out.println("Tên xe máy: "+getName()+", Tốc độ: "+getSpeed());
    }
}
