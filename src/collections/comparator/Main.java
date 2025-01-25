package collections.comparator;

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

        Collections.sort(students, new StudentIdComparator());
        System.out.println("Sorted Ids : "+students);

        Collections.sort(students, new StudentNameComparator());
        System.out.println("Sorted names : "+students);

        Collections.sort(students, new StudentIsCurrentStudentComparator());
        System.out.println("Sorted isCurrentStudent : "+students);

        Collections.sort(students, new StudentIdAndNameComparator());
        System.out.println("Sorted id and names : "+students);
    }
}
