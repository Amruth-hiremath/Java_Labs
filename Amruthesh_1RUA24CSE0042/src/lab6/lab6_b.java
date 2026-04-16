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
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        try {
            // Start and wait for Odd numbers first
            odd.start();
            odd.join(); 
            
            // Start and wait for Even numbers second
            even.start();
            even.join();
            
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("Both threads have finished execution.");
    }
}
