package demo;

public class test {
	public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println(factorial(5));  // Output: 120
	      System.out.println(factorial(10)); 
	    
	    		

	}

}
