package Chap_3_Hollow;

public class diamondstar {

	public static void main(String[] args) {
		
		int rows = 7, cols = 7; 
		for (int i = 1; i <= rows; i++) { 
			 for (int j = 1; j <= cols; j++) { 
			 if ( i+j == 11 || j+i == 5 || i*j== 10 || i*j==18) 
		            System.out.print("* "); 
		        else 
		            System.out.print("  "); 
		    } 
		    System.out.println(); 
		} 
	}

}
