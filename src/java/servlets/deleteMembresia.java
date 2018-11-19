/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Angel Cotto
 */
@WebServlet(name = "deleteMembresia", urlPatterns = {"/deleteMembresia"})
public class deleteMembresia extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             String Id = request.getParameter("codigo");
             modelo.Membresias membresia = new modelo.Membresias();
             membresia.setCodigo(Integer.parseInt(Id));
             
            modelo.addMembresias borrarMembresia = new modelo.addMembresias();
            String myCustomMsg="";
        try {
            borrarMembresia.elimina(membresia);
        } catch (SQLException ex) {
          response.sendRedirect("error.jsp");
          return;
        }
        
           response.sendRedirect("membresias.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
