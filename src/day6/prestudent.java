package day6;

public class prestudent {

	public static void main(String[] args) {
		int[] students = {68,40,80,75,85};
		int[] prefixsum = new int[students.length];
		prefixsum[0] = students[0];
		for (int i=1;i<students.length;i++) {
			prefixsum[i]=prefixsum[i-1]+students[i];
		}
		int sum = prefixsum[3] - prefixsum[0];
		System.out.println("Total spend = $" + sum);

	}

}
