package unidad1.practica;

import java.util.ArrayList;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showInfo() {
        System.out.println(name + " - $" + price);
    }
}

