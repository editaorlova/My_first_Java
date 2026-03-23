package Lesson_10_polymorphism;

import HW_10.src.Lesson_10_polymorphism.Dogs.Chihuahua;
import HW_10.src.Lesson_10_polymorphism.Dogs.Dog;

public class PetOwner {

void feed(Dog dog) {
    System.out.println("Giving" + dog.getName() + " food");
    dog.eat();
    }

    void feed(Dog dog, String text) {
        System.out.println(text);
        dog.eat();
    }

    void feed(String text, Dog dog) {
        System.out.println(text);
        dog.eat();
    }

    void feed(Chihuahua chihuahua) {
        System.out.println("Giving" + chihuahua.getName() + " expensive food ");
        chihuahua.eat();
    }
    // Это все разные методы
}
