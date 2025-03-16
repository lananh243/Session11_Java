package Bai7;

public class PartTimeEmployee extends Employee {
    private int workingHours;


    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Tiền lương của nhân viên part-time là: "+this.workingHours * getPaymentPerHour());
    }
}
