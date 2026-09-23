package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
public class SimpleFileWrite {
    public static void main(String[] args) {
        try {
            // Create FileWriter object to open (or create) a file
            FileWriter file = new FileWriter("myfile.txt");
 
            // Write content into the file
            file.write("Hello, this is a simple file writing example.");
 
            // Close file after writing
            file.close();
 
            System.out.println("File written successfully!");
            System.out.println(new File("myfile.txt").getAbsolutePath());
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
        
    }
}
