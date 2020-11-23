/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import projet.DriverConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import projet.MemberException;

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
     *
     * @param username
     * @return
     */
    public String getName(String username) throws MemberException {
        String name = "";
        try {

            Connection conn = DriverConnection.getConnection();
            String query = "SELECT * FROM `member` WHERE `username`=? ";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                name = rs.getString("name");
            } else {
                /// Si le compte n'existe pas, ou bien si l'utilisateur ne rentre rien alors on lance une exception
                 throw new MemberException("Enter valid credentials");
            }

            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return name;
    }
    public String getUsername() throws MemberException {
        String username = "";
        try {

            Connection conn = DriverConnection.getConnection();
            String query = "SELECT username FROM `member`";
            PreparedStatement ps = conn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                username = rs.getString("username");
            } else {
                /// Si le compte n'existe pas, ou bien si l'utilisateur ne rentre rien alors on lance une exception
                 throw new MemberException("Enter valid credentials");
            }

            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return username;
    }
    public String getPassword(String username) throws MemberException {
        String password = "";
        try {

            Connection conn = DriverConnection.getConnection();
            String query = "SELECT password FROM `member` WHERE `username`=? ";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                password = rs.getString("password");
            } else {
                /// Si le compte n'existe pas, ou bien si l'utilisateur ne rentre rien alors on lance une exception
                throw new MemberException("Enter valid credentials");
            }

            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return password;
    }


    public void newMember(String name, String username, String password) {

        try {
            Connection conn = DriverConnection.getConnection();

            String query = "INSERT INTO member (name, username, password) VALUES (?,?,?);";
            PreparedStatement ps = conn.prepareStatement(query);

            /**
             * Correspond au VALUES (?,?,?) avec chaque pt d'interrogation
             * correspondant à ce qu'il faut 1er ? -> username 2e ? -> password
             * 3e ? -> age
             */
            ps.setString(1, name);
            ps.setString(2, username);
            ps.setString(3, password);

            // on met rien dans les parentheses, pas de query dans la parenthese vu que c'est un preparedstatement
            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String[] getColums() throws SQLException
    {
        String[] colNames;
        
        Connection conn = DriverConnection.getConnection();
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        String query = "SELECT * FROM `member`";
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
    
    
    public void getAllMembers() throws SQLException, MemberException {
        
        
        try {
            Connection conn = DriverConnection.getConnection();
        Statement stmt = conn.createStatement();
        
        String query = "SELECT * from member";
        
        ResultSet rs = stmt.executeQuery(query);
        
        if (rs.next()) {
            do {
                String name = rs.getString("name");
                String username = rs.getString("username");
                String password = rs.getString("password");
                
                String table[] = {name, username, password};
                
            } while (rs.next());
        }
        else {
            throw new MemberException("No records were found");
        }
          stmt.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    public String[][] getTableData() throws SQLException
    {
        String[][] tableData;
        
        Connection conn = DriverConnection.getConnection();
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        String query = "SELECT * FROM member";
        ResultSet rs = stmt.executeQuery(query);
        ResultSetMetaData meta = rs.getMetaData();
        
        rs.last(); 
        int nbRows = rs.getRow();
        rs.first();
        
        tableData = new String[nbRows][meta.getColumnCount()];
        for(int row = 0; row<nbRows ; row++){
            for(int col = 0; col< meta.getColumnCount(); col++){
                tableData[row][col] = meta.getColumnLabel(col+1);
            }
            rs.next();
        }
        stmt.close();
        conn.close();
        return tableData;
    }
    
    public void updateName(String name) throws SQLException {
        
        Connection conn = DriverConnection.getConnection();
        Statement stmt = conn.createStatement();
        String query = " UPDATE member SET name= "+name+" ";
        stmt.executeUpdate(query);
        stmt.close();
        conn.close();
        }
    
}

