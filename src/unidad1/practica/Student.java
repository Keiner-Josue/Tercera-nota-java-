package unidad1.practica;

public class Student {
    private String name;
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter con validación
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}


