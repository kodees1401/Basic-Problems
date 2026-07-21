package Chap_3pattern;

public class pattern2 {

	public static void main(String[] args) {
		
		int num=2;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3; j++) {
				System.out.print(num + "\t");
				num+=2;
			}
			System.out.println("");
		}

	}

}
