/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Flight;
import projet.DriverConnection;
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
public class FlightDB {

    public String getDepartCity(int flightno) {
        
        String dcity = "";
        try {
            Connection conn = DriverConnection.getConnection();
            String query = "SELECT dcity FROM flights";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            while(rs.next()) { 
               dcity = rs.getString("dcity");
            }
                
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dcity;
    }
    
    public String getArrivalCity(int flightno) {
        
        String acity = "";
        try {
            Connection conn = DriverConnection.getConnection();
            String query = "SELECT acity FROM flights";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);   
            while(rs.next()) {
               acity = rs.getString("acity");
            }
            ps.close();   
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return acity;
    }
    
    public String getDepartDate(int flightno) {
        
        String ddate = "" ;
        try {
            Connection conn = DriverConnection.getConnection();
            String query = "SELECT ddate FROM flights";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);

            while(rs.next()) {
               ddate = rs.getString("ddate");
            }
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return ddate;
    }
    
    public String getArrivalDate(int flightno) {
        String adate = "";
        try {
            Connection conn = DriverConnection.getConnection();
            String query = "SELECT adate FROM flights";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);

            while(rs.next()) {
               adate = rs.getString("adate");
            }
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return adate;
    }
    
    public void getFlightNumber() {
        try {
            Connection conn = DriverConnection.getConnection();
            String query = "SELECT flightno FROM flights";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            while(rs.next()) {
               System.out.println(rs.getString("flightno"));
            }
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String getDepartTime(int flightno) {
        
        String dtime = "";
        try {
            Connection conn = DriverConnection.getConnection();
            String query = "SELECT dtime FROM flights";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            while(rs.next()) {
               dtime = rs.getString("dtime");
            }
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dtime;
    }
    
    public String getArrivalTime(int flightno) {
        
        String atime = "";
        try {
            Connection conn = DriverConnection.getConnection();
            String query = "SELECT atime FROM flights";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            while(rs.next()) {
               System.out.println(rs.getString("atime"));
            }
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return atime;
    } 
    
    public double getPrice(int flightno) {
        
        double price = 0;
        try {
            Connection conn = DriverConnection.getConnection();
            String query = "SELECT price FROM flights";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            while(rs.next()) {
               price = Double.parseDouble(rs.getString("price"));
            }
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return price;
    } 
    
    public String getClass(int flightno) {
        
        String fclass = "";
        try {
            Connection conn = DriverConnection.getConnection();
            String query = "SELECT class FROM flights";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            while(rs.next()) {
               fclass = rs.getString("class");
            }
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return fclass;
    }         
    
    
    
    
}