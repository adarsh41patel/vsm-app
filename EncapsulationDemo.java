
class Student {
    // Private instance variables (data)
    private String name;
    private int age;

    // Constructor to initialize the object
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for the 'name' attribute
    public String getName() {
        return name;
    }

    // Setter method for the 'name' attribute
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the 'age' attribute
    public int getAge() {
        return age;
    }

    // Setter method for the 'age' attribute
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age must be a non-negative value.");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Alice", 20);

        // Access and modify the attributes using getter and setter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        student.setName("Bob");
        student.setAge(25);

        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Age: " + student.getAge());
    }

}
