package collections.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(3, "Sam", true);
        Student student2 = new Student(1, "Ham", false);
        Student student3 = new Student(5, "Yam", true);
        Student student4 = new Student(6, "Jam", true);
        Student student5 = new Student(2, "Sam", true);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);

        Collections.sort(students);

        System.out.println(students);
    }
}
