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
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import login_sql.DBManager_login;
import login_sql.add_animal;

/**
 *
 * @author nuria
 */
public class editar_tarea extends javax.swing.JFrame {

    /**
     * Creates new form editar_tarea
     */
    
    public editar_tarea(String cuidador,String telefono, String tarea,String animal, String fecha ) {
        initComponents();
        ListarAnimal();
        ListarTarea();
        Listarpersonas();
        jComboeditar_animal_tarea.setSelectedItem(animal);
        jComboEditar_tarea.setSelectedItem(tarea);
        jComboEditar_cuidador_tareas.setSelectedItem(cuidador);
        dateTimePicker1.datePicker.setText(fecha.substring(0,10));
        dateTimePicker1.timePicker.setText(fecha.substring(12,16));
    }
     //________________________________________________________________________________________________
    // listar especie
     public void ListarAnimal() {

        String consulta_sql = " SELECT * FROM animales";

        ResultSet resultado = DBManager_login.obtener_tablas(DEFAULT_CURSOR, DISPOSE_ON_CLOSE, consulta_sql);
        // guardas en resultado en esta variable y el default te pone por defecto un 0
        try {
            while (resultado.next()) {
                String nombre_animal = resultado.getString("nombre");
                jComboeditar_animal_tarea.addItem(nombre_animal);
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
     //_____________________________________________________________________________________________________
    public void Listarpersonas() {

        String consulta_sql = " SELECT * FROM personas where cargo = 'empleado' ";

        ResultSet resultado = DBManager_login.obtener_tablas(DEFAULT_CURSOR, DISPOSE_ON_CLOSE, consulta_sql);
        // guardas en resultado en esta variable y el default te pone por defecto un 0
        try {
            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String contacto = resultado.getString("telefono");
                jComboEditar_cuidador_tareas.addItem(contacto + " - " + nombre);

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
      //________________________________________________________________________________________________
    // listar tarea
     public void ListarTarea() {

        String consulta_sql = " SELECT * FROM cuidados";

        ResultSet resultado = DBManager_login.obtener_tablas(DEFAULT_CURSOR, DISPOSE_ON_CLOSE, consulta_sql);
        // guardas en resultado en esta variable y el default te pone por defecto un 0
        try {
            while (resultado.next()) {
                String nombre_tarea = resultado.getString("nombre_tarea");
                jComboEditar_tarea.addItem(nombre_tarea);
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
//     //________________________________________________________________________________________________
//    // listar Cuidador
//     public void Listarcuidador() {
//
//        String consulta_sql = " SELECT * FROM personas where cargo = 'empleado'";
//
//        ResultSet resultado = DBManager_login.obtener_tablas(DEFAULT_CURSOR, DISPOSE_ON_CLOSE, consulta_sql);
//        // guardas en resultado en esta variable y el default te pone por defecto un 0
//        try {
//            while (resultado.next()) {
//                String nombre_persona = resultado.getString("nombre");
//                jComboEditar_cuidador_tareas.addItem(nombre_persona);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(add_animal.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            resultado.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(add_animal.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel0 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelEntradas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboeditar_animal_tarea = new javax.swing.JComboBox<>();
        jComboEditar_tarea = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboEditar_cuidador_tareas = new javax.swing.JComboBox<>();
        dateTimePicker1 = new com.github.lgooddatepicker.components.DateTimePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenes/Los-10-arboles-mas-grandes-del-mundo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jPanelEntradas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Editar Tareas");
        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenes/Captura (1).png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setText("Animal");
        jLabel4.setFont(new java.awt.Font("Roboto Slab Light", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));

        jLabel8.setText("Tarea");
        jLabel8.setFont(new java.awt.Font("Roboto Slab Light", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));

        jLabel10.setText("Fecha");
        jLabel10.setFont(new java.awt.Font("Roboto Slab Light", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 0));

        jComboeditar_animal_tarea.setFont(new java.awt.Font("Roboto Slab Light", 0, 18)); // NOI18N

        jComboEditar_tarea.setFont(new java.awt.Font("Roboto Slab Light", 0, 18)); // NOI18N

        jButton1.setText("Aceptar");
        jButton1.setBackground(new java.awt.Color(102, 153, 0));
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Cuidador");
        jLabel5.setFont(new java.awt.Font("Roboto Slab Light", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));

        jComboEditar_cuidador_tareas.setFont(new java.awt.Font("Roboto Slab Light", 0, 18)); // NOI18N
        jComboEditar_cuidador_tareas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboEditar_cuidador_tareasItemStateChanged(evt);
            }
        });
        jComboEditar_cuidador_tareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboEditar_cuidador_tareasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEntradasLayout = new javax.swing.GroupLayout(jPanelEntradas);
        jPanelEntradas.setLayout(jPanelEntradasLayout);
        jPanelEntradasLayout.setHorizontalGroup(
            jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEntradasLayout.createSequentialGroup()
                .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEntradasLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboEditar_tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboeditar_animal_tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jComboEditar_cuidador_tareas, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelEntradasLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEntradasLayout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(dateTimePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEntradasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );

        jPanelEntradasLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboEditar_cuidador_tareas, jComboEditar_tarea, jComboeditar_animal_tarea});

        jPanelEntradasLayout.setVerticalGroup(
            jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEntradasLayout.createSequentialGroup()
                .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEntradasLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addGroup(jPanelEntradasLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)))
                .addGap(26, 26, 26)
                .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboeditar_animal_tarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboEditar_tarea))
                .addGap(22, 22, 22)
                .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboEditar_cuidador_tareas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateTimePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel0Layout = new javax.swing.GroupLayout(jPanel0);
        jPanel0.setLayout(jPanel0Layout);
        jPanel0Layout.setHorizontalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel0Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel0Layout.setVerticalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel0Layout.createSequentialGroup()
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // boton guardar tarea

        String animal = jComboeditar_animal_tarea.getSelectedItem().toString();
        int id_animales = DBManager_login.obtener_animal_porNombre(animal);
        String tarea = jComboEditar_tarea.getSelectedItem().toString();
        int id_tipo_tarea = DBManager_login.obtener_trabajo_porNombre(tarea);
        String cuidador = jComboEditar_cuidador_tareas.getSelectedItem().toString();
        String contacto = cuidador.substring(0, 9);
        System.out.println(contacto);
        String  id_cuidador = DBManager_login.obtener_cuidador_porTelefono((contacto));
        System.out.println(id_cuidador);
        String fecha_dia = dateTimePicker1.getDatePicker().toString();
        String fecha_hora = dateTimePicker1.getTimePicker().toString();
        String fecha = fecha_dia + " " + fecha_hora;

        // insertar animales
        if (jComboeditar_animal_tarea.getSelectedItem().equals(null) || jComboEditar_tarea.getSelectedItem().equals(null) || jComboEditar_cuidador_tareas.getSelectedItem().equals(null) || dateTimePicker1.getTimePicker().toString().equals("") || dateTimePicker1.getDatePicker().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios.");

        } else {
            System.out.println(fecha);
            System.out.println(cuidador);
            System.out.println(id_tipo_tarea);
            System.out.println(id_animales);
            

            boolean comprobar = DBManager_login.add_tareas(fecha,Integer.parseInt(id_cuidador) , id_animales, id_tipo_tarea);
            if (comprobar) {
                JOptionPane.showMessageDialog(null, "Añadido correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            }
        }

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboEditar_cuidador_tareasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboEditar_cuidador_tareasItemStateChanged
        // cuando cambies el iten seleccionado cambia

    }//GEN-LAST:event_jComboEditar_cuidador_tareasItemStateChanged

    private void jComboEditar_cuidador_tareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboEditar_cuidador_tareasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboEditar_cuidador_tareasActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
          // Encima
        jButton1.setBackground(new Color(153, 153, 0));
        jButton1.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
         // fuera
        jButton1.setBackground(new Color(102, 153, 0));
    }//GEN-LAST:event_jButton1MouseExited

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
//            java.util.logging.Logger.getLogger(editar_tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(editar_tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(editar_tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(editar_tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new editar_tarea().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DateTimePicker dateTimePicker1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboEditar_cuidador_tareas;
    private javax.swing.JComboBox<String> jComboEditar_tarea;
    private javax.swing.JComboBox<String> jComboeditar_animal_tarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel0;
    private javax.swing.JPanel jPanelEntradas;
    // End of variables declaration//GEN-END:variables
}
