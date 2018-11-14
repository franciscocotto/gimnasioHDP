<%-- 
    Document   : tableClientes
    Created on : 12-nov-2018, 23:56:28
    Author     : Angel
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%conexion.ConexionJDBC con = new conexion.ConexionJDBC();
          Connection  cn = con.conectar();
            String sql1="select * from public.\"Cliente\"";
            Statement st;
            
                try {
                   st = cn.createStatement();
                   ResultSet r=st.executeQuery(sql1); %>
                   
<table id="example" class="table tabler hover link table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
    <thead>
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>DUI</th>
            <th>NIT</th>
            <th>Edad</th>
            <th>Membresia</th>
            <th>Ver</th>
            <th>Eliminar</th>             
        </tr>
    </thead>
    <tbody>
          <%while(r.next()){%> 
        <tr>
            <td><%out.println(r.getString("id_campo"));%></td>
            <td><%out.println(r.getString("nombre"));%></td>
            <td><%out.println(r.getString("apellidos"));%></td>
            <td><%out.println(r.getString("dui"));%></td>
            <td><%out.println(r.getString("nit"));%></td>
            <td><%out.println(r.getString("fechanacimiento"));%></td>
            <td><%out.println(r.getString("membresia"));%></td>
            <td>
                <button type="button" class="center btn btn-default"  data-target="#agregarusuario" data-toggle="modal">Ver Datos</button>
            </td>
            <td>
                <button type="button" class="center btn btn-default " data-toggle="modal" data-target="#confirmDelete">Eliminar </button>
            </td>

        </tr> 
         <%}%>
    </tbody>
</table>
     <% } catch (SQLException ex) {
                    System.out.println("error: "+ex );
     }%>     