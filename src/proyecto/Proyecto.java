package proyecto;

import Citas.Cita;
import Documentación.Documentos;
import Taller.Ingreso;
import Utilidades.pedirDatos;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/*
 * @author rafa2
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException, ParseException, FileNotFoundException, ClassNotFoundException {
        ArrayList<String> Cprev = new ArrayList<>();
        int opcion;
        boolean m;
        boolean f;
        String dni;
        do {
            opcion = pedirDatos.enteiro("ITV"
                    + "\n 1: Cita Previa"
                    + "\n 2: Documentación"
                    + "\n 3: Taller");
            switch (opcion) {
                case 1:                  
                    Cita cit = new Cita();
                    dni= pedirDatos.string("Introduzca DNI");
                    m = cit.comprobarCita("Citas", dni);
                    if (m) {
                        JOptionPane.showMessageDialog(null, "Ya tiene cita");
                        break;
                    }
                    cit.crearArray(Cprev);
                    cit.selLocalidad(Cprev);
                    cit.selFecha();
                    f = cit.comprobarFechaHora();
                    if (f) {
                        cit.engadir("Citas",cit, dni);
                        JOptionPane.showMessageDialog(null, "Aquí tiene su cita: \n" + cit.getLocalidad() + " " + cit.getFecha() + " " + cit.getTime());
                        System.exit(0);
                    } else {
                        JOptionPane.showMessageDialog(null, "Introduzca una hora de 07 a 21 del día siguiente y que no sobrepase el año 2020");
                    }
                    break;
                case 2:
                    Documentos doc = new Documentos();
                    doc.menuDoc();
                    break;
                case 3:
                    dni= pedirDatos.string("Introduzca DNI");
                    Ingreso tall = new Ingreso();
                    tall.comprobarIngreso(dni);
                    break;
                default:
                    break;
            }
        } while (opcion > 3);
    
    }
}


