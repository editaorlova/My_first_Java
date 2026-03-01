package Lesson_8_classes;

import javax.xml.transform.Source;

public class SalaryUtils {

    public static void main(String[] args) {

        Employee ivanov = new Employee();
        ivanov.name = "Ivanov";
        ivanov.age = 27;
        ivanov.sex = "Male";
        ivanov.salaryDay = 90;

        Employee petrova = new Employee();
        petrova.name = "Petrova";
        petrova.age = 30;
        petrova.sex = "Female";
        petrova.salaryDay = 80;

        Month january = new Month();
        january.monthName = "January";
        january.monthDays = 31;
        january.workDays = 22;

        Month february = new Month();
        february.monthName = "February";
        february.monthDays = 28;
        february.workDays = 19;

        Month march = new Month();
        march.monthName = "March";
        march.monthDays = 31;
        march.workDays = 23;

        Month april = new Month();
        april.monthName = "April";
        april.monthDays = 30;
        april.workDays = 22;

        System.out.println(calculateSalaryForOneMonth(ivanov, february));

        Month[] months = { january, february, march, april};
        System.out.println(calculateSalaryForManyMonths(ivanov, months));
        System.out.println(calculateSalaryForManyMonths(petrova, months));
    }


   static String calculateSalaryForOneMonth(Employee employee, Month month){
        return "Salary " + employee.name + " in " + month.monthName +" equals " +
                employee.salaryDay * month.workDays + " у.е.";
    }

    static int calculateSalaryForManyMonths(Employee employee, Month[] months) {
        int sum = 0;
        for ( int i = 0; i < months.length; i++){
            sum += employee.salaryDay * months[i].workDays;
        }
        System.out.print("Salary " + employee.name + " in 4 months ");
        return sum;
    }
}
