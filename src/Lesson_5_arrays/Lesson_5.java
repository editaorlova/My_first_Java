package Lesson_5_arrays;

import java.lang.String;

public class Lesson_5 {

    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 'А';

//        -----------
//        double d =10.2;
//        int f = (int) d;
//        ------------

//        System.out.println((int)c1);
//        System.out.println((int)c2);
//
//        System.out.println(c1 == c2);
////        ---------
//        System.out.println(c1 + 1);
//        char result = (char)(c1 + 1);
//        System.out.println(result);
//        -------------
//        int a = 10;
//        int[] array = {5, 4, 3};
//        array[0] = 10;
//        System.out.println(array[0]);
//        System.out.println(array.length);
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i] + 1);}
//        System.out.println("-----------");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]++);}
//        System.out.println("-----------");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//            ----------------

//        int[] array = new int[4];
//        for (int i = 0; i < array.length; i++){
//        System.out.println(array[i]);
//        ---------------------
//            int[] array1 = {5, 4};
//            int[] array2 = array1;
//            array2[0] = 10;
//            array1[1] = 20;
//
//            for (int i = 0; i < array1.length; i++){
//                System.out.println(array1[i]);
//        }
//        System.out.println("------");
//        for (int i = 0; i < array2.length; i++){
//            System.out.println(array2[i]);
//        }
//        System.out.println(array1 == array2);
//        --------------------------
//        int[] array1 = {5, 4};
//        int[] array2 = {25, 34};
//        int[] array3 = array2;
//
////        System.out.println(array1 == array2);
////        System.out.println(array1);
////        System.out.println(array2);
//
////        System.out.println(Arrays.toString(array1));
////        System.out.println(Arrays.toString(array2));
//
//        System.out.println(array1 == array2);
//        System.out.println(array2 == array3);
//        System.out.println(array1 == array3);
//        ----------------------------
//                int[] array1 = {5, 6, 7};
//                int[] array2 = new int[array1.length + 1];
//
//                for (int i = 0; i < array1.length; i++){
//                    array2[i] =array1[i];
//                }
//        System.out.println(Arrays.toString(array2));
//        -----------------------------
        /* сумма всех значений */
//        int[] array = {5, 6, 7};
//
//        int sum = 0;
//        for (int i =0; i < array.length; i++){
//            sum = sum + array[i];
//        }
//        System.out.println(sum);
//        -------------------------------
        int[] array1 = {5, 6, 7};

        int sum = 1;
        for (int i =0; i < array1.length; i++){
            sum = sum * array1[i];
        }
        System.out.println(sum);
     }
}
