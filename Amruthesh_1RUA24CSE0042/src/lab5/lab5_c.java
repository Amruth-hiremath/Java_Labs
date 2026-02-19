package lab5;

abstract class Bank{
	abstract int getBalance();
}

class BankA extends Bank{
	@Override
	int getBalance(){
		return 100;
	}
}

class BankB extends Bank{
	@Override
	int getBalance(){
		return 150;
	}
}

class BankC extends Bank{
	@Override
	int getBalance(){
		return 200;
	}
}

public class lab5_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bankA = new BankA();
		Bank bankB = new BankB();
		Bank bankC = new BankC();
		
		System.out.println("Balance in BankA is: " + bankA.getBalance() + "$");
		System.out.println("Balance in BankB is: " + bankB.getBalance() + "$");
		System.out.println("Balance in BankC is: " + bankC.getBalance() + "$");
	}

}
