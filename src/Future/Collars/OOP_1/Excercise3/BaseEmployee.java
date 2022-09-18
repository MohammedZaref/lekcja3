package Future.Collars.OOP_1.Excercise3;

import java.util.Calendar;

public class BaseEmployee {
    private String name;
    private final double wage;
    private final int yearOfHiring;

    public BaseEmployee(String name, int wage, int hiringYear) {
        this.name = name;
        this.wage = 3000;
        this.yearOfHiring = hiringYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }

    public int getHiringYear() {
        return yearOfHiring;
    }

    public int calculateWorkingPeriod () {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - this.yearOfHiring;
    }
  }

