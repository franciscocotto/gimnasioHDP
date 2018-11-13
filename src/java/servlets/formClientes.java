/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;


import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Angel Cotto
 */
@WebServlet(name = "formClientes", urlPatterns = {"/formClientes"})
public class formClientes extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellidos");
            String dui = request.getParameter("dui");
            String nit = request.getParameter("nit");
            String nacimiento = request.getParameter("fechanacimiento");
            String membresia = request.getParameter("membresia");
            
            modelo.Cliente cliente = new modelo.Cliente();
            
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setDui(dui);
            cliente.setNit(nit);
            cliente.setNacimiento(nacimiento);
            cliente.setMembresia(membresia);
            
            modelo.addClientes nuevoCliente = new modelo.addClientes();
            nuevoCliente.agrega(cliente);
            RequestDispatcher rd = request.getRequestDispatcher("addClientes.jsp");
            rd.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
