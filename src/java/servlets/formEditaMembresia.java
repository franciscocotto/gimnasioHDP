/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Angel Cotto
 */
@WebServlet(name = "formEditaMembresia", urlPatterns = {"/formEditaMembresia"})
public class formEditaMembresia extends HttpServlet {

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
            String nombre = request.getParameter("nombre");
            String descripcion = request.getParameter("descripcion");
            String costo = request.getParameter("costo");
            String beneficios [] = request.getParameterValues("beneficio");
            
            modelo.Membresias membresia = new modelo.Membresias();
            membresia.setCodigo(Integer.parseInt(Id));
            membresia.setNombre(nombre);
            membresia.setDescripcion(descripcion);
            membresia.setCosto(costo);
            membresia.setBeneficios(beneficios);
            
            
            modelo.addMembresias nuevaMembresia = new modelo.addMembresias();
            nuevaMembresia.edita(membresia);
           // RequestDispatcher dispatch = request.getRequestDispatcher("index.jsp");
            //dispatch.forward(request, response);
            response.sendRedirect("membresias.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
