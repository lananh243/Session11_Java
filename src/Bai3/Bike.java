package Bai3;

public class Bike extends Vihicle{
    public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void displayInfo(){
        System.out.println("Tên xe đạp: "+getName()+ ", Tốc độ: "+getSpeed());
    }
}
