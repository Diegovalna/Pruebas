<?php
session_start();
?>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php include_once './menuEstardar.php'; ?>
        <div style="margin-left: 100px;" class="col-sm-6 form-group-sm">

            <table class="table table-bordered">
                <tr>
                    <td><?php echo $_SESSION["Nombre"]; ?></td>
                </tr>
<!--                <tr>
                    <td><?php echo "<label>Correo :  </label> '$Correo'" ?></td>
                </tr>
                <tr>     
                    <td><?php echo "<label>Comentario: </label> '$Comentario'" ?></td>                     
                </tr>-->
            </table>
        </div> 
    </body>
</html>
