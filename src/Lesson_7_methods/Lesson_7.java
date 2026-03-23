package Lesson_7_methods;

/*
Объекты начинаются с большой буквы. Для них нелья использовать =, == - тут использутся метод equals

int a  - примитивный вид (класс), там при вызове подсказок метод я не могу вызвать
 */
public class Lesson_7 {

    public static void print(String text){ //надо создавать метод за скобками. Метод - это поименованный блок кода, его можно вызвать сколько
        // угодно раз в программе
        System.out.println(text);
    }

    public static void sumAndPrint(int a, int b){
        System.out.println(a + b);
    }

    public static void printNumber(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {


//        String s1 = "123";
//        String s2 = "123";
//
//        System.out.println(s1.equals(s2));
//
//        int a = 1000;
//        int b = 1000;
//
//        // - 128..127 - все целочисленные объекты кешируются и равны, если использовать ==, поэтому надо использовать equals - тогда любые числа сравниваются корректно
//        Integer A = 1000;
//        Integer B = 1000;
//        Integer C = -129;
//        Integer D = -129;
//
//
//        System.out.println(a == b);
//        System.out.println(A == B);
//        System.out.println(C == D);
//        ------------------------------------------
        /*
        Можно создавать свои пользовательские методы
         */

        String s = "Hello";

        String newS = s.replace('H', '!');

        System.out.println(s);
        System.out.println(newS);


//        print(s);
//
//        sumAndPrint(1, 2);
//        sumAndPrint(5, 2);
//
//        printNumber(5);
//        printNumber(2);
    }

}

