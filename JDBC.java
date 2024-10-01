package jdbc;

import bookstrore.Ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) {
        Connection connection;
        System.out.println("Welcome to Java Database Connection ");
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_service",
                    System.getenv("username"), System.getenv("password"));
            System.out.println("Connection done ...");
            Statement statement = connection.createStatement();
            statement.execute("update books set bookPrice= 150 where bookId=1002");
            ResultSet resultSet = statement.executeQuery("select * from books");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2)+" "+resultSet.getString("bookPrice"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
