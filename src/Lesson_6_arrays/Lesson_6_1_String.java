package Lesson_6_arrays;

import java.lang.String;

public class Lesson_6_1_String {
    public static void main(java.lang.String[] args) {

//        String[] strings = { "hello world", "I", "am", "   "};
//        for (int i =0; i < strings.length; i++){
//            System.out.println(strings[i].length());
//        }
        /*
        конкретный символ
         */
//        String s = "В лесу родилась елочка";

//        System.out.println(s.length());
//        System.out.println(s.charAt(2));
//        System.out.println(s.indexOf("е"));
//        System.out.println(s.indexOf("е", 4));
//        System.out.println(s.indexOf("е", 17));
//        System.out.println(s.indexOf("x "));
//
//        System.out.println(s.contains("лесу"));
//
//        System.out.println(s.startsWith("В"));
//        System.out.println(s.endsWith("елочка"));

//        System.out.println(s.substring(3));
//        System.out.println(" xxx yyy. ".trim()); //вырезать пробелы
//        System.out.println(s.toUpperCase());
//        System.out.println(s.toLowerCase( ));
//        System.out.println(s.replaceAll(" ", ""));
//
//        String noSpase = s.replaceAll(" ", "");
//        System.out.println(noSpase);
//
//        System.out.println(s);

//        String[] words = s.split(" "); //разделить по пробелу
//        for (int i =0; i < words.length; i++){
//            System.out.println(words[i]);
//        }
// --------------------------
//        String s = String.join("__", "В", "лесу", "родилась", "елочка");
//
//        System.out.println(s);

//        int a = 1;
//        String b = "1";
//        System.out.println(b + a);
//
//        String s = ("Result: " + "good").toLowerCase();
//        System.out.println(s);

//        /* строка является по сути массивов charом */
//
        String s = "Some string";
        char c = s.charAt(1);

        System.out.println(s.indexOf('s'));

/* Practice */
//        int a = 10;
//        int b = 20;
//        System.out.println("result = " + (a + b));

    }
}
