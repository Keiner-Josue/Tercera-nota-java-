package unidad1.practica;

import semana02.Ejemplos.Student;

public class MainStude {
    public static void main(String[] args) {
        Student s1 = new Student("Ana", 4.2);
        Student s2 = new Student("Carlos", 2.9);

        if (s1.grade > s2.grade) {
            System.out.println(s1.name + " has a higher grade than " + s2.name);
        } else {
            System.out.println(s2.name + " has a higher grade than " + s1.name);
        }
    }
}