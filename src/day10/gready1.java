package day10;

public class gready1 {

	public static void main(String[] args) {
		int[] paitent= {1,2,3,4};
		int[] start= {2,3,4,5};
		int[] end= {3,4,7 ,6};
		int lastEnd=end[0];
		System.out.println("selected paitent people:");
		System.out.println("paitent:"+paitent[0]);
		for(int i=0;i<paitent.length;i++) {
			if(start[i]>=lastEnd) {
				System.out.println("Paitent " +(i+1));
				lastEnd=end[i];

	     }}

}}
