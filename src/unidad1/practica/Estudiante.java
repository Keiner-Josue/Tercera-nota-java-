package unidad1.practica;

// Definición de la clase Estudiante
public class Estudiante {
    // Atributos (estado)
    String nombre;
    int edad;
    String codigo;

    // Métodos (comportamiento)
    void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Código: " + codigo);
    }
}

