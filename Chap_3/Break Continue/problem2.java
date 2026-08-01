package breacon; // Print Numbers from 1 to 20, Skipping Multiples of 3 (using continue)

public class problem2 {

	public static void main(String[] args) {
		
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
	}

}
