package List;
import java.util.ArrayList;

public class ArrayListExp1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Haridas");
		list.add("Kodees");
		list.add("Manoj");
		list.add("Priya");
		list.add("Samin");
		list.add("Sujitha");
		list.add(0, "Adams");
		
		System.out.println("List" + list);
		System.out.println("Element at index 2: " + list.get(2));
		
		list.set(3,"Manoj");
		System.out.println("Ater Set: " + list );
		
		list.remove("Haridas");
		System.out.println("After Removing Haridas " + list);
		
		System.out.println("Size: " + list.size());
		
		System.out.println("Checking for Manoj:" + list.contains("Manoj"));
		
		System.out.println("Checking the list is Empty: " + list.isEmpty());
		
		System.out.println("Clearing the List" );
		list.clear();
		System.out.println("After Clearing the List" + list );
		System.out.println("Checking the list is Empty: " + list.isEmpty());

	}

}
