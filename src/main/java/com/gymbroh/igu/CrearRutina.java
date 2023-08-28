package com.gymbroh.igu;

import com.gymbroh.logica.Cliente;
import com.gymbroh.logica.Controladora;
import com.gymbroh.logica.Ejercicio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalo Bravo
 */
public class CrearRutina extends javax.swing.JFrame {

    private Controladora control = null;
    private Cliente cliente;
    private int id;
    private List<Ejercicio> rutina;

    public CrearRutina(int id) {
        rutina = new ArrayList();
        this.id = id;
        control = new Controladora();
        initComponents();
        editarCliente(id);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        bg = new javax.swing.JPanel();
        cCargarRutina = new javax.swing.JPanel();
        CompleteLosCamposParaEditar = new javax.swing.JLabel();
        S1 = new javax.swing.JSeparator();
        IconoPequeño = new javax.swing.JLabel();
        GymBrohh = new javax.swing.JLabel();
        BotonVolver = new javax.swing.JButton();
        Dia = new javax.swing.JLabel();
        TextDia = new javax.swing.JTextField();
        Ejercicio = new javax.swing.JLabel();
        TextEjercicio = new javax.swing.JTextField();
        Repeticiones = new javax.swing.JLabel();
        Series = new javax.swing.JLabel();
        ComboRepes = new javax.swing.JComboBox<>();
        ComboSeries = new javax.swing.JComboBox<>();
        BotonEjercicio = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        BotonRutina = new javax.swing.JButton();
        imagenDeFondo = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(897, 500));

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cCargarRutina.setBackground(new java.awt.Color(0, 0, 0,80));

        CompleteLosCamposParaEditar.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        CompleteLosCamposParaEditar.setForeground(new java.awt.Color(255, 255, 255));
        CompleteLosCamposParaEditar.setText("Crear rutina:");

        IconoPequeño.setIcon(new javax.swing.ImageIcon("E:\\Gym_Broh\\src\\image\\logoPequeño.png")); // NOI18N

        GymBrohh.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        GymBrohh.setForeground(new java.awt.Color(255, 255, 255));
        GymBrohh.setText("Gym Brohh");

        BotonVolver.setBackground(new java.awt.Color(255, 255, 255, 128));
        BotonVolver.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        BotonVolver.setText("<");
        BotonVolver.setBorder(null);
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        Dia.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        Dia.setForeground(new java.awt.Color(255, 255, 255));
        Dia.setText("Dia de la rutina:");

        TextDia.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        TextDia.setForeground(new java.awt.Color(0, 0, 0));
        TextDia.setBorder(null);

        Ejercicio.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        Ejercicio.setForeground(new java.awt.Color(255, 255, 255));
        Ejercicio.setText("Ejercicio:");

        TextEjercicio.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        TextEjercicio.setForeground(new java.awt.Color(0, 0, 0));
        TextEjercicio.setBorder(null);

        Repeticiones.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        Repeticiones.setForeground(new java.awt.Color(255, 255, 255));
        Repeticiones.setText("Repeticiones:");

        Series.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        Series.setForeground(new java.awt.Color(255, 255, 255));
        Series.setText("Series:");

