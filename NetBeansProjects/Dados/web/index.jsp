<%-- 
    Document   : formularioGato
    Created on : 23 may 2023, 15:29:37
    Author     : david
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="estilos.css" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="paginaGato.jsp" id="centro">
            <p>Ponle nombre al primer gato</p>
            <input type="text" name="nombreGato1" size="25" maxlength="40"/>
            <p>Ponle nombre al segundo gato</p>
            <input type="text" name="nombreGato2" size="25" maxlength="40"/>
            <p>Ponle nombre al tercer gato</p>
            <input type="text" name="nombreGato3" size="25" maxlength="40"/> <br>
            <br>
            <input type="submit" value="Enviar" class="button">
        </form>
    </body>
</html>
