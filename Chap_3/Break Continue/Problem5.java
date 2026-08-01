package breacon; // Display the Multiplication Table of 5, Stop If the Product Exceeds 30 (using break)

public class Problem5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
            int product = 5 * i;
            if (product > 30) {
                break;
            }
            System.out.println("5 x " + i + " = " + product);
        }

	}

}
