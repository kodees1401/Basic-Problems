package breacon; // Print All Odd Numbers from 1 to 15 (using continue)

public class Problem4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

	}

}
