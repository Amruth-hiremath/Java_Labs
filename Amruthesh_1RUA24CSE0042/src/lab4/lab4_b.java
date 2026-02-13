package lab4;

class Customer{
	String name;
	int bill_amt;
	double discount;
	double pay_amt;
	
	Customer(String name, int bill_amt){
		this.name = name;
		this.bill_amt = bill_amt;
	}
	
	void Calculate_Discount() {
		double disc = 0;
		if(bill_amt > 1000) {
			disc = 0.05 * bill_amt;
		}
		if(bill_amt >= 500 && bill_amt <= 1000) {
			disc = 0.02 * bill_amt;
		}
		if(bill_amt > 0 && bill_amt < 500) {
			disc = 0.01 * bill_amt;
		}
		this.discount = disc;
		this.pay_amt = bill_amt - disc;
	}
	
	void display() {
		System.out.println("Customer Name: " + name);
		System.out.println("Bill amount: " + bill_amt);
		System.out.println("Discount: " + discount);
		System.out.println("Payable amount: " + pay_amt);
	}
}

public class lab4_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("Amruthesh", 1200);
		Customer c2 = new Customer("Adhirath", 500);
		c1.Calculate_Discount();
		c2.Calculate_Discount();
		c1.display();
		System.out.println();
		c2.display();
	}
}