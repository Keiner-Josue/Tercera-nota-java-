package unidad2.ejercicios.Company.Class;

class Package {
    private String trackingCode;
    private double weight;
    
    public Package(String trackingCode, double weight) {
        this.trackingCode = trackingCode;
        this.weight = weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void showPackage() {
        System.out.println("Código: " + trackingCode + " | Peso: " + weight + " kg");
    }
}

public class Main {
    
    public static void changeWeight(Package p, double newWeight) {
        p.setWeight(newWeight);
    }
    
    public static void main(String[] args) {
        // Crear objeto p1
        Package p1 = new Package("TRK-001", 5.5);
        p1.showPackage();
        
        // Crear referencia p2 = p1
        Package p2 = p1;
        
        // Cambiar peso con p2
        p2.setWeight(8.3);
        
        System.out.println("\nDespués del cambio:");
        p1.showPackage();
        p2.showPackage();
        
        System.out.println("\nAmbos muestran lo mismo porque apuntan al mismo objeto.");
        
        // Bonus
        changeWeight(p1, 12.7);
        System.out.println("\nDespués de changeWeight:");
        p1.showPackage();
    }
}
