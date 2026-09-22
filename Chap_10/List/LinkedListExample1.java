package List;

import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Pavithra");
		list.add("Kiruthika");
		list.add("Bharath");
		list.addFirst("Kodeeswaran");
		list.addLast("Karthikeyan");
		
		System.out.println("List : " + list);
		
			
		System.out.println("First Element : " + list.getFirst());
		System.out.println("Last Element : " + list.getLast());
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println("After Removing First and Last : " + list );
		
		list.offer("Subathra");
		list.offer("Prabhakaran");
		System.out.println("List : " + list);
		
		list.poll();
		System.out.println("List After Removing First Name in List : " + list);
		

	}

}
