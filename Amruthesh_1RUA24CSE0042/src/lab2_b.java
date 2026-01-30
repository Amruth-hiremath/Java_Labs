import java.util.Scanner;
public class lab2_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number greater than 10: ");
		int num = sc.nextInt();
	

		System.out.println("The numbers from 10 to " + num + ":");
		for(int i = 10; i <= num; i++) {
			System.out.println(i);
		}
	}

}
