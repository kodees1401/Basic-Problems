package for_Each; // Concatenate All Strings in a String Array

public class Concatenate {

	public static void main(String[] args) {
		
		 String[] words = {"Welcome", " To ", "Java", " ", "World"};
	        String result = "";

	        for (String word : words) {
	            result += word;
	        }

	        System.out.println(result);

	}

}
