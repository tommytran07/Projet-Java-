/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
import java.sql.*;
import java.util.Date;

/**
 *
 * @author PC
 */
public class Flight {
    
    private final FlightDB fbd = new FlightDB();

    /// Champs de la table
    private String _dcity;
    private String _acity;
    private String _ddate ;
    private String _adate ; 
    private int _flightno ; 
    private String _dtime ; 
    private String _atime ; 
    private double _price ; 
    private String _fclass ; 
    
    
    public Flight (String dcity, String acity, String ddate, String adate, int flightno, String dtime, String atime, double price, String classs) {
        this._dcity = dcity;
        this._acity = acity;
        this._ddate = ddate;
        this._adate = adate;
        this._flightno = flightno;
        this._dtime = dtime;
        this._atime = atime;
        this._price = price;
        this._fclass = classs;
    }

    public String getDcity() {
        return _dcity;
    }

    public String getAcity() {
        return _acity;
    }

    public String getDdate() {
        return _ddate;
    }

    public String getAdate() {
        return _adate;
    }

    public int getFlightno() {
        return _flightno;
    }

    public String getDtime() {
        return _dtime;
    }

    public String getAtime() {
        return _atime;
    }

    public double getPrice() {
        return _price;
    }

    public String getFclass() {
        return _fclass;
    }
    
        
    
}
