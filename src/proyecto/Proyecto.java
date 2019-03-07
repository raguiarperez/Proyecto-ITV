
package proyecto;

import Citas.Cita;
import Documentación.*;
import Utilidades.pedirDatos;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

 /*
 * @author rafa2
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException {

        int opcion;
        do{
            opcion=pedirDatos.enteiro("ITV"
            + "\n 1: Cita Previa"
            + "\n 2: Documentación"               
            + "\n 3: cita previa");
            switch(opcion){
                case 1:
                    ArrayList <String> Cprev= new ArrayList<>();
                    Cita cit= new Cita();
                    cit.setDni(pedirDatos.string("Introduzca DNI"));
                    cit.crearArray(Cprev);
                    cit.selLocalidad(Cprev);
                    cit.selFecha();
                    cit.engadir("Citas");
                    break;
                case 2:

                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }while(opcion > 3);

//        File aseg=new File("Seguros.txt");
//        File DocCoche=new File("DocumentacionCoche.txt");
//        Documentos doc1= new Documentos();
//        doc1.añadirDocumentoCoche("DocumentacionCoche");
//        System.out.println(doc1.mostrarEncontradoCoche(DocCoche, pedirDatos.string("matricula")));
////        System.out.println(doc1.mostrarEncontradoSeguros(aseg, pedirDatos.string("dni")));
    }    
}
