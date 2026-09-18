package List;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println("Stack : " + stack);
		System.out.println("Top Element : " + stack.peek());
		
		stack.pop();
		System.out.println("After Pop : " + stack);
		
		System.out.println("Is Stack Empty? : " + stack.empty());
		
		System.out.println("Search the needed one :" + stack.search("A"));
		
	}

}
