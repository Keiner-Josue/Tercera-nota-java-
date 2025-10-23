package unidad1.ejercicios;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Book
        Book book1 = new Book();

        // Asignar valores
        book1.title = "Clean Code";
        book1.author = "Robert C. Martin";
        book1.isAvailable = true;

        // Interactuar con el objeto
        book1.borrow();
        book1.borrow(); // Intentar de nuevo
        book1.returnBook();
    }
}
