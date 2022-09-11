package Future.Collars;

import java.util.Calendar;

public class BaseEmployee {
    private String firstName;
    private String lastName;
    int workYear;
    final int salary = 3000;
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearsOfEmployment() {
        return workYear;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYearsOfEmployment(int workYear) {
        this.workYear = workYear;
    }

    public int calculateTotalWorkingYears() {
        return currentYear - workYear;
    }
}
