package Set;
import java.util.*;

public class LinkedHashset {

	public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
		lhs.add(10);
		lhs.add(30);
		lhs.add(40);
		lhs.add(50);
		
		System.out.println("LinkedHashSet : " + lhs);
		
		System.out.println("To Check a LinkedHashSet is Empty or not : " + lhs.isEmpty());
		
		System.out.println("Contains 40 ? : " + lhs.contains(40));
		
		lhs.remove(40);
		
		System.out.println("LinkedHashSet : " + lhs);
		
		System.out.println("Size : " + lhs.size());
		
		System.out.println("Iterator of LinkedHashSet : " );
		
		Iterator<Integer> it = lhs.iterator();
		
		  while (it.hasNext()) {
	            System.out.println(it.next());
	        }
		
		lhs.clear();
		System.out.println("LinkedHashSet : " + lhs);

	}

}
