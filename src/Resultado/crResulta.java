/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resultado;

import BaseDatos.General;
import Interfaz.Administrador.IntAdmin;
import Interfaz.IntPrincipal;
import Utilidades.ComprobarString;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafag
 */
public class crResulta extends javax.swing.JFrame {

    /**
     * Creates new form crResulta
     */
    public crResulta() {
        initComponents();
        General.connect();
           jLbAFall.setVisible(false);
            jComBoxFall.setVisible(false);
            BtInsertFallo.setVisible(false);
            jLbFallD.setVisible(false);
            TablaFallos.setVisible(false);
            jTxtFiDes.setVisible(false);
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
        jTextDni = new javax.swing.JTextField();
        jLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextMatr = new javax.swing.JTextField();
        BtGenerar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLbAFall = new javax.swing.JLabel();
        jLbFallD = new javax.swing.JLabel();
        jLbMinRes = new javax.swing.JLabel();
        jlbCerrar = new javax.swing.JLabel();
        jcBoxRes = new javax.swing.JComboBox<>();
        jComBoxFall = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaFallos = new javax.swing.JTable();
        BtInsertFallo = new javax.swing.JButton();
        jTxtFiDes = new javax.swing.JTextField();
        jTxtFieldRuta = new javax.swing.JTextField();
        BtPtPrinc = new javax.swing.JButton();
        BtNvRes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 204, 204), new java.awt.Color(0, 204, 204)));

        jTextDni.setForeground(new java.awt.Color(51, 51, 51));
        jTextDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDniActionPerformed(evt);
            }
        });

        jLogo.setBackground(new java.awt.Color(51, 51, 51));
        jLogo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLogo.setForeground(new java.awt.Color(0, 204, 204));
        jLogo.setText("ITV GAL");
        jLogo.setFocusable(false);

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Creacion de Resultados");
        jLabel2.setFocusable(false);

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("DNI:");
        jLabel3.setFocusable(false);

        jTextMatr.setForeground(new java.awt.Color(51, 51, 51));
        jTextMatr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jTextMatr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMatrActionPerformed(evt);
            }
        });

        BtGenerar.setBackground(new java.awt.Color(0, 204, 204));
        BtGenerar.setForeground(new java.awt.Color(255, 255, 255));
        BtGenerar.setText("Generar Resultado");
        BtGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtGenerarActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("MATRICULA:");
        jLabel4.setFocusable(false);

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("RESULTADO:");
        jLabel5.setFocusable(false);

        jLbAFall.setBackground(new java.awt.Color(51, 51, 51));
        jLbAFall.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLbAFall.setForeground(new java.awt.Color(0, 204, 204));
        jLbAFall.setText("AÑADIR FALLOS:");
        jLbAFall.setFocusable(false);

        jLbFallD.setBackground(new java.awt.Color(51, 51, 51));
        jLbFallD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLbFallD.setForeground(new java.awt.Color(0, 204, 204));
        jLbFallD.setText("FALLOS A DESTACAR:");

        jLbMinRes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimize Green.png"))); // NOI18N
        jLbMinRes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLbMinRes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLbMinResMouseMoved(evt);
            }
        });
        jLbMinRes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbMinResMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbMinResMouseExited(evt);
            }
        });

        jlbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close Green.png"))); // NOI18N
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

        jcBoxRes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Favorable", "Desfavorable", "Negativa" }));
        jcBoxRes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcBoxResItemStateChanged(evt);
            }
        });
        jcBoxRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcBoxResActionPerformed(evt);
            }
        });

        jComBoxFall.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Falta Leve", "Falta Grave" }));
        jComBoxFall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComBoxFallActionPerformed(evt);
            }
        });

        TablaFallos.setForeground(new java.awt.Color(51, 51, 51));
        TablaFallos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fallos", "Descripcion"
            }
        ));
        TablaFallos.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(TablaFallos);

        BtInsertFallo.setBackground(new java.awt.Color(0, 204, 204));
        BtInsertFallo.setForeground(new java.awt.Color(255, 255, 255));
        BtInsertFallo.setText("Insertar Fallo");
        BtInsertFallo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtInsertFalloActionPerformed(evt);
            }
        });

        jTxtFiDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFiDesActionPerformed(evt);
            }
        });

        jTxtFieldRuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtFieldRutaMouseClicked(evt);
            }
        });

        BtPtPrinc.setBackground(new java.awt.Color(0, 204, 204));
        BtPtPrinc.setForeground(new java.awt.Color(255, 255, 255));
        BtPtPrinc.setText("Menú Principal");
        BtPtPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPtPrincActionPerformed(evt);
            }
        });

        BtNvRes.setBackground(new java.awt.Color(0, 204, 204));
        BtNvRes.setForeground(new java.awt.Color(255, 255, 255));
        BtNvRes.setText("Nuevo Resultado");
        BtNvRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtNvResActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jTxtFiDes, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbAFall, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jcBoxRes, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextMatr, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDni, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComBoxFall, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLogo))
                        .addGap(10, 10, 10)
                        .addComponent(BtInsertFallo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtPtPrinc)
                                .addGap(79, 79, 79)
                                .addComponent(BtNvRes)
                                .addGap(67, 67, 67)
                                .addComponent(BtGenerar))
                            .addComponent(jTxtFieldRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLbFallD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jLbMinRes)
                .addGap(10, 10, 10)
                .addComponent(jlbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbMinRes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextMatr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jcBoxRes, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbAFall, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComBoxFall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtFiDes, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(BtInsertFallo)))
                .addGap(11, 11, 11)
                .addComponent(jLbFallD)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jTxtFieldRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtGenerar)
                    .addComponent(BtNvRes)
                    .addComponent(BtPtPrinc)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDniActionPerformed
        ComprobarString.longitud(7, jTextDni.getText());
    }//GEN-LAST:event_jTextDniActionPerformed

    private void jTextMatrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMatrActionPerformed
        String matricula = jTextMatr.getText();
    }//GEN-LAST:event_jTextMatrActionPerformed

    private void BtGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtGenerarActionPerformed
        if(jTxtFieldRuta.contains(0,1)){
            try{
                General.connect().close();
                Resultado.generarPDF(jTextDni,jTextMatr,jcBoxRes,TablaFallos);
                JOptionPane.showMessageDialog(null, "Impresión realizada");
            }catch (FileNotFoundException ex) {
                Logger.getLogger(crResulta.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(crResulta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Indique el destino del guardado.");
        }
    }//GEN-LAST:event_BtGenerarActionPerformed

    private void jLbMinResMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMinResMouseMoved
        jLbMinRes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLbMinResMouseMoved

    private void jLbMinResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMinResMouseClicked
        this.setState(crResulta.ICONIFIED);
    }//GEN-LAST:event_jLbMinResMouseClicked

    private void jLbMinResMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMinResMouseExited
        jLbMinRes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLbMinResMouseExited

    private void jlbCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCerrarMouseMoved
        jlbCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jlbCerrarMouseMoved

    private void jlbCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCerrarMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir del programa?", "Exit", dialog);
        if (result == 0) {
            try {
                General.connect().close();
                System.exit(0);
            } catch (SQLException ex) {
                Logger.getLogger(crResulta.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jlbCerrarMouseClicked

    private void jlbCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCerrarMouseExited
        jlbCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jlbCerrarMouseExited

    private void jcBoxResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBoxResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcBoxResActionPerformed

    private void jComBoxFallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComBoxFallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComBoxFallActionPerformed

    private void BtInsertFalloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtInsertFalloActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) TablaFallos.getModel();
        Object [] fila=new Object[2];
        fila[0]=jComBoxFall.getSelectedItem().toString();
        fila[1]=jTxtFiDes.getText();
        modelo.addRow(fila);


        TablaFallos.setModel(modelo);

         
    }//GEN-LAST:event_BtInsertFalloActionPerformed

    private void jcBoxResItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcBoxResItemStateChanged
        if(jcBoxRes.getSelectedItem().equals("Desfavorable")||jcBoxRes.getSelectedItem().equals("Negativa")){
            jLbAFall.setVisible(true);
            jComBoxFall.setVisible(true);
            BtInsertFallo.setVisible(true);
            jLbFallD.setVisible(true);
            TablaFallos.setVisible(true);
            jTxtFiDes.setVisible(true);
        }else if(jcBoxRes.getSelectedItem().equals("Favorable")){
        jLbAFall.setVisible(false);
            jComBoxFall.setVisible(false);
            BtInsertFallo.setVisible(false);
            jLbFallD.setVisible(false);
            TablaFallos.setVisible(false);
            jTxtFiDes.setVisible(false);
    }
    }//GEN-LAST:event_jcBoxResItemStateChanged

    private void jTxtFiDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFiDesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFiDesActionPerformed

    private void jTxtFieldRutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtFieldRutaMouseClicked
            JFileChooser dlg=new JFileChooser();
            int Option=dlg.showSaveDialog(this);
            if(Option== JFileChooser.APPROVE_OPTION){
                File f =dlg.getSelectedFile();
                String f1=f.toString();
                
                jTxtFieldRuta.setText(f1);
            }
    }//GEN-LAST:event_jTxtFieldRutaMouseClicked

    private void BtPtPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPtPrincActionPerformed
        try {
            General.connect().close();
            IntAdmin Int=new IntAdmin();
            Int.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(crResulta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BtPtPrincActionPerformed

    private void BtNvResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtNvResActionPerformed
        jTextDni.setText(null);
        jTextMatr.setText(null);
        jcBoxRes.setSelectedItem("Favorable");
        jTxtFiDes.setText(null);
        for (int i = 0; i < TablaFallos.getRowCount(); i++) {
            DefaultTableModel modelo = (DefaultTableModel) TablaFallos.getModel();
            modelo.removeRow(i);
            i-=1;
        }

    }//GEN-LAST:event_BtNvResActionPerformed

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
            java.util.logging.Logger.getLogger(crResulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crResulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crResulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crResulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crResulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtGenerar;
    private javax.swing.JButton BtInsertFallo;
    private javax.swing.JButton BtNvRes;
    private javax.swing.JButton BtPtPrinc;
    public static javax.swing.JTable TablaFallos;
    private javax.swing.JComboBox<String> jComBoxFall;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLbAFall;
    private javax.swing.JLabel jLbFallD;
    private javax.swing.JLabel jLbMinRes;
    private javax.swing.JLabel jLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField jTextDni;
    private javax.swing.JTextField jTextMatr;
    private javax.swing.JTextField jTxtFiDes;
    public static javax.swing.JTextField jTxtFieldRuta;
    private javax.swing.JComboBox<String> jcBoxRes;
    private javax.swing.JLabel jlbCerrar;
    // End of variables declaration//GEN-END:variables
}
