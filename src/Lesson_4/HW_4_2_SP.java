package Lesson_4;

/*
Необходимо возводить в степень число 5 начиная с показателя 1,
 пока результат возведения в степень меньше 10000,
 вывести результат каждого возведения в степень.
 */
public class HW_4_2_SP {
    public static void main(String[] args) {

       int result = 1;
       for (int exp = 1; result <= 10000; exp = exp+1){
           result *= 5;
           System.out.println("5^" + exp + "=" + result);
       }
        System.out.println("Done!");
    }

}


