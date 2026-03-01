package Lesson_5_arrays;

public class HW_5_SP {
    public static void main(String[] args) {
        /*
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести все нечетные числа из массива.
                */
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i=0; i < array.length; i++){
            if (array[i] % 2 != 0){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        /*
    Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо вывести все значения массива больше 5.
         */

        for (int i = 0; i < array.length; i++){
            if (array[i] >5){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        /*
            Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо увеличить все значения массива на 15.
         */

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + 15 +" ");
        }

    }
}
