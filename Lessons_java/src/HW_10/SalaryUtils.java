package HW_10;

public class SalaryUtils {

    int total = 0;
    public int getTotalSalary(Employee[] employees, Month[] months){
        for ( int i = 0; i < months.length; i++){
            total += employees[i].getSalary(months);
        }
        return total;
    }

}
