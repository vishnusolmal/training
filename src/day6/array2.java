package day6;
import java.util.Arrays;
public class array2 {

	public static void main(String[] args) {
		  int[] arr1 = {1, 2, 3, 4};
	      int[] arr2 = {3, 4, 5, 6};   
	      int[] temp = new int[arr1.length + arr2.length];
	      int count = 0; 	        
	      for (int i = 0; i < arr1.length; i++) {
	          boolean isDuplicate = false;
	          for (int j = 0; j < count; j++) {
	                if (temp[j] == arr1[i]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	           
	            if (!isDuplicate) {
	                temp[count] = arr1[i];
	                count++;
	            }
	        }	        
	        for (int i = 0; i < arr2.length; i++) {
	            boolean isDuplicate = false;
	            
	            for (int j = 0; j < count; j++) {
	                if (temp[j] == arr2[i]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            
	            if (!isDuplicate) {
	                temp[count] = arr2[i];
	                count++;
	            }
	        }        
	        int[] union = new int[count];
	        for (int i = 0; i < count; i++) {
	            union[i] = temp[i];
	        }

	        
	        System.out.println("Union array: " + Arrays.toString(union));
	     

			
	}

}
