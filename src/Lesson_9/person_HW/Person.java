package Lesson_9.person_HW;
/*
Задача №1

Необходимо создать класс Person с полями: имя, возраст, пол.
Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ”
если пол указан как мужской и префикс “Mrs. ” если женский.

 */

public class Person {

    private String name;
    private int age;
    private char gender;

//    public Person(String name, int age, char gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }

    public String getName(){
        if(gender == 'M'){
            return "Mr. " + name;
        }else{
            return "Ms. " + name;
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        this.gender = gender;
    }
}
