package lab5;

import oddeven.*;
import palindrome.*;

public class lab5_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check_pal num1 = new check_pal();
		check_oddeven num2 = new check_oddeven();
		
		if(num1.checkfor_pal(123321) == true) {
			System.out.println("The number is a palindrome");
		}
		else if(num1.checkfor_pal(123321) == false) {
			System.out.println("The number is not a palindrome");
		}
		
		if(num2.checkfor_oddeven(30) == true) {
			System.out.println("The number is even ");
		}
		else if(num2.checkfor_oddeven(30) == false) {
			System.out.println("The number is odd");
		}

	}

}
