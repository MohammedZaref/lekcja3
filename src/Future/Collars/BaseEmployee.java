package Future.Collars;

import java.util.Calendar;

public class BaseEmployee {
    private String firstName;
    private String lastName;
    private double salary = 3000;
    private int workingYears;


    BaseEmployee(String firstName, String lastName, double salary, int workingYears) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.workingYears = workingYears;
    }

    void raiseSalary() {
        this.salary += 2000;
    }
}
