/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Citas;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author rafa2
 */
public class Cita {
    private String dni;
    private Date fecha;
    private String localidad;

    public Cita(String dni, Date fecha, String localidad) {
        this.dni = dni;
        this.fecha = fecha;
        this.localidad = localidad;
    }
    public Cita(){
        
    }
            
   public ArrayList<String> crearArray(ArrayList<String>ciudad){

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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
public Cita selLocalidad(ArrayList<String> local){
        Cita cita1= new Cita();
        String acum="";
        String opcion;
        for (String localidades : local) {
            acum= acum +localidades+"           ";
        }

        do{
        opcion=JOptionPane.showInputDialog(null,"                 Eliga localidad\n\n"+ acum+"\n\n                      SAIR");

            switch (opcion){
                case "Vigo":
                    cita1.setLocalidad(local.get(0));
                    return cita1;
                    
                case "Madrid":
                    cita1.setLocalidad(local.get(1));
                    return cita1;
                   
                case "Barcelona":
                    cita1.setLocalidad(local.get(2));
                    return cita1;
                case "Valencia":
                   cita1.setLocalidad(local.get(3));
                    return cita1;
                case "Ourense":
                    cita1.setLocalidad(local.get(4));
                    return cita1;
                default:
                    return null;

            }
        } while(!"sair".equals(opcion));
    }
    
    @Override
    public String toString() {
        return  dni + " " + fecha + " " + localidad;
    }
    
    
}
