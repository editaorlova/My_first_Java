package Lesson_6_arrays;

import java.lang.String;
import java.lang.reflect.Array;
import java.util.Arrays;

public class HW_6_SP {

    public static void main(String[] args) {
        /*
    4. Дана строка:
String s = “Перестановочный алгоритм быстрого действия”;
необходимо вывести все буквы “о” из этой строки.
Для указанной строки ответ будет “ооооо” (или в столбик)
     */
//        String s = "Перестановочный алгоритм быстрого действия";
//        for (int i = 0; i < s.length(); i++){
//            char c = s.charAt(i);
//            if (c == 'о'){
//                System.out.print(c);
//            }
//        }
//        System.out.println();

        /*
        5. Дана строка:
String s = “Перевыборы выбранного президента”;
необходимо подсчитать количество букв “е” в строке.
Для указанной строки ответ будет 4.
         */
        String s = "Перевыборы выбранного президента";
//      /*1*/
//        int count = 0;
//        for (int i = 0; i <s.length(); i++){
//            if (s.charAt(i) == 'е'){
//                count++;
//            }
//        }
//        System.out.println(count);

        /*2*/
//        int count = 0;
//        int searchFrom = 0;
//        int foundAt = s.indexOf('е');
//        while (foundAt != -1) {
//            count++;
//            searchFrom = foundAt + 1;
//            foundAt = s.indexOf('е', searchFrom);
//        }
//        System.out.println(count);

        /*
        6. Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести сумму всех значений массива.
         */
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//
//        int sum = 0;
//        for (int i = 0; i < array.length; i++){
//            sum += array[i] ;
//        }
//        System.out.println("Sum: " + sum);


        /*
        7. Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести сумму элементов массива.
//         */
//        int[][] array = {
//                {1, 2, 3, 4, 5},
//                {6, 7, 8, 9},
//                {-1, -2, -3, -4},
//                {-5, -6}};

//        int sum = 0;
//        for (int i =0; i < array.length; i++){
//            for(int j = 0; j < array[i].length; j++){
//                sum += array[i][j];
//            }
//        }
//        System.out.println("Total sum: " +sum);

        /*
       8. Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести максимальное значение массива.
         */
//        int[][] array = {
//                {1, 2, 3, 4, 5},
//                {6, 7, 8, 9},
//                {-1, -2, -3, -4},
//                {-5, -6}};
//
        /*1*/
//        int max = array[0][0];
//        for (int i = 0; i < array.length; i++){
//            int[] array1 = array[i];
//
//            for (int j = 0; j < array1.length; j++){
//                if (array1 [j] >max){
//                    max = array1 [j];
//                }
//            }
//        }
//        System.out.println("Max: " + max);

        /*2*/
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                int element = array[i][j];
//                if (element > max) max = element;
//            }
//        }
//        System.out.println(max);

        /*
        9. необходимо вывести количество элементов в массиве.
         */
//        int[][] array = {
//                {1, 2, 3, 4, 5},
//                {6, 7, 8, 9},
//                {-1, -2, -3, -4},
//                {-5, -6}};

//        int totalCount = 0;
//        for (int i = 0; i < array.length; i++){
//            int count = array[i].length;
//            totalCount = totalCount + count;
//            System.out.println("Count in row: " + count);
//        }
//        System.out.println("Total count: " + totalCount);
//        System.out.println("Total rows: " + array.length);


        /*
        10. Даны температуры воздуха за несколько дней:
        int[] temps = {18, 20, 17, 19, 16, 15, 21};
        Необходимо посчитать сколько раз за эти дни температура падала в сравнении с предыдущим днем.
         */

        int[] temps = {18, 20, 17, 19, 16, 15, 21};
//
//
//            int sum = 0;
//            double delta = 0;
//
//        for (int i = 0; i < temps.length; i++){
//            sum += temps[i];
//        }
//        double average = sum *1.0 / temps.length;
//        System.out.println("sum: "+sum);
//        System.out.println("Average: " + average);
//
//
//        for (int i = 0; i < temps.length; i++){
//            double currentDelta = Math.abs(temps[i] - average);
//            System.out.println("Current Delta: " + currentDelta);
//        }
//
//        int countBelowAverage = 0;
//        for (int i =0; i < temps.length; i++){
//            if (temps[i] < average){
//                countBelowAverage = countBelowAverage + 1;
//            }
//        }
//        System.out.println("countBelowAverage: " + countBelowAverage);// температура падала ниже среднего - не то решала
//

//        if (temps.length < 1) {
//            System.out.println("Not enough data");
//            return;
//        }
//
//        int countLower = 0;
//        for (int i = 1; i < temps.length; i++){
//            if (temps[i] < temps[i - 1]){
//            countLower++;
//            }
//        }
//        System.out.println("Tемпература падала в сравнении с предыдущим днем " + countLower + " раз");


        /*  Дан массив:
        int[] arr = {1, 2, 3, 4, 5};

        Необходимо “сдвинуть” этот массив влево на одну позицию так, чтобы получилось:
        {2, 3, 4, 5, 1}

         */
        int[] arr = {1, 2, 3, 4, 5};

/*1*/
//        int[] result = new int [arr.length];
//        for (int i = 1; i < arr.length; i++) {
//            result[i - 1] = arr[i];
//        }
//        result[arr.length - 1] = arr[0];
//        System.out.println(Arrays.toString(result));

/*2*/
        int tmp = arr[0];

        for(int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length-1] = tmp;
        System.out.println(Arrays.toString(arr));
    }
}
