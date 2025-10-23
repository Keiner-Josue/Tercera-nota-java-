package unidad2.practica;

import java.util.ArrayList;

class Student {
    String name;
    double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getStatus() {
        if (grade >= 3.0) return "Approved";
        else return "Failed";
    }
}

