import java.util.Scanner;
public class lab2_d {
	
	public static void evenorodd(int num) {
		if(num % 2 == 0) {
			System.out.println("The number is even.");
		}
		else {
			System.out.println("The number is odd.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = sc.nextInt();
		evenorodd(num);
		sc.close();
	}

}
