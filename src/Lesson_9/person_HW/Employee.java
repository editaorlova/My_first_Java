package Lesson_9.person_HW;

public class Employee extends Person {

    private int salary;

//    public Employee(String name, int age, char gender, int salary) {
//        setName(name);
//        setAge(age);
//        setGender(gender);
//        this.salary = salary;
//    }
    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public boolean isSameName(Employee employee){
        if(this.getName().equals(employee.getName())) {
            return true;
        }else {
            return false;
        }
    }
}


