/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import projet.DriverConnection;
import java.sql.*;
import javax.swing.*;
import projet.EmployeeException;
/**
 *
 * @author Tommy
 */
public class EmployeeDB {
    
    public String getName(String username) throws EmployeeException {
        String name = "";
        try {
            
            Connection conn = DriverConnection.getConnection();
            String query = "SELECT * FROM `employee` WHERE `username`=? ";
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                name = rs.getString("name");
            }
            else        
                throw new EmployeeException("Enter valid credentials");            
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return name;
    }
    
    public String getPassword(String username) throws EmployeeException {
        String password = "";
        try {
            
            Connection conn = DriverConnection.getConnection();
            String query = "SELECT * FROM `employee` WHERE `username`=? ";
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                password = rs.getString("password");
            }
            else 
                throw new EmployeeException("Enter valid credentials");   
            
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return password;
    }
    
    public String[] getColumns() throws SQLException
    {
        String[] colNames;
        
        Connection conn = DriverConnection.getConnection();
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        String query = "SELECT * FROM `employee`";
        ResultSet rs = stmt.executeQuery(query);
        ResultSetMetaData meta = rs.getMetaData();
        colNames = new String[meta.getColumnCount()];
        for(int i = 0; i< meta.getColumnCount(); i++)
        {
            colNames[i] = meta.getColumnLabel(i+1);;
        }
        stmt.close();
        return colNames;
    }
    
    public void updateName(String name) throws SQLException {
        
        Connection conn = DriverConnection.getConnection();
        Statement stmt = conn.createStatement();
       // String query = " UPDATE member SET name= "+name+" ";
        String query2 = " UPDATE `member` INNER JOIN `employee` ON `name` SET `name` = "+name+"";
        stmt.executeUpdate(query2);
        stmt.close();
        }
    
}
