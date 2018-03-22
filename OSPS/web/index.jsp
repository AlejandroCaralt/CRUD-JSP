<%-- 
    Document   : index
    Created on : 21-mar-2018, 19:20:26
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesión</title>
    </head>
    <body>
        <h1>Iniciar Sesión</h1>
        <form action="iniciar" method="POST">
            <label>Nombre</label>
            <input type="text" name="userName"/><br>
            <label>Contraseña</label>
            <input type="password" name="userPassword"/><br>
            <input type="submit" value="Iniciar Sesión" />
        </form>
        <br>
        <div>¿Nó tienes cuenta aún?<a href="registro.jsp">Registrarme</a></div>
    </body>
</html>
