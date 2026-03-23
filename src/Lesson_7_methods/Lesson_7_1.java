package Lesson_7_methods;

public class Lesson_7_1 {

    public static int sum(int a, int b) {

        int c = a + b;

        return c; // если в методе указали, что должно возвращать (int в моем методе), то обязательно прописывать return. если заглушка void,
        // то return не нужен
    }

    public static void main(String[] args) {

        int result = sum(5, 4);

        System.out.println(result);
    }
}
