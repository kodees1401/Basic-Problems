package Set;
import java.util.*;

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Apple");
		hs.add("Banana");
		hs.add("Orange");
		hs.add("Apple");
		
		System.out.println("HashSet : " + hs);
		
		System.out.println("To Check a HashSet is Empty or not : " + hs.isEmpty());
		
		System.out.println("Contains Banana ? : " + hs.contains("Banana"));
		
		hs.remove("Banana");
		
		System.out.println("HashSet : " + hs);
		
		System.out.println("Size : " + hs.size());
		
		System.out.println("Iterator of HashSet : " );
		
		Iterator<String> it = hs.iterator();
		
		  while (it.hasNext()) {
	            System.out.println(it.next());
	        }
		
		hs.clear();
		System.out.println("HashSet : " + hs);
		

	}

}