        ComboRepes.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        ComboRepes.setForeground(new java.awt.Color(0, 0, 0));
        ComboRepes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "4", "6", "8", "10", "12", "15", "Al fallo" }));
        ComboRepes.setBorder(null);

        ComboSeries.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        ComboSeries.setForeground(new java.awt.Color(0, 0, 0));
        ComboSeries.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "2", "3", "4", "5" }));
        ComboSeries.setBorder(null);

        BotonEjercicio.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        BotonEjercicio.setForeground(new java.awt.Color(255, 255, 255));
        BotonEjercicio.setText("Agregar Ejercicio");
        BotonEjercicio.setBorder(null);
        BotonEjercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEjercicioActionPerformed(evt);
            }
        });

        BotonRutina.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        BotonRutina.setForeground(new java.awt.Color(255, 255, 255));
        BotonRutina.setText("Guardar Rutina");
        BotonRutina.setBorder(null);
        BotonRutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRutinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cCargarRutinaLayout = new javax.swing.GroupLayout(cCargarRutina);
        cCargarRutina.setLayout(cCargarRutinaLayout);
        cCargarRutinaLayout.setHorizontalGroup(
            cCargarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cCargarRutinaLayout.createSequentialGroup()
                .addGroup(cCargarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cCargarRutinaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(cCargarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cCargarRutinaLayout.createSequentialGroup()
                                .addComponent(IconoPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GymBrohh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cCargarRutinaLayout.createSequentialGroup()
                                .addGroup(cCargarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CompleteLosCamposParaEditar)
                                    .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 15, Short.MAX_VALUE))))
                    .addGroup(cCargarRutinaLayout.createSequentialGroup()
                        .addGroup(cCargarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cCargarRutinaLayout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addGroup(cCargarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(cCargarRutinaLayout.createSequentialGroup()
                                        .addComponent(Repeticiones)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                        .addComponent(Series)
                                        .addGap(16, 16, 16))
                                    .addGroup(cCargarRutinaLayout.createSequentialGroup()
                                        .addComponent(ComboRepes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ComboSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(cCargarRutinaLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(TextEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cCargarRutinaLayout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addComponent(Ejercicio))
                            .addGroup(cCargarRutinaLayout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(BotonEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cCargarRutinaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cCargarRutinaLayout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(Dia))
                            .addGroup(cCargarRutinaLayout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(TextDia, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(cCargarRutinaLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(BotonRutina)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cCargarRutinaLayout.setVerticalGroup(
            cCargarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cCargarRutinaLayout.createSequentialGroup()
                .addGroup(cCargarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cCargarRutinaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(IconoPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cCargarRutinaLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(GymBrohh))
                    .addGroup(cCargarRutinaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CompleteLosCamposParaEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(Ejercicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(cCargarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Series)
                    .addComponent(Repeticiones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cCargarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboRepes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(BotonEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(BotonRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        bg.add(cCargarRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 570, 830));

        imagenDeFondo.setIcon(new javax.swing.ImageIcon("E:\\Gym_Broh\\src\\image\\todojunto2.png")); // NOI18N
        bg.add(imagenDeFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 830));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonEjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEjercicioActionPerformed
        String ejercicio = TextEjercicio.getText();
        int reps = Integer.parseInt(ComboRepes.getSelectedItem().toString());
        int series = Integer.parseInt(ComboSeries.getSelectedItem().toString());
        rutina.add(control.guardarEjercicio(ejercicio, reps, series));

        TextEjercicio.setText("");
        ComboRepes.setSelectedIndex(0);
        ComboSeries.setSelectedIndex(0);
    }//GEN-LAST:event_BotonEjercicioActionPerformed

    private void BotonRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRutinaActionPerformed
        String dia = TextDia.getText();
        control.guardarRutina(cliente, rutina, dia);
    }//GEN-LAST:event_BotonRutinaActionPerformed

    private void editarCliente(int id) {
        this.cliente = control.traerCliente(id);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEjercicio;
    private javax.swing.JButton BotonRutina;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JComboBox<String> ComboRepes;
    private javax.swing.JComboBox<String> ComboSeries;
    private javax.swing.JLabel CompleteLosCamposParaEditar;
    private javax.swing.JLabel Dia;
    private javax.swing.JLabel Ejercicio;
    private javax.swing.JLabel GymBrohh;
    private javax.swing.JLabel IconoPequeño;
    private javax.swing.JLabel Repeticiones;
    private javax.swing.JSeparator S1;
    private javax.swing.JLabel Series;
    private javax.swing.JTextField TextDia;
    private javax.swing.JTextField TextEjercicio;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel cCargarRutina;
    private javax.swing.JLabel imagenDeFondo;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
