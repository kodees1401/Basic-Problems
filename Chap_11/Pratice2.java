package Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Pratice2 {

	    public static void main(String[] args) {

	        ArrayList<String> tasks = new ArrayList<>();

	        tasks.add("Complete Assignment");
	        tasks.add("Study Java");
	        tasks.add("Practice Coding");

	        System.out.println("Original Tasks:");
	        System.out.println(tasks);

	        // Create ListIterator
	        ListIterator<String> iterator = tasks.listIterator();

	        // Move to index 0
	        iterator.add("Header");

	        // Move cursor to the end
	        while (iterator.hasNext()) {
	            iterator.next();
	        }

	        // Insert Footer at the end
	        iterator.add("Footer");

	        System.out.println();
	        System.out.println("Tasks after insertion:");
	        System.out.println(tasks);
	    }
	}