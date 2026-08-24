package day5;
import java.util.HashSet;
public class hashset {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		System.out.println("Initial size of Hashset before adding element: "+set.size());
		System.out.println("HashSet is empty before adding values: " + set.isEmpty());
		System.out.println("Content f HashSet before addiing value: "+ set);
		set.add("C");
		set.add("A");
		set.add("D");
		set.add("B");
		set.add("A");
		set.add("F");
		set.add(null);
		System.out.println("size of hashset after addiin element" +set.size());
		System.out.println("hashset is empty after adding values: " + set.isEmpty());
		
		System.out.println("content of hashset after adding value :" + set);
		
		boolean b1 = set.contains("E");
		System.out.println("value E is present: "+b1);
		
		boolean b2 = set.contains("R");
		System.out.println("value R is present: "+b2);
		
		set.remove("B");
		System.out.println("size of hashset after deletion: "+ set.size());
		System.out.println("content of hashset after deletion: "+set);
		
		set.clear();
		System.out.println("size of hashset after clearing :"+ set.size());
		System.out.println("content of hashset after clearing:"+set);
		

	}

}
