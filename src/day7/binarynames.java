package day7;

public class binarynames {
	public static int binarySearch(String[] arr,String target) {
		int left = 0;
		int right = arr.length-1;
		while(left<=right) {
			int mid = (left + right)/2;
			int comparison = target.compareTo(arr[mid]);
			if (comparison == 0) {
                return mid;
            }
			else if (comparison > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        
        return -1; 
    }
		
	public static void main(String[] args) {
		String[] names= {"apple", "banana", "cherry", "date", "grape", "mango", "orange"};
		String target="date";
		int result=binarySearch(names,target);
		if(result !=-1) {
			System.out.println("Element found at index:"+result);
		}else {
			System.out.println("ELement not found");
		}
		

	}

}
