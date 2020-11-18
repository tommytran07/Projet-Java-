/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.EmployeeDB;
import Model.MemberDB;
import java.sql.SQLException;
import projet.EmployeeException;
import projet.MemberException;

/**
 *
 * @author Tommy
 */
public class Employee {
    
    private final EmployeeDB edb = new EmployeeDB();
    
    
    private String _name;
    private String _username;
    private String _password;
    
    public Employee(String username, String password) throws EmployeeException {
        this._name = edb.getName(username);
        this._username = username;
        this._password = password;
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
    
    public String[] getColNames() throws SQLException
    {
        return edb.getColumns();
    }
    
    public void changeMemberName(String name) throws MemberException, SQLException {
        
        /// on aura un truc du genre : mdb.nameUpdate(member.getUsername)
        //edb.nameUpdate
        edb.updateName(name);
    }
}
