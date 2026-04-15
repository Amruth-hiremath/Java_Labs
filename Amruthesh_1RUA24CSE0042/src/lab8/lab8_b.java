package lab8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lab8_b {

    public static void main(String[] args) {
        // Define file path
        String filePath = "output.txt";
        String contentToWrite = "Reading and writing using FileReader and FileWriter.";

        // Step 3: Use FileWriter with try-with-resources
        try (FileWriter fw = new FileWriter(filePath)) {
            fw.write(contentToWrite);
            System.out.println("Success: Content written to the file.");
        } catch (IOException e) {
            System.out.println("Write Error: " + e.getMessage());
        }

        // Step 3: Use FileReader with try-with-resources
        try (FileReader fr = new FileReader(filePath)) {
            StringBuilder sb = new StringBuilder();
            int character;
            
            // Read data character by character
            while ((character = fr.read()) != -1) {
                sb.append((char) character);
            }
            
            System.out.println("Success: Content read from the file:");
            System.out.println(sb.toString());
        } catch (IOException e) {
            System.out.println("Read Error: " + e.getMessage());
        }
    }
}
