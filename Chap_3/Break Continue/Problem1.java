package breacon; // Find the First Number Divisible by 7 Between 1 and 100 (using break)

public class Problem1 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println("First number divisible by 7: " + i);
                break;
            }
        }

	}

}
