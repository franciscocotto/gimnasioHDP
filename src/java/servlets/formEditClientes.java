/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;


import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import conexion.ConexionJDBC;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        try {
            String Id = request.getParameter("codigo");
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellidos");
            String dui = request.getParameter("dui");
            String nit = request.getParameter("nit");
            String nacimiento = request.getParameter("fechanacimiento");
            String membresia = request.getParameter("membresia");
            
            modelo.Cliente cliente = new modelo.Cliente();
            cliente.setCodigo(Integer.parseInt(Id));
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setDui(dui);
            cliente.setNit(nit);
            cliente.setNacimiento(nacimiento);
            cliente.setMembresia(membresia);
            
            modelo.addClientes nuevoCliente = new modelo.addClientes();
            nuevoCliente.edita(cliente);
            ConexionJDBC con = new ConexionJDBC();
            Connection  cn = con.conectar();  
            String sql12= "SELECT id_campo, nombre, apellidos, dui, nit, fechanacimiento, membresia\n" +
                    "FROM public.\"Cliente\" ORDER BY id_campo;";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql12);           
        } catch (SQLException ex) {
                    System.out.println("error: "+ex );
                

 

}
        response.sendRedirect("index.jsp");
    }
    }

