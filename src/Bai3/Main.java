package Bai3;

public class Main {
    public static void main(String[] args) {
        Vihicle car = new Car("Mercedes", 180);
        Vihicle bike =  new Bike("Twitter", 70);

        car.start();
        car.displayInfo();
        System.out.println("----------------------");
        bike.start();
        bike.displayInfo();
    }
}
