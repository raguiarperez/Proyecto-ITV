/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Citas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rafa2
 */
public class Cita{
    File fich=null;
    PrintWriter f= null;
    private String dni;
    public static String fecha;
    public static LocalTime time;
    private String localidad;

    public Cita() {

    }

    public ArrayList<String> crearArray(ArrayList<String> ciudad) {

        ciudad.add("Vigo");
        ciudad.add("Madrid");
        ciudad.add("Barcelona");
        ciudad.add("Valencia");
        ciudad.add("Ourense");
        return ciudad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Cita selLocalidad(ArrayList<String> local) {
        String acum = "";
        String opcion;
        for (String localidades : local) {
            acum = acum + localidades + "           ";
        }

        do {
            opcion = JOptionPane.showInputDialog(null, "                                            Eliga localidad\n\n" + acum
                                                + "\n\n                                                     SAIR");

            switch (opcion) {
                case "Vigo":
                    this.setLocalidad(local.get(0));
                    return this;

                case "Madrid":
                    this.setLocalidad(local.get(1));
                    return this;

                case "Barcelona":
                    this.setLocalidad(local.get(2));
                    return this;
                case "Valencia":
                    this.setLocalidad(local.get(3));
                    return this;
                case "Ourense":
                    this.setLocalidad(local.get(4));
                    return this;
                default:
                    return null;

            }
        } while (!"sair".equals(opcion));
    }

    public Cita selFecha() throws InterruptedException{
        FechaCita cit = new FechaCita();
        cit.setVisible(true);
        while (cit.isVisible()) {
            Thread.sleep(1000);
        }
        return this;
    }
    
    public void engadir(String nomeFich) throws IOException{
            f= new PrintWriter (new FileWriter(nomeFich+".txt",true)); //Si true, engade no ficheiro, non sobreescribe
            f.println(this);
            f.close();  
    }
    
    @Override
    public String toString() {
        return dni + " " + localidad + " " + fecha + " " + time;
    }

}
