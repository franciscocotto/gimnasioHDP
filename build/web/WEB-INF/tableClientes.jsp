<%-- 
    Document   : tableClientes
    Created on : 12-nov-2018, 23:56:28
    Author     : Angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<table id="example" class="table tabler hover link table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
    <thead>
        <tr>
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
        <tr>
            <td>Alex Guardado</td>
            <td>Administrativo</td>
            <td>Alex Guardado</td>
            <td>Administrativo</td>
            <td>Alex Guardado</td>
            <td>Administrativo</td>
            <td>
                <button type="button" class="center btn btn-default"  data-target="#agregarusuario" data-toggle="modal">Ver Datos</button>
            </td>
            <td>
                <button type="button" class="center btn btn-default " data-toggle="modal" data-target="#confirmDelete">Eliminar </button>
            </td>

        </tr>                                         
    </tbody>
</table>