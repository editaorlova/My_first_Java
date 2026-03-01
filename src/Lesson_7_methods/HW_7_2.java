package Lesson_7_methods;

/*
https://www.codewars.com/kata/555086d53eac039a2a000083/train/java
 */
public class HW_7_2 {

//    public static boolean isLove(final int flower1, final int flower2) {
//        if (flower1 % 2 == 0 && flower2 % 2 != 0){
//            return true;
//        }
//        if (flower1 % 2 != 0 && flower2 % 2 == 0){
//            return true;
//        }
//        else{
//            return false;
//        }
//
//    }

    public static boolean isLove(final int flower1, final int flower2) {
        return flower1 % 2 != flower2 % 2;
    }

    public static void main(String[] args) {
        if (isLove(40,20)){
            System.out.println("Love!");
        }else {
            System.out.println("No Love...");
        }
    }
}