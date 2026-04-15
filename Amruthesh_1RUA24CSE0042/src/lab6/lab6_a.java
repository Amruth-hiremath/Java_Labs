package lab6;

class WelcomeThread extends Thread {
    public void run() {
        try {
            System.out.println("Welcome!");
            Thread.sleep(200);
            System.out.println("Thread resumed after sleep.");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted: " + e.getMessage());
        }
    }
}

public class lab6_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WelcomeThread thread = new WelcomeThread();
        thread.start();
	}

}
