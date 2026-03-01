package Lesson_6_arrays;

import java.lang.String;

public class HW_6_SP {

    public static void main(String[] args) {
        /*
    4. Дана строка:
String s = “Перестановочный алгоритм быстрого действия”;
необходимо вывести все буквы “о” из этой строки.
Для указанной строки ответ будет “ооооо” (или в столбик)
     */
//        String s = "Перестановочный алгоритм быстрого действия";
//        for (int i =0; i < s.length(); i++){
//            if (s.charAt(i) == 'о'){
//                System.out.print(s.charAt(i));
//            }
//        }

        /*
        5. Дана строка:
String s = “Перевыборы выбранного президента”;
необходимо подсчитать количество букв “е” в строке.
Для указанной строки ответ будет 4.
         */
//        String s = "Перевыборы выбранного президента";
//        int sum = 0;
//        for (int i = 0; i <s.length(); i++){
//            if (s.charAt(i) == 'е'){
//                sum = sum +1;
//            }
//        }
//        System.out.println(sum);
        /*
        6. Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести сумму всех значений массива.
         */
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//
//        int sum = 0;
//        for (int i = 0; i < array.length; i++){
//            sum = sum + array[i];
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
//            int[] sub = array[i];
//            for(int j = 0; j < sub.length; j++){
//                sum += sub[j];
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

        /*
        9. необходимо вывести количество элементов в массиве.
         */
//        int[][] array = {
//                {1, 2, 3, 4, 5},
//                {6, 7, 8, 9},
//                {-1, -2, -3, -4},
//                {-5, -6}};
//
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

//        int[] temps = {18, 20, 17, 19, 16, 15, 21};
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

        int first = arr [0];
        for( int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];// берём значение справа
            System.out.print(arr[i]);
        }
        arr[arr.length - 1]  = first; // ставим первый элемент в конец
        System.out.println(first);
    }
}
