package A;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConnection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/student";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }
}
