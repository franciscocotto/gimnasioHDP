<%-- 
    Document   : index
    Created on : 12-nov-2018, 23:40:36
    Author     : Angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Gimnasio</title>
        <!-- Bootstrap Core CSS -->
        <link href="css/sb-admin.css" rel="stylesheet">
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head> 
    <body>
       <jsp:include page="WEB-INF/Clientes.jsp" />
        
        <script src="js/scripts.js"></script>
        <script>
           
        $(document).ready(function() {
            $('a.edit').on('click', function() {
            var myModal = $('#editarusuario');
             //capturar datos desde tabla
            var currentTR = $(this).closest('tr');
            var cod = currentTR.find("td.codigo").text();
            var nombre = currentTR.find("td.nombre").text();
            var apellido = currentTR.find("td.apellido").text();
            var ndui = currentTR.find("td.ndui").text();
            var nnit = currentTR.find("td.nnit").text();
            var nacimiento = currentTR.find("td.nacimiento").text();
            var membresia = currentTR.find("td.membresia").text();
           //enviar datos a modal
            $('.addcodigo', myModal).val(cod);
            $('.addnombre', myModal).val(nombre);
            $('.addapellido', myModal).val(apellido);
            $('.adddui', myModal).val(ndui);
            $('.addnnit', myModal).val(nnit);
            $('.addnacimiento', myModal).val(nacimiento);
            $('.addmembresia', myModal).prop('selectedIndex',0);
            
        
           
            //mostrar modal
            myModal.modal({ show: true });
              return false;
            });
             });
        </script>

    </body>
</html>
