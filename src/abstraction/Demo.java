package abstraction;

public class Demo {
    public static void main(String[] args) {
//        Khởi tạo đối tượng Person gián tiếp từ lớp Person
        Person person = new Person() {
            @Override
            public int addTwoNumbers(int firstNumber, int secondNumber) {
                return firstNumber + secondNumber;
            }

            @Override
            public void hello() {
                System.out.println("hello world");
            }
        };
    }
}
