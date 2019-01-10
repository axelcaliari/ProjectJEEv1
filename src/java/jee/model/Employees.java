/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jee.model;

/**
 *
 * @author axel
 */

public class Employees{

    private Integer id;
    private String name;
    private String firstname;
    private String telhome;
    private String telmob;
    private String telpro;
    private String adress;
    private String postalcode;
    private String city;
    private String email;

    public Employees() {
        this.id = -1;
        this.name = "";
        this.firstname = "";
        this.telhome = "";
        this.telmob = "";
        this.telpro = "";
        this.adress = "";
        this.postalcode = "";
        this.city = "";
        this.email = "";
    }

    public Employees(Integer id) {
        this.id = id;
    }

    public Employees(Integer id, String name, String firstname, String telhome, String telmob, String telpro, String adress, String postalcode, String city, String email) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.telhome = telhome;
        this.telmob = telmob;
        this.telpro = telpro;
        this.adress = adress;
        this.postalcode = postalcode;
        this.city = city;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getTelhome() {
        return telhome;
    }

    public void setTelhome(String telhome) {
        this.telhome = telhome;
    }

    public String getTelmob() {
        return telmob;
    }

    public void setTelmob(String telmob) {
        this.telmob = telmob;
    }

    public String getTelpro() {
        return telpro;
    }

    public void setTelpro(String telpro) {
        this.telpro = telpro;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employees)) {
            return false;
        }
        Employees other = (Employees) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jee.model.Employees[ id=" + id + " ]";
    }
    
}
