package Bai8;

public abstract class Car {
    public String model;
    public int year;
    public double price;

    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public abstract void start();
    public abstract void stop();
}
