package Java;

class Student {
    private int id;
    private String name;

    // Constructor and other methods...
    public Student(int id, String name){
        this.id =id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    
     public static void main(String[] args) {
        // Create Student objects
        Student student1 = new Student(1, "John");
        Student student2 = new Student(2, "Jane");
        Student student3 = new Student(3, "Cruze");

        // Display the hash codes
        System.out.println("Hash code for student1: " + student1.hashCode());
        System.out.println("Hash code for student2: " + student2.hashCode());
        System.out.println("Hash code for student3: " + student3.hashCode());
        
    }
}
