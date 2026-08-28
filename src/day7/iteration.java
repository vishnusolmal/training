package day7;

public class iteration {

	public static void main(String[] args) {
		int amount =10000;
		int withadrawal=2000;
		for(int i=1;i<6;i++) {
			amount =amount-withadrawal;
			System.out.println("after "+i+"withdrawal: "+amount);
		}
		
	}

}
