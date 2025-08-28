package Semana02;
public class Store_project {

    public static void main(String[] args) {
        // Product 1
        Product product1 = new Product();
        product1.name = "Camiseta System of a Down 100% algodón";
        product1.price = 270000;
        product1.quantity = 14;

        // Product 2
        Product product2 = new Product();
        product2.name = "Gorra Metallica edición limitada";
        product2.price = 150000;
        product2.quantity = 5;

        // Test all methods
        System.out.println("--- PRODUCT 1 ---");
        product1.showProduct();
        product1.sell(10); // Should succeed
        product1.sell(10); // Should fail (not enough stock)
        product1.restock(20);
        product1.showProduct();

        System.out.println("\n--- PRODUCT 2 ---");
        product2.showProduct();
        product2.sell(2);
        product2.restock(3);
        product2.sell(10); // Should fail
        product2.showProduct();
    }
}