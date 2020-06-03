/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resultado;

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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
/**
 *
 * @author rafag
 */
public class Resultado implements Serializable {
    public String DNI;
    public String Matricula;
    public String fecha;
    public String fallos;
    
    public Resultado(){
        
    }

    public Resultado(String DNI, String Matricula, String fecha, String fallos) {
        this.DNI = DNI;
        this.Matricula = Matricula;
        this.fecha = fecha;
        this.fallos = fallos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFallos() {
        return fallos;
    }

    public void setFallos(String fallos) {
        this.fallos = fallos;
    }
       //método para imprimir en pdf
    public static void generarPDF(JTextField dni,JTextField matricula, JComboBox Resultado ,JTable Fallos) throws FileNotFoundException {
        FileOutputStream archivo;
        archivo = new FileOutputStream(dni.getText()+" Resultado "+".pdf");
        Document documento=new Document();
        try {
            PdfWriter.getInstance(documento, archivo);
        } catch (DocumentException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
        documento.open();
        
        Paragraph parrafo= new Paragraph("Resultado");
        parrafo.setAlignment(1);
        try {
            documento.add(parrafo);

        documento.add(new Paragraph("DNI: "+dni.getText()));
        documento.add(new Paragraph("Matricula: "+matricula.getText()));
        documento.add(new Paragraph("Resultado: "+Resultado.getSelectedItem()));
        for (int i = 0; i < Fallos.getRowCount(); i++) {
            documento.add(new Paragraph((String) Fallos.getValueAt(i, 0)));
            documento.add(new Paragraph((String) Fallos.getValueAt(i, 1)));
            documento.add(new Paragraph((String) Fallos.getValueAt(i, 2)));
 }                
                } catch (DocumentException ex) {
            Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
        }
        documento.close();
        
    }
    
}
