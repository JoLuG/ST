<%-- 
    Document   : Crear-Cuenta
    Created on : 19/05/2023, 09:14:19 AM
    Author     : wendy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="../CSS/EstiloP.css">
        <title>Crear-Cuenta</title>
    </head>
    <body>
        <div class="Cuadro-morado"></div>
        <div class="Cuadro-blanco-1">
            <img src="../IMG/logo.png" alt="Logotipo" title="Logotipo" class="Logo">
            <h1 class="titulo">Crear Cuenta</h1>
            <form action="Crear-Cuenta2.jsp" method="post" class="Form-Registro">

                <label for="Usuario" class="etiqueta">Usuario:</label> <br>
                <input type="text" id="Usuario" name="Usuario" class="inp-text" placeholder="Usuario" required> <br>

                <label for="Nombre" class="etiqueta">Nombre:</label> <br>
                <input type="text" id="Nombre" name="Nombre" class="inp-text" placeholder="Nombre" required> <br>

                <label for="apaterno" class="etiqueta">Apellido Paterno:</label> <br>
                <input type="text" id="apaterno" name="apaterno" class="inp-text" placeholder="Apellido Paterno" required> <br>

                <label for="amaterno" class="etiqueta">Apellido Materno:</label> <br>
                <input type="text" id="amaterno" name="amaterno" class="inp-text" placeholder="Apellido Materno" required> <br>     

                <label for="genero" class="etiqueta">Genero:</label> <br>
                <select name="genero" id="genero" class="inp-text">               
                    <option value="Hombre">Hombre</option>
                    <option value="Mujer">Mujer</option>
                </select> <br> <br>
                <center>
                    <input type="submit" value="Siguiente" class="btn-Registrar"><br>
                    <a href="InicioSesion.jsp" class="a-regresar">¿Ya tienes una cuenta?</a>
                </center>

            </form>
        </div>
    </body>
</html>
