var consultar = function () {
    $.ajax({
        url: "Svl_Consultas",
        async: false,
        data: {'accion': "consultar-data"},
        success: function (data, textStatus, jqXHR) {
            $("#Tabla_prueba").DataTable({
                'bSort': false,
                'aaData': data.resultados[1],
                'aoColumns': [
                    {'mData': 'RUT'},
                    {'mData': 'NOMBRE'},
                    {'mData': 'APELLIDO'},
                    {'mData': 'FECHA'}
                ]
            });
        }
    });
};
