/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login_sql;

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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nuria
 */
public class add_tareas extends javax.swing.JFrame {

    /**
     * Creates new form add_tareas
     */
    public add_tareas() {
        initComponents();
        Listarpersonas();
        ListarEspecies();
        Listar_tareas();
        rellenar_tabla_tareas();
    }

    public void ListarEspecies() {

        String consulta_sql = " SELECT * FROM animales";

        ResultSet resultado = DBManager_login.obtener_tablas(DEFAULT_CURSOR, DISPOSE_ON_CLOSE, consulta_sql);
        // guardas en resultado en esta variable y el default te pone por defecto un 0
        try {
            while (resultado.next()) {
                String nombre_especie = resultado.getString("nombre");
                jComboAnimales_tareas.addItem(nombre_especie);
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

    public void Listar_tareas() {

        String consulta_sql = " SELECT * FROM cuidados";

        ResultSet resultado = DBManager_login.obtener_tablas(DEFAULT_CURSOR, DISPOSE_ON_CLOSE, consulta_sql);
        // guardas en resultado en esta variable y el default te pone por defecto un 0
        try {
            while (resultado.next()) {
                String nombre_tarea = resultado.getString("nombre_tarea");
                jComboTarea_tarea.addItem(nombre_tarea);
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

    public void ListarEspecialidad() {

        String consulta_sql = " SELECT * FROM especialidad";

        ResultSet resultado = DBManager_login.obtener_tablas(DEFAULT_CURSOR, DISPOSE_ON_CLOSE, consulta_sql);
        // guardas en resultado en esta variable y el default te pone por defecto un 0
        try {
            while (resultado.next()) {
                String nombre_especie = resultado.getString("nombre");
                jCombocuidador_tareas.addItem(nombre_especie);
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
    
  
    //______________________________________________________________________________________________________
    // rellenar tabla animales

    public void rellenar_tabla_tareas() {
        String sql = "Select * from ani_cui_per";
        try {
            ResultSet resultado = DBManager_login.obtener_tablas(DEFAULT_CURSOR, DISPOSE_ON_CLOSE, sql);
            while (resultado.next()) {
                String fecha = resultado.getString("fecha");
                int tarea = resultado.getInt("tarea");
                String nombre_tarea = DBManager_login.obtener_tarea_porId(tarea);
                int animal = resultado.getInt("animales");
                String nombre_animal = DBManager_login.obtener_animal_porId(animal);
                int personas = resultado.getInt("personas");
                String nombre_persona = DBManager_login.obtener_persona_porId(personas);
                String contacto = DBManager_login.obtener_telefono_id(personas);

                DefaultTableModel model = (DefaultTableModel) jTablemodicarTareas.getModel();
                Object[] row = {nombre_persona,contacto, nombre_tarea, nombre_animal, fecha};
                model.addRow(row);
            }
            resultado.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    //_____________________________________________________________________________________________________________
    // Vaciar tabla animales para no duplicar datos 
    public void vaciar_tablas() {

        //vaciamos la tabla recorriendola con un bucle for
        DefaultTableModel tb = (DefaultTableModel) jTablemodicarTareas.getModel();
        int a = jTablemodicarTareas.getRowCount() - 1; //contamos las filas
        //bucle para borrar todas las filas
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
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
                jCombocuidador_tareas.addItem(contacto + " - " + nombre);

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jframe_listar_tareas = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablemodicarTareas = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel0 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelEntradas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboAnimales_tareas = new javax.swing.JComboBox<>();
        jComboTarea_tarea = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCombocuidador_tareas = new javax.swing.JComboBox<>();
        dateTimePicker1 = new com.github.lgooddatepicker.components.DateTimePicker();
        jButtonListar_Animales = new javax.swing.JButton();

        jframe_listar_tareas.setLocation(new java.awt.Point(480, 300));
        jframe_listar_tareas.setMinimumSize(new java.awt.Dimension(606, 420));
        jframe_listar_tareas.setResizable(false);
        jframe_listar_tareas.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                jframe_listar_tareasWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        jframe_listar_tareas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Listar Tareas");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N

        jTablemodicarTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Persona", "Contacto", "Tarea", "Animal", "Fecha"
            }
        ));
        jTablemodicarTareas.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jTablemodicarTareas);

        jButton2.setText("Modificar");
        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
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

        jButton3.setText("Borrar");
        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton2, jButton3});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton2, jButton3});

        jframe_listar_tareas.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 680, 360));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenes/Los-10-arboles-mas-grandes-del-mundo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jPanelEntradas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Añadir Tareas");
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

        jComboAnimales_tareas.setFont(new java.awt.Font("Roboto Slab Light", 0, 18)); // NOI18N

        jComboTarea_tarea.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

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

        jCombocuidador_tareas.setFont(new java.awt.Font("Roboto Slab Light", 0, 24)); // NOI18N
        jCombocuidador_tareas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCombocuidador_tareasItemStateChanged(evt);
            }
        });
        jCombocuidador_tareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombocuidador_tareasActionPerformed(evt);
            }
        });

        jButtonListar_Animales.setText("Listar Tareas");
        jButtonListar_Animales.setBackground(new java.awt.Color(102, 153, 0));
        jButtonListar_Animales.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonListar_Animales.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jButtonListar_Animales.setForeground(new java.awt.Color(51, 51, 51));
        jButtonListar_Animales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonListar_AnimalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonListar_AnimalesMouseExited(evt);
            }
        });
        jButtonListar_Animales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListar_AnimalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEntradasLayout = new javax.swing.GroupLayout(jPanelEntradas);
        jPanelEntradas.setLayout(jPanelEntradasLayout);
        jPanelEntradasLayout.setHorizontalGroup(
            jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEntradasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEntradasLayout.createSequentialGroup()
                        .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelEntradasLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEntradasLayout.createSequentialGroup()
                                .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelEntradasLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCombocuidador_tareas, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateTimePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelEntradasLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jButtonListar_Animales, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(94, Short.MAX_VALUE))
                    .addGroup(jPanelEntradasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboTarea_tarea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboAnimales_tareas, 0, 168, Short.MAX_VALUE))
                        .addContainerGap(96, Short.MAX_VALUE))))
        );

        jPanelEntradasLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dateTimePicker1, jComboAnimales_tareas, jComboTarea_tarea, jCombocuidador_tareas});

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
                    .addComponent(jComboAnimales_tareas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboTarea_tarea))
                .addGap(22, 22, 22)
                .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCombocuidador_tareas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateTimePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(54, 54, 54)
                .addGroup(jPanelEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jButtonListar_Animales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanelEntradasLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dateTimePicker1, jComboAnimales_tareas, jComboTarea_tarea, jCombocuidador_tareas});

        javax.swing.GroupLayout jPanel0Layout = new javax.swing.GroupLayout(jPanel0);
        jPanel0.setLayout(jPanel0Layout);
        jPanel0Layout.setHorizontalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel0Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        String animal = jComboAnimales_tareas.getSelectedItem().toString();
        int id_animales = DBManager_login.obtener_animal_porNombre(animal);
        String tarea = jComboTarea_tarea.getSelectedItem().toString();
        int id_tipo_tarea = DBManager_login.obtener_trabajo_porNombre(tarea);
        String cuidador = jCombocuidador_tareas.getSelectedItem().toString();
        String contacto = cuidador.substring(0, 9);
        System.out.println(contacto);
        String id_cuidador = DBManager_login.obtener_cuidador_porTelefono((contacto));
        System.out.println(id_cuidador);
        String fecha_dia = dateTimePicker1.getDatePicker().toString();
        String fecha_hora = dateTimePicker1.getTimePicker().toString();
        String fecha = fecha_dia + " " + fecha_hora;

        // insertar animales
        if (jComboAnimales_tareas.getSelectedItem().equals(null) || jComboTarea_tarea.getSelectedItem().equals(null) || jCombocuidador_tareas.getSelectedItem().equals(null) || dateTimePicker1.getTimePicker().toString().equals("") || dateTimePicker1.getDatePicker().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios.");

        } else {

            boolean comprobar = DBManager_login.add_tareas(fecha, Integer.parseInt(id_cuidador), id_animales, id_tipo_tarea);
            if (comprobar) {
                JOptionPane.showMessageDialog(null, "Añadido correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            }
        }

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCombocuidador_tareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombocuidador_tareasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombocuidador_tareasActionPerformed

    private void jCombocuidador_tareasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCombocuidador_tareasItemStateChanged
        // cuando cambies el iten seleccionado cambia

    }//GEN-LAST:event_jCombocuidador_tareasItemStateChanged

    private void jButtonListar_AnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListar_AnimalesActionPerformed
        // listar animales
        rellenar_tabla_tareas();
        jframe_listar_tareas.setVisible(true);

    }//GEN-LAST:event_jButtonListar_AnimalesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // editar tarea BOTON MODIFICAR
        int fila = jTablemodicarTareas.getSelectedRow();// coge la fila que has selecionado
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha selecionado ninguna fila");

        } else {

            String persona = (String) jTablemodicarTareas.getValueAt(fila, 0);
            String contacto= (String) jTablemodicarTareas.getValueAt(fila, 1);
            String tarea = (String) jTablemodicarTareas.getValueAt(fila, 2);
            String animal = (String) jTablemodicarTareas.getValueAt(fila, 3);
            String fecha = (String) jTablemodicarTareas.getValueAt(fila, 4);
            editores.editar_tarea open = new editores.editar_tarea(persona,contacto, tarea, animal, fecha);
            open.setVisible(true);
            // actualizar tabla
            vaciar_tablas();
            rellenar_tabla_tareas();

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // BOTON BORRAR ANIMAL DE LA LISTA
        int fila = jTablemodicarTareas.getSelectedRow();// coge la fila que has selecionado
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha selecionado ninguna fila");

        } else {
            int id = (int) jTablemodicarTareas.getValueAt(fila, 0);
            DBManager_login.borrar_animal(id);

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jframe_listar_tareasWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jframe_listar_tareasWindowGainedFocus
        // actualizar tabla
        vaciar_tablas();
        rellenar_tabla_tareas();

    }//GEN-LAST:event_jframe_listar_tareasWindowGainedFocus

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
         // Encima
        jButton2.setBackground(new Color(255,148,14));
        jButton2.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
          // fuera
        jButton2.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
         // encima
         jButton3.setBackground(new Color(233,71,68));
         jButton3.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
       // fuera
        jButton3.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButtonListar_AnimalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonListar_AnimalesMouseEntered
          // Encima
        jButtonListar_Animales.setBackground(new Color(153, 153, 0));
         jButtonListar_Animales.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_jButtonListar_AnimalesMouseEntered

    private void jButtonListar_AnimalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonListar_AnimalesMouseExited
         // fuera
        jButtonListar_Animales.setBackground(new Color(102, 153, 0));
    }//GEN-LAST:event_jButtonListar_AnimalesMouseExited

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
//            java.util.logging.Logger.getLogger(add_tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(add_tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(add_tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(add_tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new add_tareas().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DateTimePicker dateTimePicker1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonListar_Animales;
    private javax.swing.JComboBox<String> jComboAnimales_tareas;
    private javax.swing.JComboBox<String> jComboTarea_tarea;
    private javax.swing.JComboBox<String> jCombocuidador_tareas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel0;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelEntradas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablemodicarTareas;
    private javax.swing.JFrame jframe_listar_tareas;
    // End of variables declaration//GEN-END:variables
}
