package day2;
class GrandParent
{
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
public class ex8 extends GrandParent {
	void cancer()
	{
		System.out.println(" understain");
	}

	public static void main(String[] args) {
		ex8  bb= new ex8();
 		bb.bp();
    	bb.cancer();
		// TODO Auto-generated method stub

	}

}
