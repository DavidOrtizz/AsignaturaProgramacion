<%-- paginaGato.jsp (proyecto GatosConClaseYBocadillos) --%>
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
        <% request.setCharacterEncoding("UTF-8"); %>
        <h1>Gatos con clase v2</h1>
        <hr>
        
        <%
            Gato g1 = new Gato(request.getParameter("nombreGato1"), "happy.jpg");
            Gato g2 = new Gato(request.getParameter("nombreGato2"), "felix.jpg");
            Gato g3 = new Gato(request.getParameter("nombreGato3"), "jack.png");
        %>
        <div class="azul"><% out.println(g1); %></div>
        <div class="rojo"><% out.println(g2); %></div>
        <div class="naranja"><% out.println(g3); %></div>
        <div class="azul"><% out.println(g1.maulla()); %></div> 
        <div class="naranja"><% out.println(g2.come("sardinas")); %></div> 
 
        <div class="azul"><% out.println(g1.frasesGatos()); %></div>
        <div class="rojo"><% out.println(g2.frasesGatos()); %></div>
        <div class="naranja"><% out.println(g3.frasesGatos()); %></div>
        <div class="azul"><% out.println(g1.frasesGatos()); %></div>
        <div class="rojo"><% out.println(g2.frasesGatos()); %></div>
        <div class="naranja"><% out.println(g3.frasesGatos()); %></div>
    </body>
</html>