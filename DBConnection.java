package todo_manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private DriverManager DbConnectionEvent;

    static Connection getConnection() throws ClassNotFoundException, SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/todo_manager", "root", "root");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
