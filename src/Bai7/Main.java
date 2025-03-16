package Bai7;

public class Main {
    public static void main(String[] args) {
        Employee partTimeEmp = new PartTimeEmployee("Nguyễn Văn A",20000, 4);
        Employee fullTimeEmp = new FullTimeEmployee("Trần Thị B",35000);

        partTimeEmp.calculateSalary();
        System.out.println("---------------------");
        fullTimeEmp.calculateSalary();
    }
}
