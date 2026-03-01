package Lesson_2;

public class HW_2_3_SP {
    public static void main(String[] args) {

        int totalLoot=3000;
        int AllPirats = 15;

        int remainder = totalLoot;
        int owner = remainder/2;
        remainder = remainder - owner;

        int Captain = remainder/2;
        remainder = remainder - Captain;


        int EachOfPirats = remainder/AllPirats;
        remainder = remainder - EachOfPirats *AllPirats;

        System.out.println("TotalLoot: "+ totalLoot);
        System.out.println("Owner: "+ owner);
        System.out.println("Captain: "+ Captain);
        System.out.println("Each pirats: "+ EachOfPirats);
        System.out.println("Left: "+remainder);
        System.out.println("Jack: "+ (owner+Captain+ EachOfPirats));

        System.out.print("Correct?: ");
        System.out.println((owner + Captain + AllPirats* EachOfPirats + remainder) == totalLoot);
    }
}
