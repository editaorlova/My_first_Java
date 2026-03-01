package Lesson_2;

public class HW_2_1_SP {
    public static void main(String[] args) {
        /*Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор и вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание, деление и остаток от деления. Также сделать проверку на четность этих переменных и вывести результат.*/
        int a=15;
        int b=10;

        System.out.print("a+b = ");
        System.out.println(a+b);
        System.out.print("a-b = ");
        System.out.println(a-b);
        System.out.print("a*b = ");
        System.out.println(a*b);
        System.out.print("(int)a/b = ");
        System.out.println(a/b);
        System.out.print("(doubl)a/b = ");
        System.out.println(a*1.0/b);
        System.out.print("a%b = ");
        System.out.println(a%b);

        System.out.print("Is a even? ");
        System.out.println(a % 2 == 0);
        System.out.print("Is b even? ");
        System.out.println(b % 2 == 0);

    }

}
