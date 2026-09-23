package FileHandling;

import java.io.FileReader;


public class ASCII {

	public static void main(String[] args) {
		try {
            FileReader fr = new FileReader("output.txt");
            int c = fr.read();
            System.out.print((char) c);
 
            c = fr.read();
            System.out.print((char) c);
 
            c = fr.read();
            System.out.print((char) c);
 
            c = fr.read();
            System.out.print((char) c);
 
            c = fr.read();
            System.out.print(c);
 
            c = fr.read();
            System.out.print(c); // no cast here - prints the ASCII number instead of the character
 
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


	}

}
