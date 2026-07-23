package Chap_3pattern;

public class invertedtriangle {

	public static void main(String[] args) {
		
		int row=5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=10;k>(i*2-1);k--) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
