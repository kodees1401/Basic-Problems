package for_Each; //Calculate the Sum of Elements in an Integer Array

public class Calsumofarr {

	public static void main(String[] args) {
		
		 int[] arr = {10, 20, 30, 40, 50};
	        int sum = 0;

	        for (int num : arr) {
	            sum += num;
	        }

	        System.out.println("Sum = " + sum);

	}

}
