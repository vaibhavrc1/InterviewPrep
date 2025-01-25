package collections.comparator;

import java.util.Comparator;

public class StudentIdAndNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2){
        if(student1.getId() == student2.getId()){
            return student1.getName().compareTo(student2.getName());
        }
        else if(student1.getId() > student2.getId()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
