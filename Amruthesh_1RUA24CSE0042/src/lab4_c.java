class MobileBill{
	int local;
	int isd;
	int net_pack;
	double bill_amt;
	
	MobileBill(){
		local = 0;
		isd = 0;
		net_pack = 0;
		bill_amt = 0;
	}
	
	MobileBill(int local, int isd, int net_pack){
		this.local = local;
		this.isd = isd;
		this.net_pack = net_pack;
	}
	
	void CalculateBill() {
		double bill = (local * 0.10 + isd * 1 + net_pack * 500);
		this.bill_amt = bill;
	}
	
	void display() {
		System.out.println("Total bill amount: " + bill_amt);
	}
}

public class lab4_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileBill c1 = new MobileBill();
		c1.CalculateBill();
		c1.display();
		MobileBill c2 = new MobileBill(200, 10, 10);
		c2.CalculateBill();
		c2.display();
	}
}
