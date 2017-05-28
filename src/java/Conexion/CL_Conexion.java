/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author Diego
 */
public class CL_Conexion {

    static private Connection cn = null;

    public static void main(String[] args) {
        System.out.println("" + cone());
    }

    public static Connection cone() {

        try {
            String driver = "com.mysql.jdbc.Driver";
            String usuario = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost/DATATABLE";

            Class.forName(driver);
            cn = DriverManager.getConnection(url, usuario, password);

        } catch (SQLException e) {
            System.err.println("Error" + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error" + e.getMessage());
            e.printStackTrace();
        }

        return cn;
    }

    /**
     * El metodo desconectar desconecta la instancia de la base de datos
     *
     * @param conexion El parametro conexion es la instancia a desconectar
     * @return El metodo devuelve true si se pudo desconectar, false si lo
     * contrario
     */
    public static boolean desconectar(Connection con) {
        boolean flag = false;
        try {
            if (con != null) {
                if (con.isReadOnly()) {
                    con.rollback();
                } else if (!con.getAutoCommit()) {
                    con.commit();
                }
                con.close();
                con = null;
            }
            flag = true;
        } catch (java.sql.SQLException e) {
            flag = false;
        } catch (Exception e) {
            System.err.println("Error" + e.getMessage());
            flag = false;
        }
        return flag;
    }

}
