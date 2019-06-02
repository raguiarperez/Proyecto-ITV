/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import Documentación.DocCoche;
import Documentación.Seguros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mirroriced
 */
public class TablaDocCoche {
    static String sql;
    static ArrayList<DocCoche> listaco = new ArrayList<>();
    
    public static String añadirDocCoche(JTextField matricula,JTextField nbastidor, JTextField marca, JTextField modelo, JTextField anomatri){
        sql = "INSERT INTO Doccoche(matricula,nbastidor,marca,modelo,anomatricula) VALUES(?,?,?,?,?)";
       try (Connection conn = General.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, matricula.getText());
            pstmt.setString(2, nbastidor.getText());
            pstmt.setString(3, marca.getText());
            pstmt.setString(4, modelo.getText());
            pstmt.setString(5, anomatri.getText());
            pstmt.executeUpdate();
            return "Linea añadida"
                    + "\n" + matricula.getText() + " " + nbastidor.getText() + " " + marca.getText()+ " " + modelo.getText()+" "+anomatri.getText();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return "Ha habido un error. Algun campo ya existía en la tabla.";
    }

public static ArrayList<DocCoche> añadirArrayDocCoche() {
        TablaSeguros.listaseg = TablaSeguros.añadirArraySeguros();
        String matricula,nbastidor,marca,modelo,anomatricula;
        sql = "SELECT matricula,nbastidor,marca,modelo,anomatricula FROM DocCoche WHERE matricula in(SELECT matricula FROM Seguros WHERE dni = ?)";
        try (Connection conn = General.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            listaco.clear();
            for (int i = 0; i < TablaSeguros.listaseg.size(); i++) {
                pstmt.setString(1, TablaSeguros.listaseg.get(i).getDni());
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                matricula = rs.getString("matricula");
                nbastidor = rs.getString("nbastidor");
                marca = rs.getString("marca");
                modelo = rs.getString("modelo");
                anomatricula = rs.getString("anomatricula");
                    listaco.add(new DocCoche(matricula,nbastidor,marca,modelo,anomatricula));

                }
            }
            return listaco;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listaco;
    }

public static void actualizarTablaDocCoche(JTable a) {
        DefaultTableModel model = (DefaultTableModel) a.getModel();
        Object O[] = null;
        model.setRowCount(0);
        listaco= añadirArrayDocCoche();
        for (int i = 0; i < listaco.size(); i++) {
            model.addRow(O);
            DocCoche getD = listaco.get(i);
            model.setValueAt(getD.getMatricula(), i, 0);
            model.setValueAt(getD.getNumBastidor(), i, 1);
            model.setValueAt(getD.getMarca(), i, 2);
            model.setValueAt(getD.getModelo(), i, 3);
            model.setValueAt(getD.getAnoMatriculacion(), i, 4);
        }
    }
public static ArrayList<DocCoche> añadirArrayDocConsulta(ArrayList<Seguros> conS) {
        String matricula,nbastidor,marca,modelo,anomatricula;
        sql = "SELECT matricula,nbastidor,marca,modelo,anomatricula FROM DocCoche WHERE matricula in(SELECT matricula from seguros WHERE dni = ?)";
        try (Connection conn = General.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {

            listaco.clear();
            for (int i = 0; i < conS.size(); i++) {
                pstmt.setString(1, conS.get(i).getDni());
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                matricula = rs.getString("matricula");
                nbastidor = rs.getString("nbastidor");
                marca = rs.getString("marca");
                modelo = rs.getString("modelo");
                anomatricula = rs.getString("anomatricula");
                 listaco.add(new DocCoche(matricula,nbastidor,marca,modelo,anomatricula));

                }
            }
            return listaco;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listaco;
    }
    
    //ACTU CONSULTA DE SEGUROS PARA MOSTRAR TABLA DOCCOCHE
public static void actuConsultaSegDocCoche(ArrayList<Seguros> conS, JTable a) {
        //EXPOSICIONES
        DefaultTableModel model2 = (DefaultTableModel) a.getModel();
        Object O[] = null;
        model2.setRowCount(0);
        listaco = añadirArrayDocConsulta(conS);
        for (int j = 0; j < listaco.size(); j++) {
            model2.addRow(O);
            DocCoche getD = listaco.get(j);
            model2.setValueAt(getD.getMatricula(), j, 0);
            model2.setValueAt(getD.getNumBastidor(), j, 1);
            model2.setValueAt(getD.getMarca(), j, 2);
            model2.setValueAt(getD.getModelo(), j, 3);
            model2.setValueAt(getD.getAnoMatriculacion(), j, 4);
        }
    }

        //MODIFICAR

public static String modificarDocCoche(JTextField matricula,JTextField nbastidor, JTextField marca, JTextField modelo, JTextField anomatri){
        try (Connection conn = General.connect();) {
            PreparedStatement pstmt = null;
            if (nbastidor.getText().isEmpty() && marca.getText().isEmpty() && modelo.getText().isEmpty() && anomatri.getText().isEmpty()) {
                throw new NullPointerException();
            }

                sql = "UPDATE doccoche SET nbastidor = ? , "
                        + "marca = ?, "
                        + "modelo = ? "
                        + "anomatriculacion = ? "
                        + "WHERE matricula = ?";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, nbastidor.getText());
                pstmt.setString(2, marca.getText());
                pstmt.setString(3, modelo.getText());
                pstmt.setString(4, anomatri.getText());
                pstmt.setString(5, matricula.getText());

            return "Documentación del coche modificada";
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return "No ha habido cambios";
    }

        //BORRAR

public static void borrarDocCoche(String matri){
            sql = "DELETE FROM DocCoche WHERE matricula = ?";
            try (Connection conn = General.connect();
                    PreparedStatement pstmt = conn.prepareStatement(sql);) {;
                pstmt.setString(1, matri);
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
    }
}
