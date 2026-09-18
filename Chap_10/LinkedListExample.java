package List;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.addFirst("Start");
		list.addLast("End");
		
		System.out.println("List : " + list);
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println("After Removing First and Last " + list );
		
		System.out.println("First Element : " + list.getFirst());
		System.out.println("Last Element : " + list.getLast());
		
		

	}

}
