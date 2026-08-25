package day6;

public class logic {

	public static void main(String[] args) {
		 int[] numbers = {2, 3, 1, 2, 4, 3};
	        int target = 7;
	       
	        int minlength = Integer.MAX_VALUE; 

	        for (int i = 0; i < numbers.length; i++) {
	            int sum = 0;
	            
	           
	            for (int j = i; j < numbers.length; j++) {
	                sum = sum + numbers[j];
	                
	                
	                if (sum >= target) {
	                    int length = j - i + 1;
	                    if (length < minlength) {
	                        minlength = length;
	                    }
	                    break; 
	                }
	            }
	        }

	        
	        if (minlength == Integer.MAX_VALUE) {
	            System.out.println("No valid window found.");
	        } else {
	            System.out.println("smallest window length = " + minlength);
	        }

	}

}
