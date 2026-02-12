import java.util.Scanner;
public class lab2_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter your second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter your third number: ");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		
		System.out.println("The sum of the three numbers is: " + sum);
		sc.close();
	}

}
