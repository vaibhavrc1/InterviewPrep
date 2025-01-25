package collections.comparator;

import java.util.Comparator;

public class StudentIsCurrentStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2){
        if(student1.isCurrentStudent() == student2.isCurrentStudent()){
            return 0;
        }
        else if(student1.isCurrentStudent() == false){
            return 1;
        }
        else{
            return -1;
        }
    }
}
