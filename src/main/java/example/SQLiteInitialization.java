package example;
import org.sqlite.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class SQLiteInitialization {
    public static void main(String[] args) {
        String url ="jdbc:sqlite:booksdatabase.db";

        try{
            DriverManager.getConnection(url);
            System.out.println("Connected to Database");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}