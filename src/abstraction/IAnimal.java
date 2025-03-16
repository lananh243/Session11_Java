package abstraction;

import java.util.Scanner;

public interface IAnimal {
    public static final String NAME = "Animal";
    int AGE = 3;
//    Các phương thức trừu tượng
    public abstract void inputData(Scanner scanner);


}
