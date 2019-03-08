package Documentación;

import Utilidades.pedirDatos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author rafa2
 */
public class Documentos {

    PrintWriter f = null;
    Scanner sc;
    File aseg = new File("Seguros.txt");
    File DocCoche = new File("DocumentacionCoche.txt");

    //Seguros
    //Método para comprobar Documentación
    public boolean comprobarDocSeguros(File nomFich, String dni) {
        try {
            sc = new Scanner(nomFich);
            while (sc.hasNextLine()) {
                String[] datos = sc.nextLine().split(" ");
                if (datos[0].equalsIgnoreCase(dni)) {
                    sc.close();
                    return true;

                }

            }
            sc.close();
            return false;
        } catch (FileNotFoundException ex) {
            Seguros seg2 = new Seguros("-", "-", "-", "-");
            añadirDocumentoSeguros("Seguros", seg2);
            return this.comprobarDocSeguros(nomFich, dni);
        }

    }

    //Método para recibir un boolean junto a un String si se ha encontrado o no el documento
    public Boolean mostrarEncontradoSeguros(File nomFich, String dni) {
        Documentos doc = new Documentos();
        if (doc.comprobarDocSeguros(nomFich, dni) == true) {
            JOptionPane.showMessageDialog(null, "Documento validado");
            return true;

        }
        JOptionPane.showMessageDialog(null, "No se encuentra Documento");
        return false;
    }

    //Método para añadir un Seguro
    public void añadirDocumentoSeguros(String nomFich) {
        try {
            f = new PrintWriter(new FileWriter(nomFich + ".txt", true));
            Seguros seg2 = new Seguros(pedirDatos.string("dni"), pedirDatos.string("nPoliza"), pedirDatos.string("nomCompania"), pedirDatos.string("matricula"));
            f.println(seg2);
            f.close();
        } catch (IOException ex) {
            Logger.getLogger(Documentos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Método en caso que el archivo esté vacío
    public void añadirDocumentoSeguros(String nomFich, Seguros seg2) {
        try {
            f = new PrintWriter(new FileWriter(nomFich + ".txt", true));
            f.println(seg2);
            f.close();
        } catch (IOException ex) {
            Logger.getLogger(Documentos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    ///Documentación Coche
    //Método para comprobar Documentación
    public boolean comprobarDocCoche(File nomFich, String matricula) {
        try {
            sc = new Scanner(nomFich);
            while (sc.hasNextLine()) {
                String[] datos = sc.nextLine().split(" ");
                if (datos[0].equalsIgnoreCase(matricula)) {
                    sc.close();
                    return true;

                }

            }
            sc.close();
            return false;
        } catch (FileNotFoundException ex) {
            DocCoche coche2 = new DocCoche("-", "-", "-", "-", "-");
            añadirDocumentoCoche("DocumentacionCoche", coche2);
            return this.comprobarDocCoche(nomFich, matricula);
        }
    }

    //Método para recibir un boolean junto a un String si se ha encontrado o no el documento
    public boolean mostrarEncontradoCoche(File nomFich, String matricula) {
        Documentos doc = new Documentos();
        if (doc.comprobarDocCoche(nomFich, matricula) == true) {
            JOptionPane.showMessageDialog(null, "Documento validado");
            return true;

        }
        JOptionPane.showMessageDialog(null, "No se encuentra Documento");
        return false;

    }
//Método para añadir un DocCoche

    public void añadirDocumentoCoche(String nomFich) {
        try {
            f = new PrintWriter(new FileWriter(nomFich + ".txt", true));
            DocCoche coche2 = new DocCoche(pedirDatos.string("matricula"), pedirDatos.string("numero bastidor"), pedirDatos.string("marca"), pedirDatos.string("modelo"), pedirDatos.string("anomatriculacion"));
            f.println(coche2);
            f.close();
        } catch (IOException ex) {
            Logger.getLogger(Documentos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Método en caso de que el archivo esté vacío
    public void añadirDocumentoCoche(String nomFich, DocCoche coche2) {
        try {
            f = new PrintWriter(new FileWriter(nomFich + ".txt", true));
            coche2 = new DocCoche("-", "-", "-", "-", "-");
            f.println(coche2);
            f.close();
        } catch (IOException ex) {
            Logger.getLogger(Documentos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Métodos que salta la opción de añadir o no un documento
    public void opcionEngadirA(File nomfich, String dni, String nomefich) {
        boolean c;
        int dialogButton;
        int dialogResult;
        c = mostrarEncontradoSeguros(nomfich, dni);
        if (!c) {
            dialogButton = JOptionPane.YES_NO_OPTION;
            dialogResult = JOptionPane.showConfirmDialog(null, "¿Desea añadir la documentación?", null, dialogButton);
            if (dialogResult == 0) {
                añadirDocumentoSeguros(nomefich);
            }
        }
    }

    public void opcionEngadirB(File nomfich, String dni, String nomefich) {
        boolean c;
        int dialogButton;
        int dialogResult;
        c = mostrarEncontradoCoche(nomfich, dni);
        if (!c) {
            dialogButton = JOptionPane.YES_NO_OPTION;
            dialogResult = JOptionPane.showConfirmDialog(null, "¿Desea añadir la documentación?", null, dialogButton);
            if (dialogResult == 0) {
                añadirDocumentoCoche(nomefich);
            }
        }
    }
    //Menú con las opciones

    public void menuDoc() {

        int opcion;
        do {
            opcion = pedirDatos.enteiro("\n 1: Comprobar Seguro"
                    + "\n 2: Comprobar Documentación de Coche"
                    + "\n 3: Añadir Seguro"
                    + "\n 4: Añadir Documentación de Coche");
            switch (opcion) {
                case 1:
                    opcionEngadirA(aseg, pedirDatos.string("Introduzca DNI"), "Seguros");
                    break;
                case 2:
                    opcionEngadirB(DocCoche, pedirDatos.string("Introduzca Matricula"), "DocumentacionCoche");
                    break;
                case 3:
                    añadirDocumentoSeguros("Seguros");
                    break;
                case 4:
                    añadirDocumentoCoche("DocumentacionCoche");
                    break;
                default:
                    break;
            }
        } while (opcion > 4);
    }

}
