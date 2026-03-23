package HW_10.src.Lesson_10_polymorphism.Dogs;

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
