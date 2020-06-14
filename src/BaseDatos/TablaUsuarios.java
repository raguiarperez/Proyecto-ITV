/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import static BaseDatos.General.connect;
import Documentación.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafag
 */
public class TablaUsuarios {
    
    static String sql;
    static ArrayList<Usuarios> listausers = new ArrayList<>();

    public static String añadirUsuarios(JTextField nombreUsuario, JTextField correo, JPasswordField contraseña) {
        sql = "INSERT INTO Usuarios(nombreUsuario,correo,contraseña) VALUES(?,?,?)";
        String contra=String.valueOf(contraseña.getPassword());
        try (Connection conn = General.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombreUsuario.getText());
            pstmt.setString(2, correo.getText());
            pstmt.setString(3, contra);
            pstmt.executeUpdate();
            return "Linea añadida"
                    + "\n" + nombreUsuario.getText() + " " + correo.getText() + " " + Arrays.toString(contraseña.getPassword());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return "Ha habido un error. Ese usuario ya existe.";
    }



    public static void actualizarTablaUsuarios(JTable a) {
        DefaultTableModel model = (DefaultTableModel) a.getModel();
        Object O[] = null;
        model.setRowCount(0);
        listausers = añadirArrayUser();
        for (int i = 0; i < listausers.size(); i++) {
            model.addRow(O);
            Usuarios getU = listausers.get(i);
            model.setValueAt(getU.getNombreUsuario(), i, 0);
            model.setValueAt(getU.getCorreo(), i, 1);
            model.setValueAt(getU.getContraseña(), i, 2);
        }
    }

    public static ArrayList<Usuarios> añadirArrayUser() {
        String nombreUsuario, correo, contraseña;
        sql = "SELECT nombreUsuario,correo,contraseña FROM Usuarios";
        try (Connection conn = General.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)){
                    listausers.clear();
                    while (rs.next()) {
                    nombreUsuario = rs.getString("nombreUsuario");
                    correo = rs.getString("correo");
                    contraseña = rs.getString("contraseña");
                    listausers.add(new Usuarios(nombreUsuario, correo, contraseña));
                }
            return listausers;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
       //CONSULTA
    public static ArrayList<Usuarios> consultaUsuarios(JTextField a) {
        String nombreUsuario, correo, contraseña;
        ArrayList<Usuarios> conS = new ArrayList<>();
        try (Connection conn = connect();) {

            PreparedStatement pstmt = null;

            sql = "SELECT nombreUsuario,correo,contraseña FROM Usuarios where nombreUsuario = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, a.getText());

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                nombreUsuario = rs.getString("nombreUsuario");
                correo = rs.getString("correo");
                contraseña = rs.getString("contraseña");
                conS.add(new Usuarios(nombreUsuario, correo, contraseña));
            }

            return conS;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conS;
    }
   
    //ACTUALIZAR TABLA PARA CONSULTA
    public static void actuConsultaUsuarios(ArrayList<Usuarios> conS, JTable a) {
        DefaultTableModel model = (DefaultTableModel) a.getModel();
        Object O[] = null;
        model.setRowCount(0);
        
        for (int i = 0; i < conS.size(); i++) {
            model.addRow(O);
            Usuarios getS = conS.get(i);
            model.setValueAt(getS.getNombreUsuario(),  i, 0);
            model.setValueAt(getS.getCorreo(), i, 1);
            model.setValueAt(getS.getContraseña(), i, 2);
        }
    } 
    //MODIFICAR
    public static String modificarUsuarios(JTextField nombreUsuario, JTextField correo, JPasswordField contraseña) {
        try (Connection conn = General.connect();) {
            PreparedStatement pstmt = null;
            if (nombreUsuario.getText().isEmpty() && correo.getText().isEmpty() && contraseña.getPassword().toString().isEmpty()) {
                throw new NullPointerException();
            }

            sql = "UPDATE Usuarios SET correo = ? , "
                    + "contraseña = ? "
                    + "WHERE nombreUsuario = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nombreUsuario.getText());
            pstmt.setString(2, correo.getText());
            pstmt.setString(3, contraseña.getPassword().toString());

            return "Usuario modificado";
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return "No ha habido cambios";
    }

    //BORRAR
    public static void borrarDocCoche(String matri) {
        sql = "DELETE FROM Usuarios WHERE nombreUsuario = ?";
        try (Connection conn = General.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql);){
            pstmt.setString(1, matri);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}


