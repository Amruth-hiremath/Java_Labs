package lab7;

public class lab7_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Step 2: Define input string
        String S1 = "this is a test. This is a test. This is a test?";

        // Step 3: Print length
        System.out.println("Length of string: " + S1.length());

        // Step 4: Print character at a specific position (e.g., index 5)
        int X = 5;
        System.out.println("Character at position " + X + ": " + S1.charAt(X));

        // Step 5: Print substring (e.g., from index 10 to 14)
        int startno = 10;
        int endno = 14;
        System.out.println("Substring (" + startno + " to " + endno + "): " + S1.substring(startno, endno));

        // Step 6: Print first occurrence of 'a'
        System.out.println("Index of first 'a': " + S1.indexOf('a'));

        // Step 7: Print index of substring "XXX" (e.g., "test")
        String sub = "test";
        System.out.println("Index of \"" + sub + "\": " + S1.indexOf(sub));

	}

}
