<?php

session_start();
//$Correo = $_GET["txtCorreo"];
//$Comentario = $_GET["txtComentario"];
$_POST["txtNombre"] = "Ejemplo";
if (isset($_POST["txtNombre"])) {
    $_SESSION["Nombre"] = $_POST["txtNombre"];
}
header("Location: ../vistas/MostrarDatos.php");
