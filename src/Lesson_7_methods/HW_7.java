package Lesson_7_methods;

public class HW_7 {
    /*
        Необходимо написать 4 метода:
    сложение 2х чисел
    вычитание 2х чисел
    умножение 2х чисел
    деление 2х чисел
     */

    public static int sumVar(int a, int b) {
        return a + b;
    };

    public static int subtraction(int a, int b) {
        return a - b;

    };

    public static double division(int a, int b) {
        if(b == 0){
            System.out.println("Делить на ноль нельзя");

            return Double.NaN;
        }
        return (double) a / b;
    };

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        System.out.println("Sum: " + sumVar(2,19));
        System.out.println("Subtraction: " + subtraction(15,6));
        System.out.println("Dividion: " + division(10, 0));
        System.out.println("Multiplication: " + multiplication(45, 15));

    }
}
