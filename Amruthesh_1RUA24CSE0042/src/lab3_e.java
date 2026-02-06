import java.util.Scanner;
public class lab3_e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of rows: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i <= num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.print(" \n");
		}

	}

}
