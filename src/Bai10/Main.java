package Bai10;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Manager manager = new Manager("Alice", 8000);
        Developer developer = new Developer("Bob", 5000);

        company.addCompany(manager);
        company.addCompany(developer);
        company.showData();
    }
}
