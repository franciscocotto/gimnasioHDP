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
          Connection  cn2 = con.conectar();
            String sql2="select * from public.membresia ORDER BY id_membresia;";     
            Statement st2;
            
                try {
                   st2 = cn2.createStatement();
                   ResultSet r=st2.executeQuery(sql2); %>
                   <div>                 
<table id="example" class="table tabler hover link table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
    <thead>
        <tr>
            <th>N°</th>
            <th>Nombre Membresia</th>
            <th>ID_membresia</th>
            <th>Descripci&oacute;n</th>
            <th>Ver</th>
            <th>Eliminar</th>             
        </tr>
    </thead>
    <tbody>
          <%while(r.next()){%> 
        <tr>
            <td></td>
            <td class="apellido"><%out.println(r.getString("nombremembresia"));%></td>
            <td class="sexo"><%out.println(r.getString("id_membresia"));%></td>
            <td class="edad"><%out.println(r.getString("descripcionmembresia"));%></td>
            <td>
                <a class="center btn btn-default edit">
                    <span class="glyphicon glyphicon-pencil"></span>                  
                </a>
            </td>
            <td>
                <a class="center btn btn-default delete">
                   <span class="glyphicon glyphicon-trash"> </span>                 
                </a>
            </td>

        </tr> 
         <%}%>
    </tbody>
</table>
     <% } catch (SQLException ex) {
                    System.out.println("error: "+ex );
     }%>     