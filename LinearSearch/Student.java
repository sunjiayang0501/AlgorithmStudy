public class Student {
    private String name;
    public Student(String name){
        this.name = name;
    }

    // redefine equals
    @Override
    public boolean equals(Object student){
        // Check if they have the same address
        if(this == student){
            return true;
        }
        // Check if student is empty
        if(student == null){
            return false;
        }
        // Check if they are in the same class
        if(this.getClass() != student.getClass()){
            return false;
        }
        // Convert to Student class
        Student another = (Student)student;
        return this.name.equalsIgnoreCase(another.name);
    }
}
