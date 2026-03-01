package Lesson_7_methods;

/*
https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
find the smallest integer
 */

public class HW_7_4 {

    public static int findSmallestInt(int[] numbers) {

        int smallest = numbers[0];

        for(int i= 0; i < numbers.length; i++) {
            if (numbers [i] < smallest) {
                smallest = numbers [i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {

        int[] array = {34, -345, -1, 100};
        System.out.println(findSmallestInt(array));
    }
}
