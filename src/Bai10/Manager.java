package Bai10;

public class Manager extends Employee implements AttendMeeting{
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Quản lý " +getName()+ "(Lương: $" +getSalary()+ ") đang giám sát dự án");
    }

    @Override
    public void takeVacation() {
        System.out.println("Quản lý " +getName()+ "(Lương: $" +getSalary()+ ") đang đi nghỉ phép tại Pháp");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Quản lý " +getName()+ "(Lương: $" +getSalary()+ ") đang tham gia cuộc họp");
    }
}
