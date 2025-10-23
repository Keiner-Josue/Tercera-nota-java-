package Semana05.Store.Class;

public class Employee {
    String role;

    public Employee(String role) {
        this.role = role;
    }
    public void ShowResposabilities() {
        switch (role) {
            case "Manager":
                System.out.println("Maneja el equipo de trabajo");
                break;
            case "Developer":
                System.out.println("Programa y Testea el software");
                break;
            case "Designer":
                System.out.println("Diseña UI/UX");
                break;
        
            default:
                System.out.println("No conocido");
                break;
        }
        
        
    }
}
