/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;


import java.io.IOException;
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
          
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellidos");
            String edad = request.getParameter("edad");
            String dui = request.getParameter("dui");
            String nit = request.getParameter("nit");
            String sexo = request.getParameter("sexo");
            String ingreso = request.getParameter("fechaingreso");
            String membresia = request.getParameter("membresia");
            
            
            modelo.Cliente cliente = new modelo.Cliente();
            
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setEdad(Integer.parseInt(edad));
            cliente.setDui(dui);
            cliente.setNit(nit);
            cliente.setSexo(sexo);
            cliente.setIngreso(ingreso);
            cliente.setMembresia(Integer.parseInt(membresia));
            
            modelo.addClientes nuevoCliente = new modelo.addClientes();
            nuevoCliente.agrega(cliente);
           // RequestDispatcher dispatch = request.getRequestDispatcher("index.jsp");
            //dispatch.forward(request, response);
            response.sendRedirect("index.jsp");
    }


}
