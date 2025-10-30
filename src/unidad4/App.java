package unidad4;

import unidad4.factory.util.Direccion;
import unidad4.factory.util.Gerente;
import unidad4.factory.util.Vendedor;

public class App {
    public static void main(String[] args) throws Exception {
        Direccion d1 = new Direccion("Ciudad de Mexico", "Av. Reforma 123");
        Direccion d2 = new Direccion("Guadalajara", "Calle Juarez 456");

        Gerente g1 = new Gerente("Juan Perez", 50000, 1200, d1);
        Vendedor v1 = new Vendedor("Ana Gomez", 30000, 150000, 0.05, d2);


        System.out.println("--- Informacion de Empleados ---");
        g1.mostrarInfo();
        v1.mostrarInfo();
        
    }
    
}
