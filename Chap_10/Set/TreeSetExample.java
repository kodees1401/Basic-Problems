package Set;
import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(10);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		
		System.out.println("TreeSet : " + ts);
		
		System.out.println("To Check a TreeSet is Empty or not : " + ts.isEmpty());
		
		System.out.println("Contains 40 ? : " + ts.contains(40));
		
		System.out.println("First Element :" + ts.first());
		
		System.out.println("Last Element :" + ts.last());
		
		ts.remove(40);
		
		System.out.println("TreeSet : " + ts);
		
		System.out.println("Size : " + ts.size());
		
		System.out.println("Iterator of TreeSet : " );
		
		Iterator<Integer> it = ts.iterator();
		
		  while (it.hasNext()) {
	            System.out.println(it.next());
	        }
		
		ts.clear();
		System.out.println("TreeSet : " + ts);

	}

}
