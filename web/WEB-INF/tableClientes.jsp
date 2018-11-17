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
            String sql="select id_campo, nombre ,apellidos,sexo,edad,dui,nit,fechaingreso,id_membresia,nombremembresia"
                    + " from public.\"Cliente\" A INNER JOIN membresia B ON A.membresia=B.id_membresia ORDER BY id_campo;";     
            Statement st;
            
                try {
                   st = cn.createStatement();
                   ResultSet r=st.executeQuery(sql); %>
                   <div>                 
<table id="example" class="table tabler hover link table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
    <thead>
        <tr>
            <th>N°</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Sexo</th>
            <th>Edad</th>
            <th>DUI</th>
            <th>NIT</th>
            <th>ID_Cliente</th>
            <th>Fecha Ingreso</th>
            <th>ID_Membresia</th>
            <th>Membresia</th>
            <th>Ver</th>
            <th>Eliminar</th>             
        </tr>
    </thead>
    <tbody>
          <%while(r.next()){%> 
        <tr>
            <td></td>
            <td class="nombre"><%out.println(r.getString("nombre"));%></td>
            <td class="apellido"><%out.println(r.getString("apellidos"));%></td>
            <td class="sexo"><%out.println(r.getString("sexo"));%></td>
            <td class="edad"><%out.println(r.getString("edad"));%></td>
            <td class="ndui"><%out.println(r.getString("dui"));%></td>
            <td class="nnit"><%out.println(r.getString("nit"));%></td>
            <td class="codigo"><center><%out.println(r.getString("id_campo"));%></center></td>
            <td class="ingreso"><%out.println(r.getString("fechaingreso"));%></td>
            <td class="idmembresia"><center><%out.println(r.getString("id_membresia"));%></center></td>
            <td class="membresia"><center><%out.println(r.getString("nombremembresia"));%></center></td>
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