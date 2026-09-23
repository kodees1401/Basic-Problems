package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Pratice1 {

	    public static void main(String[] args) {

	        ArrayList<String> products = new ArrayList<>();

	        products.add("Laptop");
	        products.add("Mobile");
	        products.add("Headphones");
	        products.add("Keyboard");

	        Iterator<String> iterator = products.iterator();

	        System.out.println("List: " + products);
	        System.out.println();

	        System.out.println("Cursor is at the beginning");

	        while (iterator.hasNext()) {

	            System.out.println("Cursor is BEFORE next()");

	            String product = iterator.next();

	            System.out.println("next() returned: " + product);
	            System.out.println("Cursor moved AFTER " + product);
	            System.out.println();
	        }

	        System.out.println("Cursor reached the end.");
	    }
	}
