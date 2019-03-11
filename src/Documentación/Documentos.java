package Documentación;

import Utilidades.ComprobarString;
import Utilidades.pedirDatos;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 * @author Mirroriced y Rafsniper
 */
public class Documentos implements Serializable {

    HashMap<String, Seguros> listaseg = new HashMap<>();
    HashMap<String, DocCoche> listaco = new HashMap<>();
    transient ObjectOutputStream fich;
    transient FileOutputStream f;
    transient ObjectInputStream fich1 = null;
    transient FileInputStream f1 = null;

    //Seguros
    //Método para comprobar Documentación
    public boolean comprobarDocSeguros(String nomFich, String dni) throws IOException, ClassNotFoundException {
        try {
            f1 = new FileInputStream(nomFich + ".dat");
            fich1 = new ObjectInputStream(f1);
            fileToHashSeg("Seguros");
            if (listaseg.containsKey(dni)) {
                f1.close();
                fich1.close();
                return true;

            }
            f1.close();
            fich1.close();
            return false;
        } catch (FileNotFoundException ex) {
            f = new FileOutputStream("Seguros.dat");
            f.close();
            return false;
        } catch (EOFException ex2) {
            return false;
        }

    }

    //Método para recibir un boolean junto a un String si se ha encontrado o no el documento
    public Boolean mostrarEncontradoSeguros(String nomFich, String dni) throws IOException, ClassNotFoundException {
        Documentos doc = new Documentos();
        if (doc.comprobarDocSeguros(nomFich, dni) == true) {
            JOptionPane.showMessageDialog(null, "Documento validado");
            return true;

        }
        JOptionPane.showMessageDialog(null, "No se encuentra Documento");
        return false;
    }

    //Método para añadir un Seguro
    public void añadirDocumentoSeguros(String nomeFich, String dni) throws IOException {
        Seguros seg2 = new Seguros(pedirDatos.string("nPoliza"), pedirDatos.string("nomCompania"), pedirDatos.string("matricula"));
        fich = new ObjectOutputStream(new FileOutputStream(nomeFich + ".dat"));
        listaseg.put(dni, seg2);
        fich.writeObject(listaseg);
        fich.close();
    }

    ///Documentación Coche
    //Método para comprobar Documentación
    public boolean comprobarDocCoche(String nomFich, String matricula) throws IOException, ClassNotFoundException {
        try {
            f1 = new FileInputStream(nomFich + ".dat");
            fich1 = new ObjectInputStream(f1);
            fileToHashCo("DocumentacionCoche");
            if (listaco.containsKey(matricula)) {
                f1.close();
                fich1.close();
                return true;

            }
            f1.close();
            fich1.close();
            return false;
        } catch (FileNotFoundException ex) {
            f = new FileOutputStream("DocumentacionCoche.dat");
            f.close();
            return false;
        } catch (EOFException ex2) {
            return false;
        }

    }

    //Método para recibir un boolean junto a un String si se ha encontrado o no el documento
    public boolean mostrarEncontradoCoche(String nomeFich, String matricula) throws IOException, ClassNotFoundException {
        Documentos doc = new Documentos();
        if (doc.comprobarDocCoche(nomeFich, matricula) == true) {
            JOptionPane.showMessageDialog(null, "Documento validado");
            return true;

        }
        JOptionPane.showMessageDialog(null, "No se encuentra Documento");
        return false;

    }
//Método para añadir un DocCoche

    public void añadirDocumentoCoche(String nomeFich, String matricula) throws IOException {
        DocCoche coche2 = new DocCoche(pedirDatos.string("numero bastidor"), pedirDatos.string("marca"), pedirDatos.string("modelo"), pedirDatos.string("anomatriculacion"));
        fich = new ObjectOutputStream(new FileOutputStream(nomeFich + ".dat"));
        listaco.put(matricula, coche2);
        fich.writeObject(listaco);
        fich.close();
    }

    //Métodos que salta la opción de añadir o no un documento
    public void opcionEngadirA(String dni, String nomefich) throws IOException, ClassNotFoundException {
        boolean c;
        int dialogButton;
        int dialogResult;
        c = mostrarEncontradoSeguros(nomefich, dni);
        if (!c) {
            dialogButton = JOptionPane.YES_NO_OPTION;
            dialogResult = JOptionPane.showConfirmDialog(null, "¿Desea añadir la documentación?", null, dialogButton);
            if (dialogResult == 0) {
                añadirDocumentoSeguros(nomefich, dni);
            }
        }
    }

    public void opcionEngadirB(String matricula, String nomeFich) throws IOException, ClassNotFoundException {
        boolean c;
        int dialogButton;
        int dialogResult;
        c = mostrarEncontradoCoche(nomeFich, matricula);
        if (!c) {
            dialogButton = JOptionPane.YES_NO_OPTION;
            dialogResult = JOptionPane.showConfirmDialog(null, "¿Desea añadir la documentación?", null, dialogButton);
            if (dialogResult == 0) {
                añadirDocumentoCoche(nomeFich, matricula);
            }
        }
    }
    //Menú con las opciones

    public void menuDoc() throws IOException, ClassNotFoundException {

        int opcion;
        String dni = pedirDatos.string("Introduzca DNI");
        ComprobarString.longitudLetraFinal(9, dni);
        String matricula = pedirDatos.string("Introduzca matrícula");
        ComprobarString.longitud(6, matricula);
        do {
            opcion = pedirDatos.enteiro("\n 1: Comprobar Seguro"
                    + "\n 2: Comprobar Documentación de Coche"
                    + "\n 3: Añadir Seguro"
                    + "\n 4: Añadir Documentación de Coche");
            switch (opcion) {
                case 1:
                    opcionEngadirA(dni, "Seguros");
                    break;
                case 2:
                    opcionEngadirB(matricula, "DocumentacionCoche");
                    break;
                case 3:
                    añadirDocumentoSeguros("Seguros", dni);
                    break;
                case 4:
                    añadirDocumentoCoche("DocumentacionCoche", matricula);
                    break;
                default:
                    break;
            }
        } while (opcion > 4);
    }

    //Método para pasar binario a HashMap
    public void fileToHashSeg(String nomFich) throws FileNotFoundException, IOException, ClassNotFoundException {
        f1 = new FileInputStream(nomFich + ".dat");
        fich1 = new ObjectInputStream(f1);
        listaseg = (HashMap) fich1.readObject();
        f1.close();
        fich1.close();
    }

    public void fileToHashCo(String nomFich) throws FileNotFoundException, IOException, ClassNotFoundException {
        f1 = new FileInputStream(nomFich + ".dat");
        fich1 = new ObjectInputStream(f1);
        listaco = (HashMap) fich1.readObject();
        f1.close();
        fich1.close();
    }

}
