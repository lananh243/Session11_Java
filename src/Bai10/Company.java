package Bai10;

import java.util.ArrayList;
import java.util.List;

public class Company {

    List<Employee> companies = new ArrayList<>();

    public void addCompany(Employee emp){
        companies.add(emp);
    }

    public void showData(){
        for(Employee emp:companies){
            emp.work();
            emp.takeVacation();
            if (emp instanceof AttendMeeting) {
                ((AttendMeeting) emp).attendMeeting();
            }
            System.out.println("----------------------------------");
        }
    }
}
