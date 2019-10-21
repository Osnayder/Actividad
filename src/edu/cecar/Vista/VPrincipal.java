package edu.cecar.Vista;

/**
 *
 * Clase: Persona
 * 
 * @version: 0.1
 *  
 * @since: 21/10/2019
 * 
 * Fecha de Modificación:
 * 
 * @author: Osnayder conde Rodriguez, Jader Arcia Baldovino, Calor Beltran Guzman
 * 
 * Copyright: CECAR
 */

import edu.cecar.Controlador.SingletonConexionBD;
import edu.cecar.Modelo.Persona;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VPrincipal extends javax.swing.JFrame {
    Connection conexion = SingletonConexionBD.getInstance();

    public VPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal");
        setAlwaysOnTop(true);

        jPanel1.setLayout(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(190, 20, 180, 27);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(190, 60, 180, 30);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(190, 110, 180, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(190, 160, 180, 30);

        jButton1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jButton1.setText("Guadar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(240, 340, 73, 23);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel1.setText("Identificación");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(84, 20, 80, 30);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel2.setText("nombres");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(101, 60, 60, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel3.setText("apellidos");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(101, 110, 60, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel4.setText("Fecha de Nacimiento");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(39, 164, 120, 20);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel8.setText("Direccion Residencia");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 210, 120, 30);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel11.setText("Departamento");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 250, 90, 30);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel12.setText("Salario");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(100, 290, 60, 30);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(190, 210, 180, 30);
        jPanel1.add(jTextField13);
        jTextField13.setBounds(190, 250, 180, 30);
        jPanel1.add(jTextField14);
        jTextField14.setBounds(190, 290, 180, 30);

        jTabbedPane1.addTab("Guadar", jPanel1);

        jPanel2.setLayout(null);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField5);
        jTextField5.setBounds(18, 11, 140, 30);

        jButton2.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(170, 10, 100, 30);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel9.setText("Nombres");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(60, 80, 70, 30);

        jTextField11.setBackground(new java.awt.Color(240, 240, 240));
        jTextField11.setBorder(null);
        jPanel2.add(jTextField11);
        jTextField11.setBounds(140, 80, 150, 30);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel10.setText("Apellidos");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(60, 130, 70, 30);

        jTextField12.setBackground(new java.awt.Color(240, 240, 240));
        jTextField12.setBorder(null);
        jPanel2.add(jTextField12);
        jTextField12.setBounds(140, 130, 150, 30);

        jTabbedPane1.addTab("Eliminar", jPanel2);

        jPanel3.setLayout(null);

        jTextField6.setBackground(new java.awt.Color(240, 240, 240));
        jTextField6.setBorder(null);
        jPanel3.add(jTextField6);
        jTextField6.setBounds(130, 60, 160, 30);

        jTextField7.setBackground(new java.awt.Color(240, 240, 240));
        jTextField7.setBorder(null);
        jPanel3.add(jTextField7);
        jTextField7.setBounds(130, 110, 160, 30);

        jTextField8.setBackground(new java.awt.Color(240, 240, 240));
        jTextField8.setBorder(null);
        jPanel3.add(jTextField8);
        jTextField8.setBounds(130, 160, 160, 30);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel5.setText("Nombre");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(60, 60, 60, 30);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel6.setText("Apellido");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(60, 110, 50, 30);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel7.setText("Fecha Nacimiento");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 160, 110, 30);

        jButton3.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(173, 11, 80, 30);
        jPanel3.add(jTextField10);
        jTextField10.setBounds(26, 11, 120, 30);

        jTabbedPane1.addTab("Consultar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(578, 462));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Boton para guardar
        
        if(!jTextField1.getText().equals("") && !jTextField2.getText().equals("")){
            
        }
        
        Persona persona = new Persona();
        persona.setIdentificacion(jTextField1.getText());
        persona.setNombres(jTextField2.getText());
        persona.setApellidos(jTextField3.getText());
        persona.setFechaNacimiento(jTextField4.getText());
        persona.setResidencia(jTextField9.getText());
        persona.setDepartamento(Integer.parseInt(jTextField13.getText()));
        persona.setSalario(Integer.parseInt(jTextField14.getText()));
        
        JOptionPane.showMessageDialog(this, "Guardar", "Se Guardo de Manera exitosa", JOptionPane.INFORMATION_MESSAGE);
        
       
         /*try {
            CallableStatement cst = conexion.prepareCall("{call gestionarempleado (?,?,?,?,?,?,?)}");
            
            cst.execute();
            
            String nombre = cst.getString(2);
            String sexo = cst.getString(3);
            String curso = cst.getString(4);
            JOptionPane.showMessageDialog(null, "Guardar", "Se Guardo de Manera exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Guardar", "No Se Pudo Guardar, Error: "+ex.getMessage(), JOptionPane.INFORMATION_MESSAGE);
            
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      // Boton para eliminar
        String idBuscar = jTextField5.getText();
       
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       // Boton para consultar
        String idBuscar = jTextField10.getText();
       
    }//GEN-LAST:event_jButton3ActionPerformed

    
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
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
