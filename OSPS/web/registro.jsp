<%-- 
    Document   : registro
    Created on : 21-mar-2018, 19:36:42
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrarme</title>
    </head>
    <body>
        <h1>Formulario de registro</h1>
        
        <form action="nuevousuario" method="POST">
            <label>NickName</label>
            <input type="text" name="userName"><br>
            <label>Contraseña</label>
            <input type="password" name="userPassword"><br>
            <label>Email(Opcional)</label>
            <input type="text" name="email"><br>
            <input type="submit" value="Registrar">
        </form>
    </body>
</html>
