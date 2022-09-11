package Future.Collars;

public class Manager extends BaseEmployee {
    final int extraWage = 2000;
    private int bonus;
    int totalSalary = calculateTotalSalary(200);

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int calculateTotalSalary(int bonus) {
        return extraWage + bonus + salary;
    }
}
