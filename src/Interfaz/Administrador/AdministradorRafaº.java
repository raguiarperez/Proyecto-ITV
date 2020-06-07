
package Interfaz.Administrador;

import Resultado.crResulta;
import BaseDatos.TablaDocCoche;
import BaseDatos.TablaSeguros;
import Interfaz.Citas.IntDocu;
import static Interfaz.Interfaz.fecha;
import Interfaz.Documentación.IntAccesoDoc;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 * @author Mirroriced y Rafsniper
 */
public class AdministradorRafaº extends javax.swing.JFrame implements Runnable {

    String hora, minutos, segundos;
    Thread hilo;

    /**
     * Creates new form Administrador
     */
    public AdministradorRafaº() {
        initComponents();
        lbfecha.setText(fecha());
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbfecha = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        lbAdmin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbDoc = new javax.swing.JLabel();
        lbinfodoc = new javax.swing.JLabel();
        jLbMin = new javax.swing.JLabel();
        jlbCerrar = new javax.swing.JLabel();
        lbTaller = new javax.swing.JLabel();
        lbinfoTaller = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 54));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¿Que desea realizar?");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ITV ERD");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 47));

        lbfecha.setForeground(new java.awt.Color(255, 255, 255));
        lbfecha.setText("DD/MM/YYYY");
        jPanel2.add(lbfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lbHora.setForeground(new java.awt.Color(255, 255, 255));
        lbHora.setText("00:00:00");
        jPanel2.add(lbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        lbAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jPanel2.add(lbAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 80, 100));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MODO ADMINISTRADOR");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 270, 420));

        lbDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Documentacion.png"))); // NOI18N
        lbDoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbDoc.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbDocMouseMoved(evt);
            }
        });
        lbDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDocMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbDocMouseExited(evt);
            }
        });
        jPanel1.add(lbDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 100, 120));

        lbinfodoc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbinfodoc.setForeground(new java.awt.Color(102, 102, 102));
        lbinfodoc.setText("Documentación");
        jPanel1.add(lbinfodoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLbMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimizar.png"))); // NOI18N
        jLbMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLbMin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLbMinMouseMoved(evt);
            }
        });
        jLbMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbMinMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbMinMouseExited(evt);
            }
        });
        jPanel1.add(jLbMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, 40));

        jlbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        jlbCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbCerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlbCerrarMouseMoved(evt);
            }
        });
        jlbCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbCerrarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbCerrarMouseExited(evt);
            }
        });
        jPanel1.add(jlbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 30, 40));

        lbTaller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller.png"))); // NOI18N
        lbTaller.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbTaller.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbTallerMouseMoved(evt);
            }
        });
        lbTaller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTallerMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbTallerMouseExited(evt);
            }
        });
        jPanel1.add(lbTaller, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, 100));

        lbinfoTaller.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbinfoTaller.setForeground(new java.awt.Color(102, 102, 102));
        lbinfoTaller.setText("Crear Resultados");
        jPanel1.add(lbinfoTaller, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbDocMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDocMouseMoved
        lbDoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_lbDocMouseMoved

    private void lbDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDocMouseClicked
        IntDocu Idoc = new IntDocu();
        TablaSeguros.actualizarTablaSeguros(IntDocu.TablaSeguro);
        TablaDocCoche.actualizarTablaDocCoche(IntDocu.TablaCoche);
        Idoc.setVisible(true);
        IntDocu.BtInsertarCoche.setVisible(false);
        IntDocu.BtInsertarSeguro.setVisible(false);
        IntDocu.jLabel1.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_lbDocMouseClicked

    private void lbDocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDocMouseExited
        lbDoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lbDocMouseExited

    private void jLbMinMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMinMouseMoved
        jLbMin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jLbMinMouseMoved

    private void jLbMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMinMouseClicked
        this.setState(AdministradorRafaº.ICONIFIED);
    }//GEN-LAST:event_jLbMinMouseClicked

    private void jLbMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMinMouseExited
        jLbMin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jLbMinMouseExited

    private void jlbCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCerrarMouseMoved
        jlbCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jlbCerrarMouseMoved

    private void jlbCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCerrarMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir del programa?", "Exit", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jlbCerrarMouseClicked

    private void jlbCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCerrarMouseExited
        jlbCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jlbCerrarMouseExited

    private void lbTallerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTallerMouseMoved
        lbTaller.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_lbTallerMouseMoved

    private void lbTallerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTallerMouseClicked
        crResulta icr =new crResulta();
        icr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbTallerMouseClicked

    private void lbTallerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTallerMouseExited
        lbTaller.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lbTallerMouseExited

    public void hora() {
        Calendar calendario = new GregorianCalendar();
        Date horactual = new Date();
        calendario.setTime(horactual);
        hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }

    public void run() {
        Thread current = Thread.currentThread();
        while (current == hilo) {
            hora();
            lbHora.setText(hora + ":" + minutos + ":" + segundos);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdministradorRafaº.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorRafaº.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorRafaº.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorRafaº.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorRafaº().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLbMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlbCerrar;
    private javax.swing.JLabel lbAdmin;
    private javax.swing.JLabel lbDoc;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbTaller;
    private javax.swing.JLabel lbfecha;
    private javax.swing.JLabel lbinfoTaller;
    private javax.swing.JLabel lbinfodoc;
    // End of variables declaration//GEN-END:variables
}
