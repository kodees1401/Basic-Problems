package for_Each; // Count the Number of Occurrences of a Specific Element in an Array

public class NumberofOcc {

	public static void main(String[] args) {
		
		 int[] arr = {10, 20, 30, 20, 40, 20};
	        int search = 20;
	        int count = 0;

	        for (int num : arr) {
	            if (num == search) {
	                count++;
	            }
	        }

	        System.out.println("Occurrences = " + count);

	}

}
