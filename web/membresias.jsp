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
       <jsp:include page="WEB-INF/AddMembresias.jsp" />
        
        <script src="js/scripts.js"></script>
        <script>
           
            $('a.edit').on('click', function() {
            var myModal = $('#readmembresia');
             //capturar datos desde tabla
            var currentTR = $(this).closest('tr');
            var nombre = currentTR.find("td.nombre").text();
            var cod = currentTR.find("td.codigo").text();
            var descripcion = currentTR.find("td.descripcion").text();
            var costo = currentTR.find("td.costo").text().replace("$", "");;
            var beneficios = currentTR.find("td.beneficios").text();  
            var array = [];
//            for(j=0;j<beneficios.length;j++){
//                array[k]               
//            }
           // var membresia = currentTR.find("td.idmembresia").text().replace(/\n/g, '');
           //enviar datos a modal
            $('.addcodigo', myModal).val(cod);
            $('.addnombre', myModal).val(nombre);
            $('.adddescripcion', myModal).val(descripcion);
            $('.addcosto', myModal).val(costo);
//            for(k=1;k<array.length;k++)
//            {
//                
//                    array[k].checked = true;
//            } 
           $(".c1", myModal).attr("checked", true);
           $(".c2", myModal).attr("checked", true);
           $(".c3", myModal).attr("checked", true);
           $(".c4", myModal).attr("checked", true);
           $(".c5", myModal).attr("checked", true);
           $(".c6", myModal).attr("checked", true);
           $(".c7", myModal).attr("checked", true);

           
            myModal.modal({ show: true });
              return false;
            });


          $('a.delete').on('click', function() {
            var myModal = $('#confirmDelete');
             //capturar datos desde tabla
            var currentTR = $(this).closest('tr');
            var cod = currentTR.find("td.codigo").text();
           //enviar datos a modal
            $('.addcodigo', myModal).val(cod);
            //mostrar modal
            myModal.modal({ show: true });
              return false;
            });
            

        $(function() {
            $('#money').maskMoney();
        })

            
        </script>
    </body>
</html>
