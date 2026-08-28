package day7;

public class recurtion3 {
	static void withdrawMoney(int amount,int withdrawal) {
		if(amount <=0) {
			System.out.println("Withdrawl completed!");
			return;
		}
		System.out.println("withdraw:"+withdrawal);
		amount = amount - withdrawal;
		System.out.println("BankBalance: "+amount);
		withdrawMoney(amount,withdrawal);
		
	}

	public static void main(String[] args) {
		int amount=10000;
		int withdrawal=2000;
		withdrawMoney(amount,withdrawal);
		
	}

}
