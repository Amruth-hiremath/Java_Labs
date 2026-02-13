package lab2;

public class lab2_e {
	
	public static int printnums(int num) {
		int sum = 0;
		for(int i = 0; i <=num; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = printnums(20);
		System.out.println("The sum of first 20 natural numbers is: " + sum);
	}

}
