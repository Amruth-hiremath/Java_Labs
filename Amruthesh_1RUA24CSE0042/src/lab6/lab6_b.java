package lab6;

class EvenThread extends Thread {
    public void run() {
        System.out.print("Even Numbers: ");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class OddThread extends Thread {
    public void run() {
        System.out.print("Odd Numbers: ");
        for (int i = 1; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class lab6_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EvenThread even = new EvenThread();
	        OddThread odd = new OddThread();

	        even.start();
	        odd.start();

	        try {
	            even.join();
	            odd.join();
	        } catch (InterruptedException e) {
	            System.out.println(e.getMessage());
	        }

	        System.out.println("Both threads have finished execution.");

	}

}
