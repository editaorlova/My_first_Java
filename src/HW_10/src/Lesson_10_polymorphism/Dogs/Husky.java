package HW_10.src.Lesson_10_polymorphism.Dogs;

public class Husky extends Dog {

    public Husky(String name) {
        super(name);// 1й строкой вызывается обязательно родительский конструктор
        // потом остальная инициализация, которая есть конкретно для хаски
    }

    String getBreed() {
        return "Husky";
    }

    @Override
    String getWhatISay() {
        return "AAAAAAAAAAAAAA";
    }

    void behaveFoolishly() {
        System.out.println("I'm a big dummy");
    }
}
