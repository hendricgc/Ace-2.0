/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author larodrigues
 */
public class ConnectionFactory {
    private static Connection conn;
    private static final String URL =
            "jdbc:postgresql://localhost/ace";
    
    public static Connection getConnection() {
        if (conn == null) {
            try {
                //https://jdbc.postgresql.org/
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection(URL, 
                        "postgres", "12345");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                System.exit(1);             
            }
        }
        return conn;
    }
}
