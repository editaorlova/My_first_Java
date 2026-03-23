package HW_10;

public class Employee {

    private String name;
    private int age;
    private String gender;
    private int salaryPerDay;

    public Employee (String name, int salaryPerDay) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
    }

    public String getName() {
        return name;
    }

    public int getSalaryPerDay() {
        return salaryPerDay;
    }

    public int getAge() {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary(Month[] monthArray) {
        int sum = 0;
        for (int i = 0; i < monthArray.length; i++) {

            sum += monthArray[i].getWorkingDays() * getSalaryPerDay();
        }
        return sum;
    }
}
