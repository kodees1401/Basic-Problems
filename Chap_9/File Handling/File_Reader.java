package FileHandling;

import java.io.FileReader;
import java.io.BufferedReader;

public class File_Reader {

	public static void main(String[] args) {
		
        try {
            FileReader fr = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(fr);
 
            String line = br.readLine();
 
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
 
            br.close();
        } catch (Exception e) {
        }

	}

}
