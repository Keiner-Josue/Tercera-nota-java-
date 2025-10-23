package unidad1.practica;

public class MainCA {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.sumar(2, 3));         // 5
        System.out.println(calc.sumar(2, 3, 4));      // 9
        System.out.println(calc.sumar(2.5, 3.7));     // 6.2
    }
}