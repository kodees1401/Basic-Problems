package for_Each;  // Count the Number of Even Numbers in an Integer Array

public class Countevennumber {

	public static void main(String[] args) {
		
		 int[] arr = {10, 15, 20, 25, 30};
	        int count = 0;

	        for (int num : arr) {
	            if (num % 2 == 0) {
	                count++;
	            }
	        }

	        System.out.println("Even Numbers = " + count);

	}

}
