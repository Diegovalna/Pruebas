/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.CL_Conexion;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.json.JSONArray;

/**
 *
 * @author Diego
 */
public class DAODatatable {

    public static void main(String[] args) {
        DAODatatable dao = new DAODatatable();
        dao.MostrarData();
    }

    public JSONArray MostrarData() {
        Connection con = null;
        Statement st = null;
        String sql = "";
        ResultSet rs = null;

        JSONArray respuesta = new JSONArray();
        try {
            sql = "SELECT\n"
                    + "`persona`.`idPersona`,\n"
                    + "`persona`.`RUT`,\n"
                    + "`persona`.`NOMBRE`,\n"
                    + "`persona`.`APELLIDO`,\n"
                    + "`persona`.`FECHA_NACIMIENTO`\n"
                    + "FROM `datatable`.`persona`;";
            con = (Connection) CL_Conexion.cone();
            
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            CL_Conexion.desconectar(con);
        }
        return respuesta;
    }

}
