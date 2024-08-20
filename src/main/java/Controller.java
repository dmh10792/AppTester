import java.sql.*;
import java.util.*;
import io.github.cdimascio.dotenv.Dotenv;

public class Controller {

    private Connection conn;
    private Dotenv dotenv = Dotenv.load();

    String url = dotenv.get("DB_JDBC_URL");
    String username = dotenv.get("DB_USERNAME");
    String password = dotenv.get("DB_PASSWORD");

    public Controller() {
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

}
