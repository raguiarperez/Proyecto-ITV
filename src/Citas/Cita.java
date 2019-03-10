/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Citas;

import Utilidades.pedirDatos;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;
import javax.swing.JOptionPane;





/**
 *
 * @author rafa2
 */
public class Cita implements Serializable {
    public HashMap<String, Cita> lista = new HashMap<>();
    transient Scanner sc;
    transient ObjectOutputStream fich;
    transient FileOutputStream f;
    transient ObjectInputStream fich1 = null;
    transient FileInputStream f1 = null;
    transient private String dni;
    transient public static String fecha;
    transient public static LocalTime time;
    public String fecha2;
    public LocalTime time2;
    private String localidad;
    Cita cit;

    public Cita() {

    }

    public Cita(String dni, String fecha2, LocalTime time2, String localidad) {
        this.dni = dni;
        this.fecha2 = fecha2;
        this.time2 = time2;
        this.localidad = localidad;
    }

    public Cita(String dni) {
        this.dni = dni;
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

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }

    public LocalTime getTime2() {
        return time2;
    }

    public void setTime2(LocalTime time2) {
        this.time2 = time2;
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
            opcion = pedirDatos.string("                                            Eliga localidad\n\n" + acum
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
        this.setFecha2(fecha);
        this.setTime2(time);
        return this;
    }

    //Metodo para añadir al fichero los datos
    public void engadir(String nomeFich, Cita cit) throws IOException {
        fich = new ObjectOutputStream(new FileOutputStream(nomeFich + ".dat"));
        lista.put(dni, cit);
        fich.writeObject(lista);
        fich.close();
    }

    // ARREGLAR
    public boolean comprobarCita(String nomFich) throws IOException, ClassNotFoundException {
        try {
            f1 = new FileInputStream(nomFich + ".dat");
            fich1 = new ObjectInputStream(f1);
            fileToHash("Citas");
            if (lista.containsKey(dni)) {
                f1.close();
                fich1.close();
                return true;

            }
            f1.close();
            fich1.close();
            return false;
        } catch (FileNotFoundException ex) {
            f = new FileOutputStream("Citas.dat");
            f.close();
            return false;
        }

    }

    //Método para pasar binario a HashMap
    public void fileToHash(String nomFich) throws FileNotFoundException, IOException, ClassNotFoundException {
        f1 = new FileInputStream(nomFich + ".dat");
        fich1 = new ObjectInputStream(f1);
        lista = (HashMap)fich1.readObject();
        f1.close();
        fich1.close();
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
        return localidad + " " + fecha2 + " " + time2;
    }

}
