package unidad2.practica;

import java.util.ArrayList;

public class Library {
    private ArrayList<String> books = new ArrayList<>();

    public void addBook(String title) {
        books.add(title);
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Books in library:");
            for (String b : books) {
                System.out.println("- " + b);
            }
        }
    }
}
