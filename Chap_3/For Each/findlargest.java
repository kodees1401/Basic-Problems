package for_Each; // Find the Largest Element in an Integer Array

public class findlargest {

	public static void main(String[] args) {
		int[] arr = {10, 50, 20, 80, 40};

        int largest = arr[0];

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Largest = " + largest);

	}

}
