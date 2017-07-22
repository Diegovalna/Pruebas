<?php 
session_start(); 
?>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php require_once './menuEstardar.php'; ?>
        <form method="POST" action="../controlador/validar.php">
            <div style="margin-left: 100px;" class="col-sm-6 form-group-sm">

                <table class="table table-bordered">
                    <tr>
                        <td colspan="2">
                            <label>Nombre: </label><input style="margin-left: 10px;" type="text" id="txtNombre" >
                        </td>

                    </tr>
                    <tr>
                        <td colspan="2"><label>Correo: </label><input style="margin-left: 15px;" type="text" name="txtCorreo" value="" /></td>
                    </tr>
                    <tr>     
                        <td colspan="2"><label>Comentario: </label>
                            <textarea name="txtComentario"></textarea>
                        </td>
                    </tr>
                </table>

                <button class="btn btn-primary"> Enviar </button>
            </div>         
        </form>

    </body>
</html>