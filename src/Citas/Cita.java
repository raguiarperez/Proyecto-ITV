/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Citas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rafa2
 */
public class Cita {

    Scanner sc;
    File fich = null;
    PrintWriter f = null;
    private String dni;
    public static String fecha;
    public static LocalTime time;
    private String localidad;

    public Cita() {

    }

        //ArrayList de Localidades
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

    public static LocalTime getTime() {
        return time;
    }

    public static void setTime(LocalTime time) {
        Cita.time = time;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

        //Metodo Ventana que muestra el Array de Localidades a elegir
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
    
    //Metodo con JFrame para seleccionar Fecha y Hora
    public Cita selFecha() throws InterruptedException {
        FechaCita cit = new FechaCita();
        cit.setVisible(true);
        while (cit.isVisible()) {
            Thread.sleep(1000);
        }
        return this;
    }

        //Metodo para añadir al fichero los datos
    public void engadir(String nomeFich) throws IOException {
        f = new PrintWriter(new FileWriter(nomeFich + ".txt", true)); //Si true, engade no ficheiro, non sobreescribe
        f.println(this);
        f.close();
    }

    // ARREGLAR
    public boolean comprobarCita(String nomFich) {
        sc = new Scanner(nomFich);
        while (sc.hasNextLine()) {
            String[] datos = sc.nextLine().split(" ");
            System.out.println(datos[0]);
            if (datos[0].equalsIgnoreCase(dni)) {
                sc.close();
                return true;

            }

        }
        sc.close();
        return false;

    }

    //Método para comprobar que la fecha y hora no se pasa de los límites puestos
    public boolean comprobarFechaHora() throws ParseException {
        LocalTime time1 = LocalTime.parse("07:00");
        LocalTime time2 = LocalTime.parse("21:00");
        SimpleDateFormat formatd = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha1 = formatd.parse(fecha);
        Date dd = formatd.parse("01/01/2021");
        Date da = new Date();

        //Comprobamos año que no pase de 2021 ni sea menor que la fecha actual
        if (fecha1.after(da) && fecha1.before(dd)) {
            //Si es true comprobamos la hora que no sea menor que 07 ni superior que 21
            int value = time.compareTo(time1);
            int value2 = time.compareTo(time2);
            if (value > 0 && value2 < 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return dni + " " + localidad + " " + fecha + " " + time;
    }

}
