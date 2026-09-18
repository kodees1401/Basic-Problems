package List;
import java.util.Stack;

public class StackExample1 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("Kodees");
		stack.push("Bharath");
		stack.push("Karthi");
		
		System.out.println("Stack : " + stack);
		System.out.println("Top Element : " + stack.peek());
		
		stack.pop();
		System.out.println("After Pop : " + stack);
		
		System.out.println("Is Stack Empty? : " + stack.empty());
		
		System.out.println("Search the needed one :" + stack.search("Bharath"));

	}

}
