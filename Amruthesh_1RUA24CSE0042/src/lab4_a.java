import java.util.Scanner;

class Circle{
	int radius;
	
	double circumference(int radius) {
		double circumference = radius * 3.14 * 2;
		return circumference;
	}
}
public class lab4_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub3
		Circle c = new Circle();
		System.out.println("Enter the radius: ");
		Scanner sc = new Scanner(System.in);
		int rad = sc.nextInt();
		double result = c.circumference(rad);
		System.out.println("The circumference of the circle is: " + result);
		sc.close();
	}
}
