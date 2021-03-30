package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ReturnTableValuesJdbc {
    static final String DATABASE_URL = "jdbc:mysql://localhost/myfirstdb";
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    static final String USER = "root";
    static final String PASSWORD = "no pass";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Statement statement = null;
        try {
            System.out.println("Registering JDBC driver...");
            Class.forName(JDBC_DRIVER);

            System.out.println("Creating connection to database...");
            connection = DriverManager.getConnection(DATABASE_URL,USER,PASSWORD);

            System.out.println("Reading table...");
            statement = connection.createStatement();

            String SQL = "update test set Day=2";

            statement.executeUpdate(SQL);
            System.out.println("Values are returned");
        } finally {
            if(statement != null){
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
        }
    }
}
