package Bai10;

public class Developer extends Employee{
    public Developer(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("Lập trình viên " +getName()+ "(Lương: $" +getSalary()+ ") đang viết code cho hệ thống mới");
    }

    @Override
    public void takeVacation() {
        System.out.println("Lập trình viên " +getName()+ "(Lương: $" +getSalary()+ ") đang đi nghỉ phép ở Bali");
    }
}
