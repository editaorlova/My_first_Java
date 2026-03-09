package HW_10;

public class Manager extends Employee{

    private int numberEmployees;

    public Manager(String name, int salaryPerDay){
        super(name, salaryPerDay);
       }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    protected double getBonusPercent() {
        return 0.01;
    }

    @Override
    public int getSalary(Month[] monthArray){
        int baseSalary = super.getSalary(monthArray);
        return (int) (baseSalary * (1 + getBonusPercent() * getNumberEmployees()));
    }
}
