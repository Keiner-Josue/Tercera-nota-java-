package Semana03.Ejemplos;

public class Employee {
    String role;

    public Employee(String role) {
        this.role = role;
    }

    public void showResponsibilities() {
        switch (role) {
            case "Manager":
                System.out.println("Manage teams and projects.");
                break;
            case "Developer":
                System.out.println("Write and test code.");
                break;
            case "Designer":
                System.out.println("Create visual assets and UI.");
                break;
            default:
                System.out.println("Unknown role.");
        }
    }
}
