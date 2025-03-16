package Bai3;

public abstract class Vihicle {
    private String name;
    private int speed;

    public abstract void displayInfo();

    public Vihicle() {
    }

    public Vihicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void start(){
        System.out.println("Vehicle is starting...");
    }
}
