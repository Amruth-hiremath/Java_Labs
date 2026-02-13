package lab1;
import java.util.Scanner;

public class lab1_d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Welcome " + name);
		sc.close();
	}

}
