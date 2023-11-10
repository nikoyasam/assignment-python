import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {
    public static void main(String[] args){
        try {
            // Specify the file path
            File file = new File("output.txt");

            // Create a Scanner object to read from the file
            Scanner scanner = new Scanner(file);

            // Read and print each line from the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // Close the scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

    }
}
