package Lesson_10_polymorphism;

public class Chihuahua extends Dog{

        private String name;

        public Chihuahua(String name) {
            super(name);
        }

    String getBreed() {
        return "Chihuahua";
    }

    String getWhatISay() {
        return "Yap-yap";
    }
}
