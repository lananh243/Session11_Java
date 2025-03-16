package Bai6;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAnimal() {
        for (Animal animal : animals) {
            animal.sound();
            animal.move();
        }
    }

}
