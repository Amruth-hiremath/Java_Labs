package part_b;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class Student_new {
    int rollNo;
    String name;
    int age;
    String course;

    public Student_new(int rollNo, String name, int age, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}

public class lab6 {

	public static void main(String[] args) {
		// Sample data
		int inputRoll = 101;
		String inputName = "John Doe";
		int inputAge = 25; // Invalid age (Range is 15-21)
		String inputCourse = "BCA";

		try {
			if (inputAge < 15 || inputAge > 21) {
				throw new AgeNotWithinRangeException("Age " + inputAge + " is not within the valid range (15-21).");
			}

			Student_new student = new Student_new(inputRoll, inputName, inputAge, inputCourse);
			System.out.println("Student created successfully:");
			student.display();

		} catch (AgeNotWithinRangeException e) {
			System.out.println("Exception Caught: " + e.getMessage());
		}
		
		System.out.println("Program execution completed.");
	}

}
