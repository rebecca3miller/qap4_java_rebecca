import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PatientDatabase {
    public static void savePatient(Patient patient) 
    {
        Connection connection = DatabaseConnection.getConnection();

        String sql = "INSERT INTO patients (id, first_name, last_name, date_of_birth) VALUES (?, ?, ?, ?)";
        try 
        {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, patient.getPatientId());
            preparedStatement.setString(2, patient.getPatientFirstName());
            preparedStatement.setString(3, patient.getPatientLastName());
            preparedStatement.setString(4, patient.getPatientDOB());

            preparedStatement.executeUpdate();
            System.out.println("Patient saved to the database successfully.");

            preparedStatement.close();
            connection.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }

    public static void readPatientFromDatabase()
    {
        Connection connection = DatabaseConnection.getConnection();

        String sql = "SELECT * FROM patients";

        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("Patients in the database:");

            while (resultSet.next()) 
            {
                System.out.println("---------------------------");
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String dateOfBirth = resultSet.getString("date_of_birth");

                System.out.println("Patient ID: " + id);
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Date of Birth: " + dateOfBirth);
                System.out.println("---------------------------");
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}