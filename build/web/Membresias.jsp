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
            var costo = currentTR.find("td.costo").text().replace("$", "");
            var get=currentTR.find("td.beneficios").text().replace("\n", "");
            var beneficios = get.split(",");  
            var names = [beneficios];
              $.each(names, function(index, beneficio){
                         $(":checkbox[value='"+beneficio+"']").prop("checked","true");
                    }); 
//            $.each(beneficios, function( index, beneficios ) {
//                 $(":checkbox[value='"+beneficios+"']").prop("checked","true");
//            });
           //enviar datos a modal
            $('.addcodigo', myModal).val(cod);
            $('.addnombre', myModal).val(nombre);
            $('.adddescripcion', myModal).val(descripcion);
            $('.addcosto', myModal).val(costo);

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

$('#select-all').click(function(event) {   
    if(this.checked) {
        // Iterate each checkbox
        $(':checkbox').each(function() {
            this.checked = true;                        
        });
    } else {
        $(':checkbox').each(function() {
            this.checked = false;                       
        });
    }
});
            
        </script>
    </body>
</html>
