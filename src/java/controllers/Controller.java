/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jee.model.DataAccess;
import jee.model.Employees;
import jee.model.Credentials;
import utils.Constants;

/**
 *
 * @author axelc
 */
@WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {

    DataAccess db;
    ArrayList<Credentials> usersList;
    ArrayList<Employees> employeesList;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controller</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controller at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        request.getRequestDispatcher(Constants.LOGIN_PAGE).forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        // User input
        String loginEntered = request.getParameter(Constants.LOGIN_FIELD);
        String pwdEntered = request.getParameter(Constants.PWD_FIELD);
                
        db = new DataAccess();
        usersList = db.getUsers(
                        db.getResultSet(
                            db.getStatement(
                                db.getConnection()), 
                                Constants.ALL_CREDENTIALS));
        
        //Compare credentials only if the user has entered something
        if (loginEntered != null && pwdEntered != null && !loginEntered.equals("") && !pwdEntered.equals("")) {
            for (Credentials u : usersList) {

                if ((loginEntered.equals(u.getLogin())) && pwdEntered.equals(u.getPwd())) {
                    employeesList = db.getEmployees(
                                        db.getResultSet(
                                            db.getStatement(
                                                db.getConnection()), 
                                                Constants.ALL_EMPLOYEES));
                    
                    // Send to the user page to show the users
                    request.setAttribute("employeesList", employeesList);
                    request.getRequestDispatcher(Constants.USERS_PAGE).forward(request, response);
                }
                else{
                    // Send back to the login page with the wrong credentials message
                    request.setAttribute("connection", "Wrong username or password.");
                    request.getRequestDispatcher(Constants.LOGIN_PAGE).forward(request, response);
                }
            }
        } else {
            // Send back to the login page with message
            request.setAttribute("connection", "Please fill both input.");
            request.getRequestDispatcher(Constants.LOGIN_PAGE).forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
