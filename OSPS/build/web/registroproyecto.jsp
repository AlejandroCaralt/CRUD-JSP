<%-- 
    Document   : registroproyecto
    Created on : 22-mar-2018, 0:39:24
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registra un Proyecto</title>
    </head>
    <body>
        <h1>Formulario de Registro</h1>
        <form action="nuevoproyecto" method="POST">
            <label>Nombre del Proyecto</label>
            <input type="text" name="nombreProyecto"><br>
            <label>Lenguajes</label>
            <input type="text" name="lenguajeProyecto"><br>
            <label>Repositorio en Github(Opcional)</label>
            <input type="text" name="github"><br>
            <label>Descripción del proyecto.(Opcional)</label>
            <input type="text" name="descripcionProyecto"><br>
            <input type="submit" value="Registrar">
        </form>
    </body>
</html>
