package lab2;
import java.util.Scanner;
public class lab2_f {
	
	public static double totalsalary(int num) {
		double da = 0.05;
		double hra = 0.08;
		double total1 = num + num * da;
		double total2 = total1 + total1 * hra;
		return total2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base salary: ");
		int base = sc.nextInt();
		
		double total = 0;
		total = totalsalary(base);
		double final_salary = 0;
		final_salary = total + total * 0.05;
		System.out.println("The final salary is: " + final_salary);
		sc.close();
	}

}
