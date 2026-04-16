package part_b;

public class lab7_a {

	public static void main(String[] args) {
		String birthDate = "15/08/1947";

		String[] parts = birthDate.split("/");

		String day = parts[0];
		String month = parts[1];
		String year = parts[2];

		System.out.println("Day: " + day);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);
	}

}
