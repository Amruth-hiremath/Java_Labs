package lab5;
class Student{
	String name;
	int rollNumber;

	Student(String name, int rollNumber){
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	void displayStudentDetails() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
	}
}

class Test extends Student{
	int marks;
	
	Test(String name, int rollNumber, int marks){
		super(name, rollNumber);
		this.marks = marks;
	}
	
	void displayTestDetails(){
		displayStudentDetails();
		System.out.println("Marks: " + marks);
	}
}

class Sports extends Test{
	String sports;
	
	Sports(String name, int rollNumber, int marks, String sports){
		super(name, rollNumber, marks);
		this.sports = sports;
	}
	
	void displaySportsDetails(){
		displayTestDetails();
		System.out.println("Sports: " + sports);
	}
}


public class lab5_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports s = new Sports("Amruthesh", 1, 97, "F1");
		s.displaySportsDetails();
	}

}
