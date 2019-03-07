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
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Documentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        sc.close();
        return false;
    }

    public Boolean mostrarEncontradoSeguros(File nomFich, String dni) {
        Documentos doc = new Documentos();
        if (doc.comprobarDocSeguros(nomFich, dni) == true) {
            JOptionPane.showMessageDialog(null, "Documento validado");
            return true;

        }
        JOptionPane.showMessageDialog(null, "No se encuentra Documento");
        return false;
    }

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

    ///cocheee
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
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Documentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        sc.close();
        return false;
    }

    public boolean mostrarEncontradoCoche(File nomFich, String matricula) {
        Documentos doc = new Documentos();
        if (doc.comprobarDocCoche(nomFich, matricula) == true) {
            JOptionPane.showMessageDialog(null, "Documento validado");
            return true;

        }
        JOptionPane.showMessageDialog(null, "No se encuentra Documento");
        return false;

    }

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

    //Menú con las opciones
    public void MeduDoc() {
        File aseg = new File("Seguros.txt");
        File DocCoche = new File("DocumentacionCoche.txt");
        boolean c;
        int dialogButton;
        int dialogResult;
        DocCoche coche = new DocCoche();
        Seguros seg = new Seguros();
        int opcion;
        do {
            opcion = pedirDatos.enteiro("\n 1: Comprobar Seguro"
                    + "\n 2: Comprobar Documentación de Coche"
                    + "\n 3: Añadir Seguro"
                    + "\n 4: Añadir Documentación de Coche");
            switch (opcion) {
                case 1:
                    c = this.mostrarEncontradoSeguros(aseg, pedirDatos.string("Introduzca DNI"));
                    if (c) {
                        break;
                    } else {
                        dialogButton = JOptionPane.YES_NO_OPTION;
                    }
                    dialogResult = JOptionPane.showConfirmDialog(null, "¿Desea añadir la documentación?", null, dialogButton);
                    if (dialogResult == 0) {
                        this.añadirDocumentoSeguros("Seguros");
                        break;
                    } else {
                        break;
                    }
                case 2:
                     c = this.mostrarEncontradoSeguros(DocCoche, pedirDatos.string("Introduzca DNI"));
                    if (c) {
                        break;
                    } else {
                        dialogButton = JOptionPane.YES_NO_OPTION;
                    }
                    dialogResult = JOptionPane.showConfirmDialog(null, "¿Desea añadir la documentación?", null, dialogButton);
                    if (dialogResult == 0) {
                        this.añadirDocumentoSeguros("DocumentacionCoche");
                        break;
                    } else {
                        break;
                    }
                case 3:
                    this.añadirDocumentoSeguros("Seguros");
                    break;
                case 4:
                    this.añadirDocumentoSeguros("DocumentacionCoche");
                    break;
                default:
                    break;
            }
        } while (opcion > 4);
    }

}
