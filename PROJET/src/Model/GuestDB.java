/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import projet.DriverConnection;
import projet.MemberException;

/**
 *
 * @author Tommy
 */
public class GuestDB {
    
    
    public String getName() throws MemberException {
        String name = "";
        try {

            Connection conn = DriverConnection.getConnection();
            String query = "SELECT * FROM `guest` ";
            PreparedStatement ps = conn.prepareStatement(query);

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
}
