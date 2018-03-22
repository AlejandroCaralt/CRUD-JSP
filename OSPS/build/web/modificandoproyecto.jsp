<%-- 
    Document   : menu
    Created on : 21-mar-2018, 19:55:24
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ControladorLogin.ProjectController"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
    HttpSession objsession = request.getSession(false);
    String usuario = (String)objsession.getAttribute("usuario");
    if(usuario.equals("")){
        response.sendRedirect("index.jsp");
    } else {
        objsession.setAttribute("usuario", usuario);
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menú</title>
    </head>
    <body>
        <div class="header"><% out.print(usuario); %><a href="index.jsp" >Cerrar Sesión </a></div>
        <h1>Hola usuario, acceso correcto</h1>
        <table border=1>
        <thead>
            <tr>
                <th>Codigo</th>
                <th>Nombre</th>
                <th>Lenguajes</th>
                <th>GitHub</th>
                <th>Administrador</th>
                <th>FechaInicio</th>
                <th>Descripción</th>
                <th colspan=2>Action</th>
            </tr>
        </thead>
        <tbody>
            <%
                ProjectController cp = new ProjectController();
                
            %>
            <%= cp.getUpdateProject()%>
        </tbody>
    </table>
    <p><a href="menu.jsp">Volver</a></p>
    </body>
</html>
