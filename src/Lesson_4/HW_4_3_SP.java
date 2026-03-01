package Lesson_4;

public class HW_4_3_SP {
    /*
    Необходимо вывести все числа кратные 4 между числами
     40 и 60 включительно.
Реализовать 2 варианта:
использовать конструкцию if для определения кратности
(цикл с шагом 1, i = i + 1);
без использования конструкции if
(шаг цикла на ваше усмотрение).

     */
//    public static void main(String[] args) {
//        for (int i = 40; i <= 60; i++)
//        {
//           if (i % 4 == 0){
//               System.out.println(i);
//           }
//        }
//        System.out.println("Done!");
//    }
//}
    public static void main(String[] args) {
    int a=40;
    while (a <= 60){
        if(a % 4 == 0){
            System.out.println(a);
        }
        a = a + 3;
    }
        System.out.println("Done!");
    }
}
