package proyecto;

import Citas.Cita;
import Documentación.Documentos;
import Utilidades.pedirDatos;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * @author rafa2
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException, ParseException {
        int opcion;
        boolean m;
        boolean f;
        do {
            opcion = pedirDatos.enteiro("ITV"
                    + "\n 1: Cita Previa"
                    + "\n 2: Documentación"
                    + "\n 3: cita previa");
            switch (opcion) {
                case 1:
                    ArrayList<String> Cprev = new ArrayList<>();
                    Cita cit = new Cita();
                    cit.setDni(pedirDatos.string("Introduzca DNI"));
                    //ARREGLAR/////////////
                    m = cit.comprobarCita("Citas");
                    if (m) {
                        JOptionPane.showMessageDialog(null, "Ya tiene cita");
                        break;
                    }
                    ////////////////
                    cit.crearArray(Cprev);
                    cit.selLocalidad(Cprev);
                    cit.selFecha();
                    f = cit.comprobarFechaHora();
                    if (f) {
                        cit.engadir("Citas");
                        JOptionPane.showMessageDialog(null, "Aquí tiene su cita: \n" + cit.getLocalidad() + " " + cit.getFecha() + " " + cit.getTime());
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Introduzca una hora de 07 a 21 y que no sobrepase el año 2020");
                    }
                    break;
                case 2:
                    Documentos doc = new Documentos();
                    doc.menuDoc();
                    break;
                case 3:

                    break;
                default:
                    break;
            }
        } while (opcion > 3);
    }
}
