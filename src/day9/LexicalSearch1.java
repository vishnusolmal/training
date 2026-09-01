package day9;

import java.util.ArrayList;

public class LexicalSearch1 {

	public static void main(String[] args) {
		int[] names = {819455238,1022323,10232,2345,2345};
		String search ="10";
		ArrayList<Integer> result = new ArrayList<>();
		for (int name : names) {
			if (String.valueOf(name).contains(search)) {
				result.add(name);
			} 
			
		}
		System.out.println("Search Result: ");
		for (int name : result) {
			System.out.println(name);
		}

	}

}
