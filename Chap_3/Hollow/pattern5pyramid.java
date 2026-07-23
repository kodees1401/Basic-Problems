package Chap_3_Hollow;

public class pattern5pyramid {

	public static void main(String[] args) {

		int rows = 4, cols = 7; 
		for (int i = 1; i <= rows; i++) { 
		    for (int j = 1; j <= cols; j++) { 
		        if ( i == rows || i+j == 5 || j-i == 3 ) 
		            System.out.print("* "); 
		        else 
		            System.out.print("  "); 
		    } 
		    System.out.println(); 
		} 
		

	}

}
