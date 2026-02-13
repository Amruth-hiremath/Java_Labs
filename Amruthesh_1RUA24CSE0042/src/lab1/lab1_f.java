package lab1;
import java.util.Scanner;
public class lab1_f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input 3 integers and display the largest and smallest
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter third number: ");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("Greatest number is " + num1);
		}
		else if(num2 > num1 && num2 > num3) {
			System.out.println("Greatest number is " + num2);
		}
		else {
			System.out.println("Greatest number is " + num3);
		}
		
		if(num1 < num2 && num1 < num3) {
			System.out.println("Smallest number is " + num1);
		}
		else if(num2 < num1 && num2 < num3) {
			System.out.println("Smallest number is " + num2);
		}
		else {
			System.out.println("Smallest number is " + num3);
		}
		
		sc.close();
	}

}
