package Bai7;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    public void calculateSalary() {
        System.out.println("Tiền lương của nhân viên full-time là: "+8 * getPaymentPerHour());
    }
}
