package day2;
interface Atm
{
	abstract void depo();	
	abstract void with();
}
abstract class Abc implements Atm
{	
	public	void depo()
	{
		System.out.println("Depos");
	}
	}
public class ex7 extends Abc {
	public	void with()
	{
		System.out.println("With");
	}


	public static void main(String[] args) {
		ex7   v = new ex7();
		v.depo();
		v.with();
		// TODO Auto-generated method stub

	}

}
 