/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import Documentación.Seguros;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Mirroriced y Rafsniper
 */
public class General {
    static String sql;
    
    public static Connection connect() {

        // parámetro BD
        String url = "jdbc:sqlite:Documentos.db";
        Connection conn = null;
        // Creando conexión a la BD
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
public static void crearTablas(String filename, JTable a, JTable b) {
        String url = "jdbc:sqlite:" + filename + ".db";

        sql = "CREATE TABLE IF NOT EXISTS DocCoche (\n"
                + "	matricula text PRIMARY KEY,\n"
                + "	nBastidor text NOT NULL UNIQUE,\n"
                + "	marca text NOT NULL,\n"
                + "	modelo text NOT NULL,\n"
                + "	Anomatricula text NOT NULL UNIQUE\n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "1");
        }

        sql = "CREATE TABLE IF NOT EXISTS Seguros (\n"
                + "	dni text PRIMARY KEY,\n"
                + "	nPoliza text NOT NULL UNIQUE,\n"
                + "	compania text NOT NULL,\n"
                + "	matricula text NOT NULL UNIQUE,\n"
                + "	FOREIGN KEY (matricula) REFERENCES DocCoche(matricula)\n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
