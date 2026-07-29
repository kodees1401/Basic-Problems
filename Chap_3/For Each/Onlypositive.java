package for_Each;

public class Onlypositive {

	public static void main(String[] args) {
		
		 int[] arr = {-5, 10, -3, 20, 15, -8};

	        for (int num : arr) {
	            if (num > 0) {
	                System.out.print(num + " ");
	            }
	        }

	}

}
