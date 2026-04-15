package lab7;

import java.util.*;

// Step 2: Define Student class
class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Step 3: Method to display details
    void display() {
        System.out.println("Roll No: " + rollNo + " | Name: " + name);
    }
}

public class lab7_b {

    public static void main(String[] args) {
        // Step 4: ArrayList Demonstration
        System.out.println("--- ArrayList (Student Details) ---");
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("Alice", 101));
        arrayList.add(new Student("Bob", 102));
        
        // Remove a student (by index)
        arrayList.remove(0); 
        
        // Display
        for (Student s : arrayList) {
            s.display();
        }

        // Step 5: LinkedList Demonstration
        System.out.println("\n--- LinkedList (Student Details) ---");
        LinkedList<Student> linkedList = new LinkedList<>();
        linkedList.add(new Student("Charlie", 201));
        linkedList.add(new Student("David", 202));
        
        // Remove a student (by index)
        linkedList.remove(0); 
        
        // Display
        for (Student s : linkedList) {
            s.display();
        }
    }
}
