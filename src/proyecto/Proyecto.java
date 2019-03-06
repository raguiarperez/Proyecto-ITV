
package proyecto;

import Citas.Cita;
import Documentación.*;
import Utilidades.pedirDatos;
import java.io.File;
import java.util.ArrayList;

 /*
 * @author rafa2
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int opcion;
        do{
            opcion=pedirDatos.enteiro("Numero de operacion"
            + "\n 1: cita previa"
            + "\n 2: documentacion"               
            + "\n 3: cita previa");
            switch(opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }while(opcion > 3);
    }
    */
//        File aseg=new File("Seguros.txt");
//        File DocCoche=new File("DocumentacionCoche.txt");
//        Documentos doc1= new Documentos();
//        doc1.añadirDocumentoCoche("DocumentacionCoche");
//        System.out.println(doc1.mostrarEncontradoCoche(DocCoche, pedirDatos.string("matricula")));
////        System.out.println(doc1.mostrarEncontradoSeguros(aseg, pedirDatos.string("dni")));
        Cita cita1= new Cita();
        ArrayList <String> Cprev= new ArrayList<>();
        cita1.crearArray(Cprev);
        cita1=cita1.selLocalidad(Cprev);
    }    
}
