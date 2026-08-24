package day5;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s1 = sc.nextLine();
		System.out.println(s1.equals(new StringBuilder(s1).reverse().toString())? "palindrom" : "Not a palindrom");
		
		}
	}


