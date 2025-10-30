package unidad4.factory.util;

public class Direccion {
    private String ciudad;
    private String calle;

    public Direccion(String ciudad, String calle) {
        this.ciudad = ciudad;
        this.calle = calle;
    }

    public String getFullAddress() {
        return calle + ", " + ciudad;
    }
    
}
