package unidad3.ejercicio.ejejercicios;

import java.util.ArrayList;
import java.util.List;

// Main class
public class Main {
    public static void main(String[] args) {
        // Create a list of 3 books
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99));
        books.add(new Book("1984", "George Orwell", 13.50));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 14.25));

        // Create file handler
        BookFileHandler fileHandler = new BookFileHandler();

        // Save books to file
        System.out.println("=== SAVING BOOKS ===");
        fileHandler.saveBooks(books);

        // Read and display books from file
        System.out.println("\n=== READING BOOKS ===");
        fileHandler.readBooks();
    }
}