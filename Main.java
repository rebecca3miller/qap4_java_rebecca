import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        Drug drug1 = new Drug (1, "Tylenol", 5.99, "500mg");
        Drug drug2 = new Drug (2, "Advil", 6.99, "200mg");

        FileHandler.saveDrugToFile(drug1);
        FileHandler.saveDrugToFile(drug2);

        FileHandler.readDrugsFromFile();

        Connection connection = DatabaseConnection.getConnection();

        if (connection != null) {
            System.out.println("Database connection successful.");
        } else {
            System.out.println("Database connection failed.");
        }

        // Create a new patient and save it to the database

        Patient patient1 = new Patient(1, "John", "Doe", "1990-01-01");

        PatientDatabase.savePatient(patient1);

        PatientDatabase.readPatientFromDatabase();
    }

}
