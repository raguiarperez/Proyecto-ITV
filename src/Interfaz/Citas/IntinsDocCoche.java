/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Citas;

import BaseDatos.TablaDocCoche;
import BaseDatos.TablaSeguros;
import Documentación.Seguros;
import Interfaz.Citas.IntAccesoCita;
import Utilidades.ComprobarString;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class IntinsDocCoche extends javax.swing.JFrame {

    /**
     * Creates new form IntinsDocCoche
     */
    public IntinsDocCoche() {
        initComponents();
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
        jTextMatricula = new javax.swing.JTextField();
        jLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextNUMBASTIDOR = new javax.swing.JTextField();
        BtInsertar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextMARCA = new javax.swing.JTextField();
        jTextMODELO = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextANOMATRICULA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLbMin = new javax.swing.JLabel();
        jlbCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255)));

        jTextMatricula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        jTextMatricula.setForeground(new java.awt.Color(51, 51, 51));
        jTextMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMatriculaActionPerformed(evt);
            }
        });

        jLogo.setText("ITV GAL");
        jLogo.setBackground(new java.awt.Color(51, 51, 51));
        jLogo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLogo.setForeground(new java.awt.Color(51, 153, 255));

        jLabel2.setText("Acceso a Documentación Previa");
        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));

        jLabel3.setText("MATRICULA:");
        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));

        jTextNUMBASTIDOR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        jTextNUMBASTIDOR.setForeground(new java.awt.Color(51, 51, 51));
        jTextNUMBASTIDOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNUMBASTIDORActionPerformed(evt);
            }
        });

        BtInsertar.setText("Insertar / Modificar");
        BtInsertar.setBackground(new java.awt.Color(51, 153, 255));
        BtInsertar.setForeground(new java.awt.Color(255, 255, 255));
        BtInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtInsertarActionPerformed(evt);
            }
        });

        jLabel4.setText("NUMERO BASTIDOR:");
        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));

        jLabel5.setText("MARCA:");
        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));

        jTextMARCA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        jTextMARCA.setForeground(new java.awt.Color(51, 51, 51));
        jTextMARCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMARCAActionPerformed(evt);
            }
        });

        jTextMODELO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        jTextMODELO.setForeground(new java.awt.Color(51, 51, 51));
        jTextMODELO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMODELOActionPerformed(evt);
            }
        });

        jLabel6.setText("MODELO:");
        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));

        jTextANOMATRICULA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        jTextANOMATRICULA.setForeground(new java.awt.Color(51, 51, 51));
        jTextANOMATRICULA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextANOMATRICULAActionPerformed(evt);
            }
        });

        jLabel7.setText("AÑO MATRICULACIÓN:");
        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));

        jLbMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen minimizar.png"))); // NOI18N
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

        jlbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen cerrar.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtInsertar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLogo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLbMin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNUMBASTIDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextMARCA, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextMODELO, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextANOMATRICULA, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 87, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLogo)
                    .addComponent(jLbMin)
                    .addComponent(jlbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNUMBASTIDOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextMARCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextMODELO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextANOMATRICULA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(BtInsertar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMatriculaActionPerformed
        ComprobarString.longitud(7, jTextMatricula.getText());
    }//GEN-LAST:event_jTextMatriculaActionPerformed

    private void jTextNUMBASTIDORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNUMBASTIDORActionPerformed
        String numBastidor = jTextNUMBASTIDOR.getText();
    }//GEN-LAST:event_jTextNUMBASTIDORActionPerformed

    private void BtInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtInsertarActionPerformed
        if(!jTextNUMBASTIDOR.getText().isEmpty() && !jTextMARCA.getText().isEmpty() && !jTextMODELO.getText().isEmpty() && !jTextANOMATRICULA.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,TablaDocCoche.añadirDocCoche(jTextMatricula, jTextNUMBASTIDOR, jTextMARCA, jTextMODELO,jTextANOMATRICULA));
        ArrayList<Seguros> conS = new ArrayList<>();
        conS=TablaSeguros.consultaSeguros(IntAccesoCita.jTextDNI);
        TablaSeguros.actuConsultaSeguros(conS, IntDocu.TablaSeguro);
        TablaDocCoche.actuConsultaSegDocCoche(conS, IntDocu.TablaCoche);
        this.setVisible(false);        
        }else{
        JOptionPane.showMessageDialog(null, "Todos los campos deben ser rellenados.");
    }

    }//GEN-LAST:event_BtInsertarActionPerformed

    private void jTextMARCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMARCAActionPerformed
        String marca=jTextMARCA.getText();
    }//GEN-LAST:event_jTextMARCAActionPerformed

    private void jTextMODELOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMODELOActionPerformed
        String Modelo= jTextMODELO.getText();
    }//GEN-LAST:event_jTextMODELOActionPerformed

    private void jTextANOMATRICULAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextANOMATRICULAActionPerformed
        String Anomatricula= jTextANOMATRICULA.getText();
    }//GEN-LAST:event_jTextANOMATRICULAActionPerformed

    private void jLbMinMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMinMouseMoved
        jLbMin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLbMinMouseMoved

    private void jLbMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMinMouseClicked
        this.setState(IntinsDocCoche.ICONIFIED);
    }//GEN-LAST:event_jLbMinMouseClicked

    private void jLbMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMinMouseExited
        jLbMin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLbMinMouseExited

    private void jlbCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCerrarMouseMoved
        jlbCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jlbCerrarMouseMoved

    private void jlbCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCerrarMouseClicked
        int dialog =JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"Desea salir del programa?","Exit",dialog);
        if(result==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jlbCerrarMouseClicked

    private void jlbCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCerrarMouseExited
        jlbCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jlbCerrarMouseExited

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
            java.util.logging.Logger.getLogger(IntinsDocCoche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntinsDocCoche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntinsDocCoche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntinsDocCoche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntinsDocCoche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtInsertar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLbMin;
    private javax.swing.JLabel jLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextANOMATRICULA;
    private javax.swing.JTextField jTextMARCA;
    private javax.swing.JTextField jTextMODELO;
    public static javax.swing.JTextField jTextMatricula;
    private javax.swing.JTextField jTextNUMBASTIDOR;
    private javax.swing.JLabel jlbCerrar;
    // End of variables declaration//GEN-END:variables
}
