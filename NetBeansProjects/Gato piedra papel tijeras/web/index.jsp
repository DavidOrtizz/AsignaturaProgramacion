<%-- index.jsp (proyecto GatosConClaseYBocadillos) --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="clases.Gato"%>
<link rel="stylesheet" type="text/css" href="estilos.css" />
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Gatos con clase y bocadillos</title>
    </head>
    <body>
        <h1>Gatos con clase v2</h1>
        <hr>
        
        <%
            Gato g1 = new Gato("Happy", "happy.jpg");
            Gato g2 = new Gato("Felix", "felix.jpg");
            Gato g3 = new Gato("Arbitro", "jack.png");
        %>
        <div class="azul"><% out.println(g1); %></div>
        <div class="rojo"><% out.println(g2); %></div>
        <div><% g1.piedraPapelTijeras(g2, g3); %></div> <!--No encuentro el motivo por el que no lo muestra-->
    </body>
</html>