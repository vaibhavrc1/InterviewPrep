package collections.comparable;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private boolean isCurrentStudent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCurrentStudent() {
        return isCurrentStudent;
    }

    public void setCurrentStudent(boolean currentStudent) {
        isCurrentStudent = currentStudent;
    }

    public Student(int id, String name, boolean isCurrentStudent) {
        this.id = id;
        this.name = name;
        this.isCurrentStudent = isCurrentStudent;
    }

    @Override
    public int compareTo(Student student){
        if(this.name.compareTo(student.name) == 0){
            if(this.id == student.id){
                return 0;
            }
            else if(this.id > student.id){
                return 1;
            }
            else {
                return -1;
            }
        }
        else{
            return this.name.compareTo(student.name);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isCurrentStudent=" + isCurrentStudent +
                '}';
    }
}
