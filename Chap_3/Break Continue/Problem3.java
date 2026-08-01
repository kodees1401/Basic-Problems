package breacon; // Stop Printing Numbers When the Sum Becomes Greater Than 50 (using break)

public class Problem3 {
	public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum > 50) {
                break;
            }
            System.out.println(i);
        }

	}

}
