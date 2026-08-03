import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://127.0.0.1:5432/postgres";

    private static final String USER = "postgres";
    private static final String PASSWORD = "Document45";

    public static Connection getConnection()
    {
        Connection connection = null;

        try
        {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database successfully.");

        }
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println("PostgreSQL JDBC Driver not found.");
            e.printStackTrace();
        }
        
        return connection;
    }
}
