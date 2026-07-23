package Chap_3_Hollow;

public class invertedpyramid {

	public static void main(String[] args) {
		
		int rows = 4, cols = 7; 
		for (int i = 1; i <= rows; i++) { 
		    for (int j = 1; j <= cols; j++) { 
		        if ( i == 1 || i==j || i+j == 8 ) 
		            System.out.print("* "); 
		        else 
		            System.out.print("  "); 
		    } 
		    System.out.println(); 
		} 

	}

}
