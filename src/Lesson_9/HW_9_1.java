package Lesson_9;

import Lesson_9.person_HW.Employee;
import Lesson_9.person_HW.Person;
import Lesson_9.person_HW.Salary;

/*
Задача №1
Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.

Задача №2
Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата. Класс должен иметь метод isSameName(Employee employee) который возвращает true, если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.


Задача №3
Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray), метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.

 */

public class HW_9_1 {
    public static void main(String[] args) {


        Person person1 = new Person();
        person1.setName("Ivan");
        person1.setAge(37);
        person1.setGender('M');

        Person person2 = new Person();
        person2.setName("Elena");
        person2.setAge(37);
        person2.setGender('F');

//        Person person1 = new Person("Ivan", 37, 'M');
//        Person person2 = new Person("Elena", 37, 'F');
//
        System.out.println(person1.getName());
        System.out.println(person2.getName());

        Employee employee1 = new Employee();
        employee1.setName("Ivan");
        employee1.setAge(37);
        employee1.setGender('M');
        employee1.setSalary(1000);

        Employee employee2 = new Employee();
        employee2.setName("Elena");
        employee2.setAge(37);
        employee2.setGender('F');
        employee2.setSalary(1100);

//        Employee employee1 = new Employee("Ivan", 37, 'M', 1000);
//        Employee employee2 = new Employee("Elena", 37, 'F', 1100);
//
        System.out.println(employee1.isSameName(employee2));

        Employee[] employees= { employee1, employee2 };

        Salary salary = new Salary();
        int total = salary.getSum(employees);
        System.out.println(total);

    }
}
