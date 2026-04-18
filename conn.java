import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conn {
    // 10. Check your connection here...
    private static final String URL = "jdbc:mysql://localhost:3307/finals";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection established successfully!");
        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());
        }
        return con;
    }

    public static void main(String[] args) {
        getConnection();
    }
}
