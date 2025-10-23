package unidad1.practica;
import java.util.ArrayList;
public class MainPro {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200));
        products.add(new Product("Mouse", 25));
        products.add(new Product("Keyboard", 80));

        for (Product p : products) {
            p.showInfo();
        }
    }
}
