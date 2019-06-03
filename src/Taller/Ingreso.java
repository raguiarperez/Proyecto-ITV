/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller;

import Citas.Cita;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author Mirroriced y Rafsniper
 */
public class Ingreso {

    Random rand = new Random();
    Cita cit;
    HashMap<String, Cita> lista = new HashMap<>();

    //Método que comprueba si hay una cita y si es en el mismo día te deja pasar indicando la puerta a acceder
    public boolean comprobarIngreso(String dni) throws IOException, ClassNotFoundException, ParseException, InterruptedException {
        cit = new Cita();
        cit.fileToHash("Citas");
        if (!cit.lista.containsKey(dni)) {
            JOptionPane.showMessageDialog(null, "Usted no tiene cita");
            return false;
        } else {
            cit = cit.lista.get(dni);
            SimpleDateFormat formatd = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha1 = formatd.parse(cit.getFecha2());
            Date da = new Date();
            double fecha1Millis = fecha1.getTime();
            double daMillis = da.getTime();
            double dayMillis = 24 * 60 * 60 * 1000;
            // Comparamos la cita con la fecha actual.Si la fecha es el mismo día, deja pasar (para probar poner 2 días)
            if (fecha1Millis < daMillis + 2 * dayMillis) {
               return true;
            } else {
                return false;
            }

        }
        
    }
}
