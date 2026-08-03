import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {
    public static void saveDrugToFile(Drug drug) {
        try {
            FileWriter fileWriter = new FileWriter("drugs.txt", true);
            fileWriter.write(drug.toString() + "\n");
            fileWriter.close();
            System.out.println("Drug saved to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the drug to file.");
            e.printStackTrace();
        }
    }


    public static void readDrugsFromFile() {
        try {
            File file = new File("drugs.txt");
            Scanner fileReader = new Scanner(file);
        
            System.out.println("Drugs in file:");

            while (fileReader.hasNextLine()) {
                String drugData = fileReader.nextLine();
                System.out.println(drugData);
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the drugs from file.");
            e.printStackTrace();
        }
    }
}