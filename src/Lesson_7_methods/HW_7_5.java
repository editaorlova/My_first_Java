package Lesson_7_methods;

/*
https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
Task:
Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.
 */

public class HW_7_5 {

    /* 1 */
    public static String countingSheep(int num) {

        String result = "";
        for(int i = 1; i <= num; i++) {

            result = result + i + " sheep...";
        }
        return result;
    }

    /* 2 */
//    public static String countingSheep(int num) {
//        String text = " sheep...";
//        String result = "";
//        int i = 1;
//        while (i <= num){
//            result = result + i + text;
//            i++;
//        }
//        return result;
//    }

    public static void main(String[] args) {
        System.out.println(countingSheep(3));

    }
}
