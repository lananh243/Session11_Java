package Bai6;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();

        Elephant elephant = new Elephant();

        Zoo zoo = new Zoo();
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);

        zoo.showAnimal();
    }
}
