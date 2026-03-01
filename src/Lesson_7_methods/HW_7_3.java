package Lesson_7_methods;
/*
https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java
We need a function that can transform a number (integer) into a string.

What ways of achieving this do you know?
 */

public class HW_7_3 {

    public static String numberToString(int num) {
//        return String.valueOf(num);
        return "\"" + num + "\"";
    }

    public static void main(String[] args) {
        System.out.println(numberToString(8));

    }
}
