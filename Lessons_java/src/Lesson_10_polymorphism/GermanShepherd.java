package Lesson_10_polymorphism;

public class GermanShepherd extends Dog{


    public GermanShepherd(String name) {
        super(name);
    }

    String getBreed() {
        return "German Shepherd";
    }
}

