/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jee.model;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Constants;

/**
 *
 * @author axel
 */
public class DataAccess {

    private Connection dbConn;
    private Statement stmt;
    private ResultSet rs;
    private String dbUrl;
    private String user;
    private String pwd;
    private ArrayList<Employees> employeesList;
    //private ArrayList<EmployeesBean> employeesBeanList;
    private ArrayList<Credentials> usersList;

    public Connection getConnection() {
        try {
            Properties prop = new Properties();
            InputStream input;
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            input = cl.getResourceAsStream(Constants.PATH_PROPERTIES_FILE);
            prop.load(input);
            
            dbUrl = prop.getProperty(Constants.DB_URL);
            user = prop.getProperty(Constants.DB_USER);
            pwd = prop.getProperty(Constants.DB_PWD);

            dbConn = DriverManager.getConnection(dbUrl, user, pwd);

        } catch (SQLException | IOException ex) {
             Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dbConn;

    }

    public Statement getStatement(Connection dbConn) {
        try {
            stmt = dbConn.createStatement();
        } catch (SQLException ex) {
             Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stmt;
    }

    public ResultSet getResultSet(Statement stmt, String query) {
        try {
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
             Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    // Gets the credentials from the db
    public ArrayList getUsers(ResultSet rs) {
        usersList = new ArrayList<>();
        try {
            while (rs.next()) {
                Credentials u = new Credentials();
                u.setLogin(rs.getString("LOGIN"));
                u.setPwd(rs.getString("PWD"));
                usersList.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usersList;
    }

    // Gets the employees from the db
    public ArrayList getEmployees(ResultSet rs) {
        employeesList = new ArrayList<>();
        try {
            while (rs.next()) {
                Employees employee = new Employees();
                employee.setId(rs.getInt("ID"));
                employee.setFirstname(rs.getString("FIRSTNAME"));
                employee.setName(rs.getString("NAME"));
                employee.setTelhome(rs.getString("TELHOME"));
                employee.setTelmob(rs.getString("TELMOB"));
                employee.setTelpro(rs.getString("TELPRO"));
                employee.setAdress(rs.getString("ADRESS"));
                employee.setPostalcode(rs.getString("POSTALCODE"));
                employee.setCity(rs.getString("CITY"));
                employee.setEmail(rs.getString("EMAIL"));
                employeesList.add(employee);
            }
        } catch (SQLException ex) {
             Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employeesList;
    }
}
