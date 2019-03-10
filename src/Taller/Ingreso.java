/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller;

import Citas.Cita;
import static Citas.Cita.fecha;
import Documentación.*;
import Utilidades.pedirDatos;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Mirroriced
 */
public class Ingreso {

    Random rand = new Random();
    Cita cit;
    DocCoche doc;
    Seguros seg;
    HashMap<String, Cita> lista = new HashMap<>();

    public void comprobarIngreso(String dni) throws IOException, ClassNotFoundException, ParseException, InterruptedException {
        cit = new Cita();
        cit.fileToHash("Citas");
        if (!cit.lista.containsKey(dni)) {
            JOptionPane.showMessageDialog(null, "Usted no tiene cita");
        } else {
            cit = cit.lista.get(dni);
            SimpleDateFormat formatd = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha1 = formatd.parse(cit.getFecha2());
            Date da = new Date();
            double fecha1Millis = fecha1.getTime();
            double daMillis = da.getTime();
            double dayMillis = 24 * 60 * 60 * 1000;

            if (fecha1Millis < daMillis + 365 * dayMillis) {
                JOptionPane op = new JOptionPane("Por favor espere unos segundos...", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);

                JDialog dialog = new JDialog();
                dialog.setTitle("Message");
                dialog.setModal(true);
                dialog.setContentPane(op);
                dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                dialog.pack();
                    //Método para cerrar la ventana tras 5 segundos
                Timer timer = new Timer(5000, new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        dialog.dispose();
                    }
                });
                  timer.setRepeats(false); //Para que el timer solo funcione una vez
                  timer.start();//Para empezar el Timer
                  dialog.setVisible(true);//Para mostrar la ventana
                JOptionPane.showMessageDialog(null, "Pase por la puerta: \n" + (1 + rand.nextInt(3)));

            } else {
                JOptionPane.showMessageDialog(null, "Su cita es para dentro de un año, vuelva más tarde.");
            }

        }
    }
}
