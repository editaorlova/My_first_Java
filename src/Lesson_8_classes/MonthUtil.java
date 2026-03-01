package Lesson_8_classes;
/*
1. Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования
(объекты класса Month).
 */

public class MonthUtil {

    public static void main(String[] args) {

        Month january = new Month();
        january.monthName = "January";
        january.monthDays = 31;
        january.workDays = 22;

        Month february = new Month();
        february.monthName = "February";
        february.monthDays = 28;
        february.workDays = 19;

        Month march = new Month();
        march.monthName = "March";
        march.monthDays = 31;
        march.workDays = 23;

        Month april = new Month();
        april.monthName = "April";
        april.monthDays = 30;
        april.workDays = 22;


        Month[] calender = { april };
        filter( calender, "January");
    }

    public static void filter( Month[] months, String monthname) {

        for( int i = 0; i < months.length; i++) {
            Month month = months[i];
            if (months[i].monthDays > 30){
                System.out.println(month.monthName);

            }
        }
    }


}
