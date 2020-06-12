
package BaseDatos;

import static BaseDatos.General.connect;
import static BaseDatos.TablaUsuarios.sql;
import Documentación.Seguros;
import Utilidades.ComprobarString;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mirroriced y Rafsniper
 */
public class TablaSeguros {

    static String sql;
    static ArrayList<Seguros> listaseg = new ArrayList<>();

    //AÑADIR LINEA
    public static String añadirSeguro(JTextField dni, JTextField poliza, JTextField compania, JTextField matricula) {
        sql = "INSERT INTO Seguros(dni,nPoliza,compania,matricula) VALUES(?,?,?,?)";
        try (Connection conn = General.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, dni.getText());
            pstmt.setString(2, poliza.getText());
            pstmt.setString(3, compania.getText());
            pstmt.setString(4, matricula.getText());
            pstmt.executeUpdate();
            return "Seguro añadido"
                    + "\n" + dni.getText() + " " + poliza.getText() + " " + compania.getText() + " " + matricula.getText();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return "Ha habido un error";
    }

    //ACTUALIZAR TABLA
    public static void actualizarTablaSeguros(JTable a) {
        DefaultTableModel model = (DefaultTableModel) a.getModel();
        Object O[] = null;
        model.setRowCount(0);
        listaseg = añadirArraySeguros();
        for (int i = 0; i < listaseg.size(); i++) {
            model.addRow(O);
            Seguros getS = listaseg.get(i);
            model.setValueAt(getS.getDni(), i, 0);
            model.setValueAt(getS.getnPoliza(), i, 1);
            model.setValueAt(getS.getNomCompania(), i, 2);
            model.setValueAt(getS.getMatricula(), i, 3);
        }
    }

    public static ArrayList<Seguros> añadirArraySeguros() {
        String dni, npoliza, compania, matricula;
        sql = "SELECT dni,npoliza,compania,matricula FROM seguros";
        try (Connection conn = General.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            listaseg.clear();
            while (rs.next()) {
                dni = rs.getString("dni");
                npoliza = rs.getString("npoliza");
                compania = rs.getString("compania");
                matricula = rs.getString("matricula");
                listaseg.add(new Seguros(dni, npoliza, compania, matricula));
            }
            return listaseg;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    //CONSULTA
    public static ArrayList<Seguros> consultaSeguros(JTextField a) {
        String dni, npoliza, compania, matricula;
        ArrayList<Seguros> conS = new ArrayList<>();
        try (Connection conn = connect();) {

            PreparedStatement pstmt = null;

            sql = "SELECT dni,npoliza,compania,matricula FROM seguros WHERE dni = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, a.getText());

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                dni = rs.getString("dni");
                npoliza = rs.getString("npoliza");
                compania = rs.getString("compania");
                matricula = rs.getString("matricula");
                conS.add(new Seguros(dni, npoliza, compania, matricula));
            }

            return conS;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conS;
    }

    //ACTUALIZAR TABLA PARA CONSULTA
    public static void actuConsultaSeguros(ArrayList<Seguros> conS, JTable a) {
        //PLANTAS
        DefaultTableModel model = (DefaultTableModel) a.getModel();
        Object O[] = null;
        model.setRowCount(0);
        for (int i = 0; i < conS.size(); i++) {
            model.addRow(O);
            Seguros getS = conS.get(i);
            model.setValueAt(getS.getDni(), i, 0);
            model.setValueAt(getS.getnPoliza(), i, 1);
            model.setValueAt(getS.getNomCompania(), i, 2);
            model.setValueAt(getS.getMatricula(), i, 3);
        }
    }

    //MODIFICAR
    public static String modificarSeguro(JTextField dni, JTextField poliza, JTextField compania, JTextField matricula) {
        try (Connection conn = General.connect();) {
            PreparedStatement pstmt = null;
            if (poliza.getText().isEmpty() && compania.getText().isEmpty() && matricula.getText().isEmpty()) {
                throw new NullPointerException();
            }

            sql = "UPDATE seguros SET npoliza = ? , "
                    + "compania = ?, "
                    + "matricula = ? "
                    + "WHERE dni = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, poliza.getText());
            pstmt.setString(2, compania.getText());
            ComprobarString.longitud(7, matricula.getText());
            pstmt.setString(3, matricula.getText());
            pstmt.setString(4, dni.getText());
            pstmt.executeUpdate();

            return "Seguro modificado";
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return "No ha habido cambios";
    }

}
