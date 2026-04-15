package part_b;

interface Student{
	void displayStudentDetails();
}

class Internal implements Student{
	protected int internal_marks = 67;
	protected String internal_grade = "A";
	
	public void displayStudentDetails() {
		 System.out.println("Student: Amruthesh | USN: 1RUA24CSE0042");
	}
	
	public void displayInternalDetails() {
		System.out.println("Internal Marks: " + internal_marks + " out of 70");
		System.out.println("Internal Grade: " + internal_grade);
	}
}

	interface External{
		int external_marks = 27;
		String external_grade = "A";
		void displayExternalDetails();
	}
	
	class Results extends Internal implements External{
		private int totalMarks;
	    private String finalStatus;
	    
	    public void displayExternalDetails() {
	        System.out.println("External Marks: " + external_marks + " out of 30");
	        System.out.println("External Grade: " + external_grade);
	    }
	    
	    public void calculateFinalResult() {
	        totalMarks = internal_marks + external_marks;
	        finalStatus = (totalMarks >= 40) ? "Passed" : "Failed";
	    }
	    
	    public void displayFinalResults() {
	        System.out.println("Total Marks: " + totalMarks + " out of 100");
	        System.out.println("Final Status: " + finalStatus);
	    }
	}


public class lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Results res = new Results();
		System.out.println("--- Student Report ---");
        res.displayStudentDetails();
        
        System.out.println("\n--- Internal Evaluation ---");
        res.displayInternalDetails();

        System.out.println("\n--- External Evaluation ---");
        res.displayExternalDetails();

        System.out.println("\n--- Final Summary ---");
        res.calculateFinalResult();
        res.displayFinalResults();

	}

}