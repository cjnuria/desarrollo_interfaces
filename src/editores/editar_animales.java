/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package editores;

import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Frame.DEFAULT_CURSOR;
import static java.awt.Frame.HAND_CURSOR;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.StringValueExp;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import login_sql.DBManager_login;
import login_sql.add_animal;

/**
 *
 * @author nuria
 */
public class editar_animales extends javax.swing.JFrame {

    /**
     * Creates new form editar_animales
     */
    public editar_animales(int id, String especie, String peso, String raza, String nombre) {
        initComponents();
        ListarEspecies();
        jtid.setText(String.valueOf(id));
        jComboBoxEspecieAnimal.setSelectedItem(especie);
        jtPesoAnimal.setText(peso);
        jtRazaAnimal1.setText(raza);
        jtNombreAnimal.setText(nombre);
        
        
        
        
      
    }
    //________________________________________________________________________________________________
    // listar especie
     public void ListarEspecies() {

        String consulta_sql = " SELECT * FROM especie";

        ResultSet resultado = DBManager_login.obtener_tablas(DEFAULT_CURSOR, DISPOSE_ON_CLOSE, consulta_sql);
        // guardas en resultado en esta variable y el default te pone por defecto un 0
        try {
            while (resultado.next()) {
                String nombre_especie = resultado.getString("nombre");
                jComboBoxEspecieAnimal.addItem(nombre_especie);
            }
        } catch (SQLException ex) {
            Logger.getLogger(add_animal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            resultado.close();
        } catch (SQLException ex) {
            Logger.getLogger(add_animal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //__________________________________________________________________________
    // rellenar campos
    
        
    

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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonGuardarAnimal = new javax.swing.JButton();
        jtNombreAnimal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtPesoAnimal = new javax.swing.JTextField();
        jtid = new javax.swing.JTextField();
        botonLimpiarAnimal = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxEspecieAnimal = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jtRazaAnimal1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar Animal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 250, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenes/Captura (1).png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 100, 70));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 90, 30));

        botonGuardarAnimal.setText("Guardar");
        botonGuardarAnimal.setBackground(new java.awt.Color(102, 153, 0));
        botonGuardarAnimal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonGuardarAnimal.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        botonGuardarAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonGuardarAnimalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonGuardarAnimalMouseExited(evt);
            }
        });
        botonGuardarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarAnimalActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuardarAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 120, 40));

        jtNombreAnimal.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jtNombreAnimal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 0)));
        jPanel1.add(jtNombreAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 260, 40));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Especie");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 90, 30));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 90, 30));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Raza");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 90, 30));

        jtPesoAnimal.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jtPesoAnimal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 0)));
        jPanel1.add(jtPesoAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 260, 40));

        jtid.setEditable(false);
        jtid.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jtid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 0)));
        jPanel1.add(jtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 250, 40));

        botonLimpiarAnimal.setText("Limpiar");
        botonLimpiarAnimal.setActionCommand("botonlimpiar");
        botonLimpiarAnimal.setBackground(new java.awt.Color(102, 153, 0));
        botonLimpiarAnimal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonLimpiarAnimal.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        botonLimpiarAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonLimpiarAnimalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonLimpiarAnimalMouseExited(evt);
            }
        });
        botonLimpiarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarAnimalActionPerformed(evt);
            }
        });
        jPanel1.add(botonLimpiarAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 130, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenes/Los-10-arboles-mas-grandes-del-mundo.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 450));

        jComboBoxEspecieAnimal.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jComboBoxEspecieAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBoxEspecieAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jComboBoxEspecieAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 250, 30));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Peso");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 90, 30));

        jtRazaAnimal1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jtRazaAnimal1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 0)));
        jPanel1.add(jtRazaAnimal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 260, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarAnimalActionPerformed
        //BOTON GUARDAR DE ANIMALES
  
        String especie = jComboBoxEspecieAnimal.getSelectedItem().toString();
        String nombre = jtNombreAnimal.getText();
        String raza = jtRazaAnimal1.getText();

        // insertar animales
        if (especie.equals("") || nombre.equals("") || raza.equals("") || jtPesoAnimal.getText().equals("") || jComboBoxEspecieAnimal.getSelectedItem().equals(null)) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios.");

        } else {
            float peso = Float.parseFloat(jtPesoAnimal.getText());// recuerda hacer un casting
            int id = Integer.parseInt(jtid.getText()) ;
            boolean comprobar = DBManager_login.actualizar_animales(id,especie, nombre, raza, peso);
            if (comprobar) {
                JOptionPane.showMessageDialog(null, "Modifica correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            }
        }
        dispose();

    }//GEN-LAST:event_botonGuardarAnimalActionPerformed

    private void botonLimpiarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarAnimalActionPerformed

        // limpiar cajas de texto
        jtNombreAnimal.setText("");
        jtPesoAnimal.setText("");
        jtRazaAnimal1.setText("");
    }//GEN-LAST:event_botonLimpiarAnimalActionPerformed

    private void botonGuardarAnimalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarAnimalMouseEntered
          // Encima
        botonGuardarAnimal.setBackground(new Color(153, 153, 0));
        botonGuardarAnimal.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_botonGuardarAnimalMouseEntered

    private void botonLimpiarAnimalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLimpiarAnimalMouseEntered
          // Encima
        botonLimpiarAnimal.setBackground(new Color(153, 153, 0));
        botonLimpiarAnimal.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_botonLimpiarAnimalMouseEntered

    private void botonGuardarAnimalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarAnimalMouseExited
        // fuera
        botonGuardarAnimal.setBackground(new Color(102, 153, 0));
    }//GEN-LAST:event_botonGuardarAnimalMouseExited

    private void botonLimpiarAnimalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLimpiarAnimalMouseExited
        // fuera
        botonLimpiarAnimal.setBackground(new Color(102, 153, 0));
    }//GEN-LAST:event_botonLimpiarAnimalMouseExited

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
//            java.util.logging.Logger.getLogger(editar_animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(editar_animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(editar_animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(editar_animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new editar_animales().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardarAnimal;
    private javax.swing.JToggleButton botonLimpiarAnimal;
    private javax.swing.JComboBox<String> jComboBoxEspecieAnimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtNombreAnimal;
    private javax.swing.JTextField jtPesoAnimal;
    private javax.swing.JTextField jtRazaAnimal1;
    private javax.swing.JTextField jtid;
    // End of variables declaration//GEN-END:variables
}
