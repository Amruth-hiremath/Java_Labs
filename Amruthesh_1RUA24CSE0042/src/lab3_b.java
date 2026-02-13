import java.util.Scanner;
public class lab3_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("You are eligible to vote!");
		}
		else {
			System.out.println("You are not eligible to vote!");
		}
		
		sc.close();
	}

}
