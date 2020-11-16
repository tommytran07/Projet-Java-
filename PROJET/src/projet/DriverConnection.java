/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Tommy
 */
public class DriverConnection {
    private static java.sql.Connection connection;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetjava?useSSL=false&serverTimezone=UTC", "root", "");
            //System.out.println("Connection établie avec la BDD");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Connection getConnection() {
        return connection;
    }
}
