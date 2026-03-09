package Lesson_9.person_HW;
/*Задача №2

Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
Класс должен иметь метод isSameName(Employee employee) который возвращает true,
если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
*/

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


