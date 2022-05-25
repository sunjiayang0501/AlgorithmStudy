public class Student implements Comparable<Student>{
    private String name;
    private float gpa;

    public Student(String name, float gpa){
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student another){
        if (this.gpa < another.gpa){
            return -1;
        } else if (this.gpa == another.gpa){
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public boolean equals(Object student){
        if (this == student){
            return true;
        }
        if (student == null){
            return false;
        }
        if (this.getClass() != student.getClass()){
            return false;
        }
        Student another = (Student)student;
        return this.name.equalsIgnoreCase(another.name);
    }

    @Override
    public String toString(){
        return String.format("Student(name: %s, gpa: %f)", name, gpa);
    }
}
