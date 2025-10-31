// Superclass with personal details
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Subclass for student details that inherits from Person
class Student extends Person {
    int rollNo;
    float marks;

    Student(String name, int age, int rollNo, float marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class InheritanceStudentDetails {
    public static void main(String[] args) {
        Student student = new Student("Ravi", 18, 101, 92.5f);
        student.display();
    }
}
