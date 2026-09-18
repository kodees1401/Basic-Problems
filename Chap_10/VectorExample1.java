package List;

import java.util.Vector;

public class VectorExample1 {

	public static void main(String[] args) {
	Vector<String> v = new Vector<>();
		
		v.add("Pavithra");
		v.add("Kiruthika");
		v.add("Bharath");
		v.add("Karthikeyan");
		
		v.addElement("Kodeeswaran");
		
		System.out.println("Vector :" + v);
		
		System.out.println("Element at 1 :" + v.elementAt(1));
		
		v.removeElement("Kodeeswaran");
		System.out.println("After Remove my Name : " + v);
		
		System.out.println(v.size());
		System.out.println("Capacity of Vector : " + v.capacity());
		
		v.removeAllElements();
		System.out.println("Vector After removed All Element : " + v);
		

	}

}
