package day7;

public class binarysearch4 {

	public static void main(String[] args) {
		String[] arr= {"apple", "banana", "cherry","cherry","cherry","date","data", "grape", "mango", "orange",};
		String target = "cherry";
		int first =-1;
		int last =-1;
		int start = 0;
		int end = arr.length-1;
		while (start<=end) {
			int mid = (start + end)/2;
			if(arr[mid].equals(target)) {
				first = mid;
				end = mid-1;
				
			}else if (arr[mid].compareTo(target)<0)	 {
				start=mid+1;
				
			}else {
				end=mid-1;
			}
		}
		 start = 0;
	        end = arr.length - 1;
	        while (start <= end) {
	            int mid = (start + end) / 2;
	            if (arr[mid].equals(target)) {
	                last = mid;
	                start = mid + 1;      // Search RIGHT
	            }
	            else if (arr[mid].compareTo(target)<0) {
	                start = mid + 1;
	            }
	            else {
	                end = mid - 1;
	            }
	        }
	        System.out.println("First = " + first);
	        System.out.println("Last = " + last);


	}

}
