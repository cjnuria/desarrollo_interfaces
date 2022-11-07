/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login_sql;

import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;
import javax.swing.JOptionPane;
import metodos.TextPrompt;

/**
 *
 * @author nuria
 */
public class add_tipo_tarea extends javax.swing.JFrame {

    /**
     * Creates new form add_cuidados
     */
    public add_tipo_tarea() {
        initComponents();
        
        // Poner ejemplos en los text field
        TextPrompt placeholder = new TextPrompt ("Nueva tarea",jtTipo_tarea);
        TextPrompt placeholder2 = new TextPrompt ("Salaro extra €",jtsalario_extra);

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
        jLabel1 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtTipo_tarea = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtsalario_extra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonAceptarCuidados = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCombopeligrosidad = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Añadir tipo tarea");

        jLabel.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel.setForeground(new java.awt.Color(0, 153, 0));
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel.setText("Nombre Tarea");

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Peligrosidad");

        jtTipo_tarea.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jtTipo_tarea.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 0)));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Salario Extra");

        jtsalario_extra.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jtsalario_extra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 0)));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenes/Los-10-arboles-mas-grandes-del-mundo.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenes/Captura (1).png"))); // NOI18N
        jLabel3.setText("jLabel3");

        botonAceptarCuidados.setBackground(new java.awt.Color(102, 153, 0));
        botonAceptarCuidados.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        botonAceptarCuidados.setText("Aceptar");
        botonAceptarCuidados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAceptarCuidados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAceptarCuidadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAceptarCuidadosMouseExited(evt);
            }
        });
        botonAceptarCuidados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarCuidadosActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 153, 0));
        jButton2.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCombopeligrosidad.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jCombopeligrosidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alto", "Medio", "Bajo" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(57, 57, 57))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCombopeligrosidad, 0, 184, Short.MAX_VALUE)
                            .addComponent(jtTipo_tarea)
                            .addComponent(jtsalario_extra))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 59, Short.MAX_VALUE)
                                .addComponent(botonAceptarCuidados, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jCombopeligrosidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtTipo_tarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jtsalario_extra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAceptarCuidados, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarCuidadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarCuidadosActionPerformed

        if (!metodos.Utilidades_Control.contieneSoloLetras(jtTipo_tarea.getText())) {
            JOptionPane.showMessageDialog(null, "Solo se pueden introducir letras");

        }
        if (!metodos.Utilidades_Control.contieneSoloNumeros(jtsalario_extra.getText())) {
            JOptionPane.showMessageDialog(null, "Solo se pueden introducir numeros");

        } else {

            if (jtsalario_extra.getText().equals("") || jtTipo_tarea.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Los campos no pueden quedarse vacios");
            } else {
                String nombre_tarea = jtTipo_tarea.getText();
                String peligrosidad = jCombopeligrosidad.getSelectedItem().toString();
                float Extra_salario = Float.valueOf(jtsalario_extra.getText());

                boolean add = DBManager_login.add_tipo_tarea(nombre_tarea, peligrosidad, Extra_salario);
                if (add) {
                    JOptionPane.showMessageDialog(null, "Se ha añadido correctamente");
                    dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "No se ha añadido correctamente");

                }

            }

        }


    }//GEN-LAST:event_botonAceptarCuidadosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //limpiar cajas

        jtTipo_tarea.setText("");

        jtsalario_extra.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonAceptarCuidadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarCuidadosMouseEntered
          // Encima
        botonAceptarCuidados.setBackground(new Color(153, 153, 0));
        botonAceptarCuidados.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_botonAceptarCuidadosMouseEntered

    private void botonAceptarCuidadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarCuidadosMouseExited
         // fuera
        botonAceptarCuidados.setBackground(new Color(102, 153, 0));
    }//GEN-LAST:event_botonAceptarCuidadosMouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // Encima
        jButton2.setBackground(new Color(153, 153, 0));
        jButton2.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
       // fuera
        jButton2.setBackground(new Color(102, 153, 0));
    }//GEN-LAST:event_jButton2MouseExited

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(add_cuidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(add_cuidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(add_cuidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(add_cuidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new add_cuidados().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptarCuidados;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCombopeligrosidad;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtTipo_tarea;
    private javax.swing.JTextField jtsalario_extra;
    // End of variables declaration//GEN-END:variables
}
