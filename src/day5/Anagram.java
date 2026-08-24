package day5;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String s2 = sc.nextLine();

        s1 = s1.toLowerCase().replaceAll("s+", "");
        s2 = s2.toLowerCase().replaceAll("s+", "");

        if (s1.length() != s2.length()) {
            System.out.println("Not anagrams (different length).");
        } else {
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();

            Arrays.sort(arr1); 
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Yes! They are ANAGRAMS.");
            } else {
                System.out.println("No, they are NOT anagrams.");
            }
        }
	}
}
