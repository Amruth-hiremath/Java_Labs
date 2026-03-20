package lab5;

interface Exam{
	double calc_percentage();
}

class Student{
	String name;
	int roll_number;
	int marks;
	int total_marks;
	
	Student(String name, int roll_number, int marks, int total_marks){
		this.name = name;
		this.roll_number = roll_number;
		this.marks = marks;
		this.total_marks = total_marks;
	}
	
	void displayStudentDetails() {
		System.out.println("Student Name: " + name);
		System.out.println("Student Roll Number: " + roll_number);
		System.out.println("Marks: " + marks);
		System.out.println("Total Marks: " + total_marks);
	}
} 

class Result extends Student implements Exam{
	
	Result(String name, int roll_number, int marks, int total_marks){
		super(name, roll_number, marks, total_marks);
	}
	
	public double calc_percentage() {
		double percentage = (marks * 100) / total_marks;
		return percentage;
	}
	
	void displayStudentDetails() {
		System.out.println("Student Name: " + name);
		System.out.println("Student Roll Number: " + roll_number);
		System.out.println("Marks: " + marks);
		System.out.println("Total Marks: " + total_marks);
		System.out.println("Percentage Obtained: " + calc_percentage());
	}
}

public class lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result r = new Result("Amruthesh", 42, 95, 100);
		r.displayStudentDetails();

	}

}
