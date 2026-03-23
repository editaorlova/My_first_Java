package Lesson_8_classes;

public class Library {

    public static void main(String[] args) {

        Book onegin = new Book();
        onegin.author = "А.С. Пушкин";
        onegin.title = "Евгений Онегин";

        Book borodino = new Book();
        borodino.author = "М.Ю. Лермонтов";
        borodino.title = "Бородино";

        Book dochka = new Book();
        dochka.author = "А.С. Пушкин";
        dochka.title = "Капитанская дочка";

        Book mzyri = new Book();
        mzyri.author = "М.Ю. Лермонтов";
        mzyri.title = "Мцыри";

        Book[] library = { onegin, borodino, dochka, mzyri };
        filter(library, "М.Ю. Лермонтов");
    }

    static void filter (Book[] books, String author) {
        for(int i = 0; i < books.length; i++) {
            Book book = books[i]; // book можно не вводить. это переменная типа Book (books[i])
            if (book.author.equals(author)){
                System.out.println(book.title);
            }
        }
    }

}
