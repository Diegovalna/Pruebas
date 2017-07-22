<?php
session_start();
?>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Menú Principal</title>        
    </head>
    <body>
        <?php 
        include_once './menuEstardar.php';
        ?>
        <br>
        <div style="margin-left: 100px;" class="col-md-10">
            <div class="jumbotron" style="background-color: #f0ad4e">
                <h1 style="text-align: center">Hola, Bienvenido al Sistema</h1>
                <p style="text-align: center">...</p>
                <p style="text-align: center"><a class="btn btn-primary btn-lg" href="paginaInicio.php" role="button">Ir a la Página de Inicio</a></p>
            </div>
        </div>
    </body>
</html>
