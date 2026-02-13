package lab3;
import java.util.Scanner;
public class lab3_f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		for(int i = 1; i < 11; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
		sc.close();

	}

}
