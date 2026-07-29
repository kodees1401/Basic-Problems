package for_Each; // Find the Average of Elements in a Double Array

public class Averageofele {

	public static void main(String[] args) {
		
		double[] arr = {10.5, 20.5, 30.5, 40.5};
        double sum = 0;

        for (double num : arr) {
            sum += num;
        }

        double average = sum / arr.length;

        System.out.println("Average = " + average);

	}

}
