package Semana01.Ejercicios;
public class Book {
    String title;
    String author;
    boolean isAvailable;

    void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book \"" + title + "\" has been borrowed.");
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is not available.");
        }
    }

    void returnBook() {
        isAvailable = true;
        System.out.println("The book \"" + title + "\" has been returned.");
    }
}