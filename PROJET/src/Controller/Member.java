/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.sql.*;
import projet.MemberException;

/**
 *
 * @author Tommy
 */

/**
 * Classe CONTROLLEUR où on implémente les méthodes dont le Membre peut faire
 * genre créer un nouveau membre, etc
 *
 * @author Tommy
 */
public class Member {

    private final MemberDB mbd = new MemberDB();

    /// Champs de la table
    private String _name;
    private String _username;
    private String _password;
    private int _age;

    /**
     * Un compte est défini par son username et son mdp, on s'en fout de l'age
     *
     * @param username
     * @param password
     */
    public Member(String username, String password) throws MemberException{
        this._name = mbd.getName(username);
        this._username = username;
        this._password = password;
        this._age = mbd.getAge(username);

    }
    public String getName() {
        return this._name;
    }
    
    public String getUsername() {
        return this._username;
    }
    
    public String getPassword() {
        return this._password;
    }
    
    public int getAge() {
        return this._age;
    }
    
    public String[] getColNames() throws SQLException
    {
        return mbd.getColums();
    }
    
    public String[] viewMember()
    {
        String[] member = new String[4];
        member[0] = String.valueOf(_name);
        member[1] = String.valueOf(_username);
        member[2] = String.valueOf(_password);
        member[3] = String.valueOf(_age);
        
        return member;
    }
    
    public void viewAllMembers() throws SQLException, MemberException 
    {
        mbd.getAllMembers();
    }
}
