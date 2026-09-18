package List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		System.out.println("Vector :" + v);
		
		System.out.println("Element at 1 :" + v.elementAt(1));
		
		v.removeElement(10);
		System.out.println("After Remove : " + v);
		
		System.out.println("Capacity of Vector : " + v.capacity());
		
		v.removeAllElements();
		System.out.println("Vector After removed All Element : " + v);
		

	}

}
