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
        <div class="header"><% out.print(usuario); %><a href="index.jsp" onclick="<%objsession.removeAttribute("usuario");%>">Cerrar Sesión </a></div>
        <h1>Hola <% out.print(usuario); %>, acceso correcto</h1>
        <h1>Tabla de Proyectos</h1>
        <table border=1>
        <thead>
            <tr>
                <th>Nombre</th>
                <th>Lenguajes</th>
                <th>GitHub</th>
                <th>Administrador</th>
                <th>FechaInicio</th>
                <th>Descripción</th>
            </tr>
        </thead>
        <tbody>
            <%
                ProjectController cp = new ProjectController();
                
            %>
            <%= cp.getViewProjects()%>
        </tbody>
    </table>
    <p><a href="registroproyecto.jsp">Añadir nuevo proyecto.</a></p>
    <p><a href="modificandoproyecto.jsp">Modificar proyectos.</a></p>
    
    <h1>Tabla de Usuarios Registrados</h1>
        <table border=1>
        <thead>
            <tr>
                <th>NickName</th>
                <th>Email</th>
            </tr>
        </thead>
        <tbody>
            <%= cp.getViewUsuarios()%>
        </tbody>
    </table>
    </body>
</html>
