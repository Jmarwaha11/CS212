import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        String romanNumerals = "";
        
        // Read the input file
        try {
            File inputFile = new File("input.txt");
            Scanner scanner = new Scanner(inputFile);
            romanNumerals = scanner.nextLine();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: input file not found.");
            System.exit(1);
        }
        
        // Split the Roman numerals by comma
        String[] numeralsArray = romanNumerals.split(",");
        
        // Create the GUI
        RomanNumeralGUI gui = new RomanNumeralGUI(numeralsArray);
        gui.setVisible(true);
    }
}
