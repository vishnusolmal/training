package day9;
import java.util.*;
public class LexicalSearch {

	public static void main(String[] args) {
		String[] names = {"Ravi","Rahul","Ananad","Rakesh","Raj"};
		String search ="Ra";
		ArrayList<String> result = new ArrayList<>();
		for (String name : names) {
			if (name.contains(search)) {
				result.add(name);
			}
			
		}
		System.out.println("Search Result: ");
		for (String name : result) {
			System.out.println(name);
		}
	}

}
