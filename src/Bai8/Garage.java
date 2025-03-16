package Bai8;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    public List<Car> cars = new ArrayList<>();
    public void addCar(Car car) {
        cars.add(car);
    }

    public void showData() {
        for (Car car : cars) {
            car.start();
            car.stop();
            if (car instanceof Refuelable) {
                ((Refuelable) car).refuel();
            }

            System.out.println("----------------------------");
        }
    }
    
}
