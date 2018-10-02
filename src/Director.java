public class Director extends Employee {
    private int bonus;

    public Director(String firstName, String lastName, int salary, int bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    void showInfo()  {
        int totalSalary = getSalary() + getBonus();
        System.out.println(getFirstName() + " " + getLastName() + " " + totalSalary);
    }



}
