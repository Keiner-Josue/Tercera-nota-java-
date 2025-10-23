package unidad1.practica;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Maria");
        s1.setAge(-5);  // rechazado
        s1.setAge(20);  // aceptado

        System.out.println(s1.getName() + " - " + s1.getAge());
    }
}