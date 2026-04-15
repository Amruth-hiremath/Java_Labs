package lab8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class lab8_a {

    public static void main(String[] args) {
        // Step 3: Define file path and content
        String filePath = "data.txt";
        String dataToWrite = "Java File Handling using Streams.";

        // Writing to the file using FileOutputStream
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            byte[] byteData = dataToWrite.getBytes();
            fos.write(byteData);
            fos.close();
            System.out.println("Success: Data written to " + filePath);
        } catch (IOException e) {
            System.out.println("Write Error: " + e.getMessage());
        }

        // Reading from the file using FileInputStream
        try {
            FileInputStream fis = new FileInputStream(filePath);
            System.out.print("Success: Read data from file: ");
            
            int character;
            // Read byte by byte until end of file (-1)
            while ((character = fis.read()) != -1) {
                System.out.print((char) character);
            }
            
            fis.close();
            System.out.println(); 
        } catch (IOException e) {
            System.out.println("Read Error: " + e.getMessage());
        }
    }
}
