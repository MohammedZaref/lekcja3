package Future.Collars;

public class BaseEmployee {
    private String firstName;
    private String lastName;
    int workingYears;
    final int salary = 3000;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearsOfEmployment() {
        return workingYears;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYearsOfEmployment(int yearsOfEmployment) {
        this.workingYears = yearsOfEmployment;
    }

}
