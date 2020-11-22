/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Tommy
 */
public class Ticket {
    private String _name;
    private String _flightno;
    private String _dcity;
    private String _acity;
    private String _ddate;
    private String _dtime;
    private String _atime;
    private String _fclass;
    private double _price;
    private int _seats;
    
    public Ticket(String name, String flightno, String dcity, String acity, String ddate, String dtime, String atime, String fclass, double price, int seats) {
        _name = name;
        _flightno = flightno;
        _dcity = dcity;
        _acity = acity;
        _ddate = ddate;
        _dtime = dtime;
        _atime = atime;
        _fclass = fclass;
        _price = price;
        _seats = seats;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public String getFlightno() {
        return _flightno;
    }

    public void setFlightno(String _flightno) {
        this._flightno = _flightno;
    }

    public String getDcity() {
        return _dcity;
    }

    public void setDcity(String _dcity) {
        this._dcity = _dcity;
    }

    public String getAcity() {
        return _acity;
    }

    public void setAcity(String _acity) {
        this._acity = _acity;
    }

    public String getDdate() {
        return _ddate;
    }

    public void setDdate(String _ddate) {
        this._ddate = _ddate;
    }

    public String getDtime() {
        return _dtime;
    }

    public void setDtime(String _dtime) {
        this._dtime = _dtime;
    }

    public String getAtime() {
        return _atime;
    }

    public void setAtime(String _atime) {
        this._atime = _atime;
    }

    public String getFclass() {
        return _fclass;
    }

    public void setFclass(String _fclass) {
        this._fclass = _fclass;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double _price) {
        this._price = _price;
    }

    public int getSeats() {
        return _seats;
    }

    public void setSeats(int _seats) {
        this._seats = _seats;
    }
    
}
