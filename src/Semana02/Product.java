package Semana02;

public class Product {
     String name;
        double price;
        int quantity;

        // Sell units if enough stock is available
        void sell(int amount) {
            if (quantity >= amount) {
                quantity -= amount;
                System.out.println("Sold: " + amount + " | Remaining stock: " + quantity);
            } else {
                System.out.println("Not enough stock to sell " + amount + " units. Current stock: " + quantity);
            }
        }

        // Add new stock
        void restock(int amount) {
            quantity += amount;
            System.out.println("Restocked: " + amount + " | New stock: " + quantity);
        }

        // Show product info
        void showProduct() {
            System.out.println("Product: " + name);
            System.out.println("Price: $" + price);
            System.out.println("Stock: " + quantity);
        }
}
