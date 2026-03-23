package Lesson_8_classes;

public class Lesson_8 {
    public static void main(String[] args) {

        int[] boxes = { 60, 59, 64, 57 };
        MatchBox biggestBox = findMaxBox(boxes);// здесь уже будет новый экземпляр класса метчбокс

        System.out.println("Box number " + biggestBox.index + " has the most number of matches: " + biggestBox.count);

    }
    static MatchBox findMaxBox(int[] boxes) { //int[] - массив обозначаем
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < boxes.length; i++) {

            if (boxes[i] > max) {
                max = boxes[i];
                maxIndex = i;
            }
        }
        MatchBox result = new MatchBox();// 2- создаем новый объект - и кладем в переменную, это экземпляр класса метчбокс, мы его вытягиваем
        result.index = maxIndex;// раз int перед не стоит, то мы ее не создаем, она уже создана (как бы адрес, что это экземпляр метчбокса, лежит в пер резалт+у него есть индекс
        result.count = max;

        return result;
    }

    static class MatchBox { //1 - объявили класс
        int index; // переменная или поле правильнее (филд)
        int count;
    }
}
