package Singelton;


import abstrFabr.constants.Constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionSingelton {
    private static Connection connection = null;


    public static Connection createConnection() {
        if (connection == null) {
            loadDriver();
            getConnection();
        }
        return connection;
    }
    private static void loadDriver() {
        try {
            Class.forName(Constants.DB_DRIVER);
        }
        catch (Exception e) {
            System.out.println("Failed to load the driver " + Constants.DB_DRIVER);
            e.printStackTrace();
        }
    }
     private static Connection getConnection()  {
         try {
             connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER_NAME, Constants.DB_PASS);
         } catch (SQLException e) {
             e.printStackTrace();
         }
         return connection;
    }
}
