package HW_10;

public class Director extends Manager {

        public Director(String name, int salaryPerDay){
            super (name, salaryPerDay);
        }

        @Override
        protected double getBonusPercent() {
            return 0.03;
        }

        @Override
        public int getSalary(HW_10.Month[] monthArray){
            int baseSalary = super.getSalary(monthArray);
            return (int) (baseSalary * (1 + getBonusPercent() * getNumberEmployees()));
        }
}
