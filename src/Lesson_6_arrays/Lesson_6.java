package Lesson_6_arrays;

import java.lang.String;

public class Lesson_6 {
    public static void main(String[] args) {
        int[] boxes = { 59, 60, 63, -55, 60, 61, 63, -2};

//        int sum = 0;
//        for (int i = 0; i < boxes.length; i++){
//            sum = sum + boxes[i];
//        }
//        System.out.println(sum * 1.0/ boxes.length);
//
//        /*
//        для отрицательных
//         */
//        int max = Integer.MIN_VALUE; //проверка на пустой массив
//        for (int i = 0; i < boxes.length; i++){
//            if (boxes [i] > max) {
//                max = boxes[i];
//            }
//        }
//        System.out.println(max);
//
//        /*
//       проверка пустого массива + поиск максимального/мин значения
//         */
//        if (boxes.length == 0){
//            System.out.println("No boxes found");
//        }
//        int min = boxes[0];
//        for (int i = 0; i < boxes.length; i++){
//            if (boxes [i] < min) {
//                min = boxes[i];
//            }
//        }
//        System.out.println(min);

//        /*
//        какая коробка сильно-сильно отличается от всех
//        1. Найти среднее
//        2. Найти дельту, записать в переменную
//        3. Вывести максимальную дельту
//         */
//        if (boxes.length == 0){
//            System.out.println("No boxes found");
//        return;
//        }
//            double average = sum * 1.0/ boxes.length;
//        System.out.println("Average box size: " + average);
//
//            double maxDelta = 0;
//            int outlier = 0;
//            for (int i = 0; i < boxes.length; i++){
//                double currentdelta = Math.abs(boxes[i] - average);
//                if (currentdelta > maxDelta) {
//                    maxDelta = currentdelta;
//                    outlier = boxes[i];
//                }
//                }
//        System.out.println(outlier);
//        System.out.println(maxDelta);
//            }
        /*
        Найти значение, соответствующее условию
//         */
//            boolean exists = false;
//            for (int i = 0; i < boxes.length; i++){
//                int currentBox = boxes[i];
//                System.out.println("Looking at: " + i);
//                if (currentBox == 60) {
//                    exists = true;
//                    break; /* оператор прерывает выполнение */
//                }
//            }
//        System.out.println("Exists: " + exists);

        /*
        Заменить значения в массиве
         */

//        System.out.println(Arrays.toString(boxes));
//
//        for (int i = 0; i < boxes.length; i++){
//            int element = boxes[i];
//            if (element < 0) {
//                boxes[i] = -element;
//            }
//        }
//        System.out.println(Arrays.toString(boxes));
//
//        /*
//        оператор континью - прерывает выполнение тек итерации и запускает на след.-  пропусти все до конца цикла
//         */
//
//        System.out.println(Arrays.toString(boxes));
//
//        for (int i = 0; i < boxes.length; i++){
//            int element = boxes[i];
//            if (element >= 0) {
//                continue;
//            }
//            boxes[i] = -element;
//        }
//        System.out.println(Arrays.toString(boxes));

        /* вложеннные массивы, посчитать, сколько всего прошел шагов*/
        int[][] steps = {
                {3030, 2500, 1000},
                {3500, 3200},
                {2342, 3454, 5879, 4354}
        };

//        int sum = 0;
//        for (int i =0; i < steps.length; i++){
//            int[] days = steps[i];
//            for (int j =0; j < days.length; j++){
//                sum += days[j];
//            }
//        }
//        System.out.println(sum);

        /*
        сумма за каждую неделю
         */
//        int total = 0;
//        for (int i =0; i < steps.length; i++){
//            int sum = 0;
//            int[] days = steps[i];
//            for (int j =0; j < days.length; j++){
//                sum += days[j];
//            }
//            System.out.println(sum);
//            total += sum;
//        }
//        System.out.println("Total is: " + total);

        /*матрица: вывести элементы по диагонали*/
//        int[][] matrix = {
//                { 1, 2, 3 },
//                { 4, 5, 6 },
//                { 7, 8, 9 }
//        };
//        for (int i =0; i < matrix.length; i++){
//            System.out.println(matrix[i][i]);
//            }
        }
    }
