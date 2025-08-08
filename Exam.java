package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exam {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String dbDriver = "com.mysql.jdbc.Driver";
        String dbURL = "jdbc:mysql:// localhost:3306/";
        // Database name to access
        String dbName = "book_service";
        String dbUsername = "root";
        String dbPassword = System.getenv("password");

//        Class.forName(dbDriver);
        Connection con = DriverManager.getConnection(dbURL + dbName,dbUsername,dbPassword);
        System.out.println("Connection done ");
    }
}
