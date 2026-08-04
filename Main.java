import java.sql.Connection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice = 0;

        while (choice != 5) {

            System.out.println();
            System.out.println("===== MENU =====");
            System.out.println("1. Save Drug to File");
            System.out.println("2. Read Drugs from File");
            System.out.println("3. Save Patient to Database");
            System.out.println("4. Read Patients from Database");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    Drug drug1 = new Drug (1, "Tylenol", 5.99, "500mg");
                    Drug drug2 = new Drug (2, "Advil", 6.99, "200mg");

                    FileHandler.saveDrugToFile(drug1);
                    FileHandler.saveDrugToFile(drug2);

                    break;
                case 2:
                    FileHandler.readDrugsFromFile();

                    break;
                case 3:
                    Connection connection = DatabaseConnection.getConnection();

                    if (connection != null) {
                        System.out.println("Database connection successful.");
                    } else {
                        System.out.println("Database connection failed.");
                    }

                    break;
                case 4:
                    PatientDatabase.readPatientFromDatabase();

                    break;
                case 5:
                    System.out.println("Exiting the program.");

                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        input.close();
    }
}
