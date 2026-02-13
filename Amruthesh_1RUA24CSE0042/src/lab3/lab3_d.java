package lab3;
import java.util.Scanner;
public class lab3_d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 7: ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("The day is Sunday!");
			break;

		case 2:
			System.out.println("The day is Monday!");
			break;
		
		case 3:
			System.out.println("The day is Tuesday!");
			break;
		
		case 4:
			System.out.println("The day is Wednesday!");
			break;
		
		case 5:
			System.out.println("The day is Thursday!");
			break;
		
		case 6:
			System.out.println("The day is Friday!");
			break;
		
		case 7:
			System.out.println("The day is Saturday!");
			break;
		}
			
		sc.close();
	}

}
