package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepo {
    private Connection connection;
    private String jdbcURL = "jdbc:mysql://localhost:3306/phong_tro";
    private String jdbcUsername = "root";
    private String jdbcPassword = "123456789";

    public BaseRepo() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        return connection;
    }
}
