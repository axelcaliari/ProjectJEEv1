/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author axelc
 */
public class Constants {
    //Constants related to the properties file
    public static final String PATH_PROPERTIES_FILE = "utils/db.properties";
    public static final String DB_URL = "dbUrl";
    public static final String DB_USER = "dbUser";
    public static final String DB_PWD = "dbPwd";

    public static final String LOGIN_FIELD = "loginField";
    public static final String PWD_FIELD = "pwdField";

    public static final String INDEX_PAGE = "WEB-INF/index.jsp";
    public static final String USERS_PAGE = "WEB-INF/users.jsp";
    public static final String LOGIN_PAGE = "WEB-INF/login.jsp";
    
    public static final String ALL_CREDENTIALS = "SELECT * from CREDENTIALS";
    public static final String ALL_EMPLOYEES = "SELECT * from EMPLOYEES";
}
