<%-- 
    Document   : InicioSesion
    Created on : 19/05/2023, 09:23:01 AM
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
        <title>Inicio-Sesion</title>    
    </head>
    <body>
        
        <div class="Cuadro-morado"></div>

        <div class="Cuadro-blanco">
            <img src="../IMG/logo.png" alt="Logotipo" title="Logotipo" class="Logo">
            <h1 class="titulo">Iniciar Sesión</h1>
            <p class ="texto-plano">Gestione sus finanzas desde ahora</p>
            <form action="vp.jsp" method="post" class="Form-Registro1">
                <label for="Correo" class="etiqueta">Correo:</label>
                <input type="text" class="inp-text" name="Correo" id="Correo" placeholder="Correo" required>
                <label for="Password" class="etiqueta">Password:</label>
                <input type="password" class="inp-text" name="Password" id="Password" placeholder="Password" required><br><br>
                <center>
                    <input type="submit" class="btn-Registrar" value="Iniciar"><br>
                    <a href="Crear-Cuenta.jsp" class="a-regresar">¿No tienes una cuenta?</a>
                </center>
            </form>
            <span class="line1"></span>
            <span class="texto">SGAFP</span>
            <span class="line2"></span>
        </div>
    </body>
</html>
