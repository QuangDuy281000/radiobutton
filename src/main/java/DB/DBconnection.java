package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    public static Connection CreatConnect() {
        Connection conn = null;
        String url = "jdbc:sqlserver://ADMIN\\SQLEXPRESS:1433;databaseName=Radio";
        String user = "sa";
        String password = "123";
        try {
            // load driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // tao ket noi
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }
}
