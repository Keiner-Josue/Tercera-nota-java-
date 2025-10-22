package Semana03.Ejemplos;
import java.util.ArrayList;
public class MainStu {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ana", 4.2));
        students.add(new Student("Luis", 2.5));
        students.add(new Student("Marta", 3.8));

        int approved = 0, failed = 0;

        for (Student s : students) {
            System.out.println(s.name + " → " + s.getStatus());
            if (s.grade >= 3.0) approved++;
            else failed++;
        }

        System.out.println("Approved: " + approved);
        System.out.println("Failed: " + failed);
    }
}
