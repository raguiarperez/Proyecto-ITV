
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

/**
 * @author rafa2
 */
public class Documentos{
    PrintWriter f= null;
    Scanner sc;

    
    public boolean comprobarDocSeguros(File nomFich,String dni) {
        try {
            sc= new Scanner(nomFich);
            while(sc.hasNextLine()){
                String[]datos=sc.nextLine().split(" ");
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
    public String mostrarEncontradoSeguros(File nomFich,String dni){
        Documentos doc= new Documentos();
        if ( doc.comprobarDocSeguros(nomFich, dni)== true) {
            return "Documento validado";
            
        }return "No se encuentra Documento";
    }

    public void añadirDocumentoSeguros(String nomFich) {
        try {
            f=new PrintWriter(new FileWriter(nomFich+".txt",true));
            Seguros seg2= new Seguros(pedirDatos.string("dni"),pedirDatos.string("nPoliza"),pedirDatos.string("nomCompania"),pedirDatos.string("matricula"));
            f.println(seg2);
            f.close();
        } catch (IOException ex) {
            Logger.getLogger(Documentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
    
    
    
    
    ///cocheee
    
    
    public boolean comprobarDocCoche(File nomFich,String matricula) {
        try {
            sc= new Scanner(nomFich);
            while(sc.hasNextLine()){
                String[]datos=sc.nextLine().split(" ");
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
       
    
    
    public String mostrarEncontradoCoche(File nomFich,String matricula){
        Documentos doc= new Documentos();
        if ( doc.comprobarDocCoche(nomFich, matricula)== true) {
            return "Documento validado";
            
        }return "No se encuentra Documento";
    }

    public void añadirDocumentoCoche(String nomFich) {
        try {
            f=new PrintWriter(new FileWriter(nomFich+".txt",true));
            DocCoche coche2= new DocCoche(pedirDatos.string("matricula"),pedirDatos.string("numero bastidor"),pedirDatos.string("marca"),pedirDatos.string("modelo"),pedirDatos.string("anomatriculacion"));
            f.println(coche2);
            f.close();
        } catch (IOException ex) {
            Logger.getLogger(Documentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    //Menú con las opciones
    
    public void MeduDoc(){
        int opcion;
                            opcion=pedirDatos.enteiro("\n 1: Comprobar Seguro"
                    + "\n 2: Comprobar Documentación de Coche"
                    + "\n 3: Añadir Seguro"
                    + "\n 4: Añadir Documentación de Coche");
                    switch(opcion){
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        default:
                            break;
                    }
    }
    
}
