/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;


import conexion.ConexionJDBC;
import java.io.IOException;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Angel Cotto
 */
@WebServlet(name = "formEditClientes", urlPatterns = {"/formEditClientes"})
public class formEditClientes extends HttpServlet {
    
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
            String apellido = request.getParameter("apellidos");
            String dui = request.getParameter("dui");
            String nit = request.getParameter("nit");
            String edad = request.getParameter("edad");
            String sexo = request.getParameter("sexo");
            String ingreso = request.getParameter("fechaingreso");           
            String membresia = request.getParameter("membresia");
            
            
            modelo.Cliente cliente = new modelo.Cliente();
            cliente.setCodigo(Integer.parseInt(Id));
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setSexo(sexo);
            cliente.setEdad(Integer.parseInt(edad));
            cliente.setDui(dui);
            cliente.setNit(nit);
            cliente.setIngreso(ingreso);
            cliente.setMembresia(Integer.parseInt(membresia));
            
            modelo.addClientes editaCliente = new modelo.addClientes();
            editaCliente.edita(cliente);
            ConexionJDBC con = new ConexionJDBC();
            Connection  cn = con.conectar();  
            response.sendRedirect("index.jsp");
    }
    }

