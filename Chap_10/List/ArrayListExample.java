package List;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Mango");
		list.add("Pineapple");
		list.add(1,"Orange");
		
		System.out.println("List" + list);
		System.out.println("Element at index 2: " + list.get(2));
		
		list.remove("Pineapple");
		System.out.println("After Removing Pineapple " + list);
		
		list.set(1,"Banana");
		System.out.println("Ater Set: " + list );
		
		System.out.println("Size: " + list.size());
		
		
	}

}
