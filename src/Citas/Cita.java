package Citas;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
import java.text.*;
import java.time.LocalTime;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author 
 */
public class Cita implements Serializable {

    public static HashMap<String, Cita> lista = new HashMap<>();
    transient ObjectOutputStream fich;
    transient FileOutputStream f;
    transient ObjectInputStream fich1 = null;
    transient FileInputStream f1 = null;
    transient public static String fecha;
    transient public static LocalTime time;
    public String fecha2;
    public LocalTime time2;
    transient public static String localidad;
    public String localidad2;

    public Cita() {

    }

    public Cita(String fecha2, LocalTime time2, String localidad2) {
        this.fecha2 = fecha2;
        this.time2 = time2;
        this.localidad2 = localidad2;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad2(String localidad2) {
        this.localidad2 = localidad2;
    }

    public String getLocalidad2() {
        return localidad2;
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
    
    //método para imprimir en pdf
    public static void generarPDF(JTextField dni,JLabel fecha, JLabel hora,JLabel Localidad) throws FileNotFoundException {
        FileOutputStream archivo;
        archivo = new FileOutputStream(dni.getText()+".pdf");
        Document documento=new Document();
        try {
            PdfWriter.getInstance(documento, archivo);
        } catch (DocumentException ex) {
            Logger.getLogger(Cita.class.getName()).log(Level.SEVERE, null, ex);
        }
        documento.open();
        
        Paragraph parrafo= new Paragraph("Cita Previa");
        parrafo.setAlignment(1);
        try {
            documento.add(parrafo);

        
        documento.add(new Paragraph("Fecha: "+fecha.getText()));
        documento.add(new Paragraph("Hora: "+hora.getText()));        
        documento.add(new Paragraph("Localidad: "+Localidad.getText())); 
                } catch (DocumentException ex) {
            Logger.getLogger(Cita.class.getName()).log(Level.SEVERE, null, ex);
        }
        documento.close();
        
    }
    
    
    //Metodo para añadir al fichero los datos
    public void engadir(String nomeFich, Cita cit, String dni) throws IOException {
        fich = new ObjectOutputStream(new FileOutputStream(nomeFich + ".dat"));
        lista.put(dni, cit);
        fich.writeObject(lista);
        fich.close();
    }

    //Método para comprobar si la cita existe o no
    public boolean comprobarCita(String nomFich, String dni) throws IOException, ClassNotFoundException {
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
        } catch (EOFException ex2) {
            return false;
        }

    }

    public Cita getCita(String nomFich, String dni) throws IOException, ClassNotFoundException {
        Cita cit;
        try {
            f1 = new FileInputStream(nomFich + ".dat");
            fich1 = new ObjectInputStream(f1);
            fileToHash("Citas");
            if (lista.containsKey(dni)) {
                cit = lista.get(dni);
                f1.close();
                fich1.close();
                return cit;

            }
            f1.close();
            fich1.close();
        } catch (FileNotFoundException ex) {
            f = new FileOutputStream("Citas.dat");
            f.close();
        } catch (EOFException ex2) {
        }
        return null;
    }

    //Método para pasar binario a HashMap
    public void fileToHash(String nomFich) throws FileNotFoundException, IOException, ClassNotFoundException {
        f1 = new FileInputStream(nomFich + ".dat");
        fich1 = new ObjectInputStream(f1);
        lista = (HashMap) fich1.readObject();
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
