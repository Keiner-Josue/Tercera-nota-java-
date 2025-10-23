package unidad3.ejercicio.ejejercicios;
import java.io.*;
import java.util.List;

// BookFileHandler class for file operations
public class BookFileHandler {
    private static final String FILE_NAME = "books.txt";

    // Save books to file using BufferedWriter
    public void saveBooks(List<Book> books) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Book book : books) {
                writer.write(book.getTitle() + "|" + book.getAuthor() + "|" + book.getPrice());
                writer.newLine();
            }
            System.out.println("✓ Books saved successfully to " + FILE_NAME);
        } catch (IOException e) {
            System.err.println("Error saving books: " + e.getMessage());
        } finally {
            System.out.println("Operation finished (save)");
        }
    }

    // Read and print books from file using BufferedReader
    public void readBooks() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n--- Books from File ---");
            int count = 1;
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 3) {
                    String title = parts[0];
                    String author = parts[1];
                    double price = Double.parseDouble(parts[2]);
                    System.out.println(count + ". " + new Book(title, author, price));
                    count++;
                }
            }
            System.out.println("✓ Books read successfully");
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading books: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing price: " + e.getMessage());
        } finally {
            System.out.println("Operation finished (read)");
        }
    }
}