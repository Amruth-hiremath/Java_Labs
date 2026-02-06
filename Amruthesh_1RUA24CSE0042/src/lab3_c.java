import java.util.Scanner;
public class lab3_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		for(int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println("The sum from 0 upto " + num + " is: " + sum);
		sc.close();
	}

}
