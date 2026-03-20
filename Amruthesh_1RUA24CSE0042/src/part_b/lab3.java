package part_b;

class Customer{
	String name;
	long acc_no;
	double balance;
	
	Customer(String name, long acc_no, double balance) {
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }
	void display() {
        System.out.println("Customer: " + name);
        System.out.println("Account Number: " + acc_no);
        System.out.println("Current Balance: $" + balance);
    }
}
	class Savings extends Customer{
		double interestRate = 0.04;
		Savings(String name, long accNum, double bal) {
	        super(name, accNum, bal);
	    }
		void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited: $" + amount);
	    }

	    void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: $" + amount);
	        } else {
	            System.out.println("Insufficient funds!");
	        }
	    }

	    void calculateInterest() {
	        double interest = balance * interestRate;
	        balance += interest;
	        System.out.println("Interest Added: $" + interest);
	    }
	}
	
	class CurrentAccount extends Customer{
		double overdraftLimit = 500.0;

	    CurrentAccount(String name, long accNum, double bal) {
	        super(name, accNum, bal);
	    }
	    
	    void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited: $" + amount);
	    }

	    void withdraw(double amount) {
	        if (amount <= (balance + overdraftLimit)) {
	            balance -= amount;
	            System.out.println("Withdrawn: $" + amount);
	        } else {
	            System.out.println("Overdraft limit exceeded!");
	        }
	    }
	}

public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Savings Savings = new Savings("Amruthesh", 1012345L, 1000.0);
	     CurrentAccount Current = new CurrentAccount("Arham", 2012345L, 500.0);
	     
	     System.out.println("--- Savings Account Activity ---");
	     
	        Savings.display();
	        Savings.deposit(500.0);
	        Savings.calculateInterest();
	        Savings.withdraw(200.0);
	        Savings.display();

	        System.out.println("\n-------------------------------\n");

	        System.out.println("--- Current Account Activity ---");
	        Current.display();
	        Current.deposit(200.0);
	        Current.withdraw(1000.0); 
	        Current.display();

	}

}
