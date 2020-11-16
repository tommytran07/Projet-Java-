/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import projet.DriverConnection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Classe modèle où on implémente toutes les méthodes pour relier la base de
 * données en mode, recupérer les infos des champs, ajouter de nouvelles valeurs
 * insérer ce qu'on veut dans les champs
 *
 * @author Tommy
 */
public class MemberDB {

    /**
     * on recupère le mot de passe d'un membre à partir de son username
     * @param username
     * @return 
     */
    public String getPassword(String username) {
        String password = "";
        try {
            
            Connection conn = DriverConnection.getConnection();
            String query = "SELECT * FROM `member` WHERE `username`=? ";
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                password = rs.getString("password");
            }
            else 
                JOptionPane.showMessageDialog(null, "The account "+ username + " does not exist");
            
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return password;
    }
    
    /**
     * récupère l'age du membre en fonction de l'username
     * @param username
     * @return 
     */
    public int getAge(String username) {
        
        int age = 0;
        try {
            
            Connection conn = DriverConnection.getConnection();
            String query = "SELECT * FROM member WHERE username=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                age = Integer.parseInt(rs.getString("age")); /// On convertit le string en int
            }
            else 
                JOptionPane.showMessageDialog(null, "The account "+ username + "does not exist");
            
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return age;
        
    }
    
    public void newMember(String username, String password, int age) {
        
        try {
            Connection conn = DriverConnection.getConnection();
            Statement myStmt = conn.createStatement();
            String query = "INSERT INTO member (username, password, age) VALUES ("+username+", "+password+", "+age+");";
           
            myStmt.executeUpdate(query);
            myStmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
