package Chap_3_Hollow;

public class hourglass {

	public static void main(String[] args) {


		    int rows = 7;
	        int cols = 7;

	        for (int i = 1; i <= rows; i++) {

	            for (int j = 1; j <= cols; j++) {

	                if (i == 1 || i == rows) {
	                    // First and last row
	                    System.out.print("* ");
	                }
	                else if (i <= 4) {
	                    // Upper half
	                    if (i == j || i + j == 8) {
	                        System.out.print("* ");
	                    }
	                    else {
	                        System.out.print("  ");
	                    }
	                }
	                else {
	                    // Lower half
	                    if ( i == j || i + j == 8 ) {
	                        System.out.print("* ");
	                    }
	                    else {
	                        System.out.print("  ");
	                    }
	                }
	            }
	            System.out.println();
	        }
		

	}

}
