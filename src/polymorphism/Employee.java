package polymorphism;

public class Employee {

/*
OVERLODING - NẬP CK
ĐKIEN NẠP CK
1. Cần :
    - Các phg thức nạp ck phải trong cùng 1 lớp
    - Các phương thức phải cùng tên
2. Đủ :
    - Số lượng tham số khác nhau
    - Thứ tự tham số khác nhau
    - Kiểu dữ liệu tham số khác nhau
* */

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int add(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

    public float add(float firstNumber, float secondNumber) {
        return firstNumber + secondNumber;
    }

    public void test(int number, String str) {

    }

    public void test(String str, int number) {}
}
