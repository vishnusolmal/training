package day6;

public class stringr_builder {

	public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println("After append: " + sb); 
        
        
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb); 
        
       
        sb.replace(0, 5, "Welcome");
        System.out.println("After replace: " + sb);   
        
        
        
        sb.delete(0,7);
        System.out.println("after delet: " + sb);
        String finalResult = sb.toString();
 
	}

}
