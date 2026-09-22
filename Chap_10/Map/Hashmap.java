package Map;
import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        
        students.put(1,"Kodees");
        students.put(2, "Pavithra");
        students.put(3,"Kiruthika");
        students.put(4,"Bharath");
        
        System.out.println("The name of the students : " + students);
        
        String name = students.get(1);
        System.out.println("To Get the student at position 1 :" + name);
        
        for(String value : students.values()) {
        	System.out.println(value);
        }
        
        for(Integer key : students.keySet()) {
        	System.out.println(key);
        }
        
        for(Map.Entry<Integer , String> entry : students.entrySet()) {
        	System.out.println(entry.getKey() + " = " + entry.getValue());
        }
		

	}

}
