package unidad2.practica;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Clean Code");
        lib.addBook("Thinking in Java");
        lib.showBooks();
    }
}