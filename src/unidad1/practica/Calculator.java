package unidad1.practica;

public class Calculator {
    // Método con dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Sobrecarga con tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Sobrecarga con decimales
    public double sumar(double a, double b) {
        return a + b;
    }
}

