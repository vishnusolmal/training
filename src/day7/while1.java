package day7;

public class while1 {

	public static void main(String[] args) {	
		int amount =10000;
		int withadrawal=2000;
		int n=1;
		while(n<=5) {
			amount =amount-withadrawal;
			System.out.println("after "+n+"withdrawal: "+amount);
			n++;
			
		}
		
}
}