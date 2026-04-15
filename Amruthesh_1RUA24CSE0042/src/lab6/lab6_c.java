package lab6;

public class lab6_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Handling ArrayIndexOutOfBoundsException
		 try {
	            int[] numbers = {1, 2, 3};
	            System.out.println(numbers[10]); 
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Specific Catch: Array index is out of bounds!");
	        }

	        // Handling ArithmeticException
	        try {
	            int result = 10 / 0;
	        } catch (ArithmeticException e) {
	            System.out.println("Specific Catch: Cannot divide by zero!");
	        }

	        // Handling NullPointerException
	        try {
	            String text = null;
	            System.out.println(text.length());
	        } catch (NullPointerException e) {
	            System.out.println("Specific Catch: Attempted to access a method on a null object!");
	        }

	        // Handling NumberFormatException
	        try {
	            int num = Integer.parseInt("InvalidNumber");
	        } catch (NumberFormatException e) {
	            System.out.println("Specific Catch: Invalid string to number conversion!");
	        }

	        // Handling Generic Exception
	        try {
	            // Triggering a generic exception (e.g., manually throwing one)
	            throw new RuntimeException("Generic error occurred");
	        } catch (Exception e) {
	            System.out.println("Generic Catch: " + e.getMessage());
	        }

	}

}
