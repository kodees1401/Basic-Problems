package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
 
public class MainClass {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.txt", true); // true = append mode
            BufferedWriter bw = new BufferedWriter(fw);
 
            bw.write("Hey Man");
            bw.newLine();
            bw.write("Okay");
            bw.close();
 
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println("Something has happened");
        }
    }
}

