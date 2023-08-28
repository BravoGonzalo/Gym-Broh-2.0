
package com.gymbroh.igu;

import com.gymbroh.logica.Controladora;
import com.gymbroh.logica.Ejercicio;
import com.gymbroh.logica.Rutina;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gonzalo Bravo
 */
public class VisualizarRutinas extends javax.swing.JFrame {

    private Controladora control = null;
    public VisualizarRutinas() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bgDefaultTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        PanelBotones = new javax.swing.JPanel();
        BotonCerrar = new javax.swing.JButton();
        BotonVolver1 = new javax.swing.JButton();
        IngreseSuNombre = new javax.swing.JLabel();
        TextNombre = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 800));
        setResizable(false);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgDefaultTable.setBackground(new java.awt.Color(0, 0, 0, 80));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout bgDefaultTableLayout = new javax.swing.GroupLayout(bgDefaultTable);
        bgDefaultTable.setLayout(bgDefaultTableLayout);
        bgDefaultTableLayout.setHorizontalGroup(
            bgDefaultTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        bgDefaultTableLayout.setVerticalGroup(
            bgDefaultTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgDefaultTableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(bgDefaultTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 1000, 710));

        PanelBotones.setBackground(new java.awt.Color(0, 0, 0,80));

        BotonCerrar.setBackground(new java.awt.Color(255, 255, 255, 128));
        BotonCerrar.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        BotonCerrar.setText("X");
        BotonCerrar.setBorder(null);
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });

        BotonVolver1.setBackground(new java.awt.Color(255, 255, 255, 128));
        BotonVolver1.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        BotonVolver1.setText("<");
        BotonVolver1.setBorder(null);
        BotonVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolver1ActionPerformed(evt);
            }
        });

        IngreseSuNombre.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        IngreseSuNombre.setText("Ingrese su nombre:");

        TextNombre.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        TextNombre.setBorder(null);

        BotonBuscar.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        BotonBuscar.setText("Buscar");
        BotonBuscar.setBorder(null);
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(PanelBotones);
        PanelBotones.setLayout(PanelBotonesLayout);
        PanelBotonesLayout.setHorizontalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IngreseSuNombre)
                .addGap(18, 18, 18)
                .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                .addComponent(BotonVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelBotonesLayout.setVerticalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBotonesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelBotonesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(IngreseSuNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextNombre))
                .addGap(8, 8, 8))
        );

        bg.add(PanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 80));

        Fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gonzalo Bravo\\Pictures\\fondo (1).jpg")); // NOI18N
        bg.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

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
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonCerrarActionPerformed

    private void BotonVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolver1ActionPerformed
        Login menu = new Login();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_BotonVolver1ActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        String nombre = TextNombre.getText();
        if(!nombre.isEmpty()){
            List<Rutina> rutinaCliente = control.traerRutinaPorNombre(nombre);
            if(rutinaCliente != null){
                cargarTabla(rutinaCliente);
            }else{
                JOptionPane.showMessageDialog(null, "No se encontró rutina de " + nombre);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del cliente para buscar su rutina.");
        }
    }//GEN-LAST:event_BotonBuscarActionPerformed

    public void cargarTabla(List<Rutina> rutinas) {
        DefaultTableModel tabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String titulos[] = {"Dia", "Ejercicio", "Series", "Repeticiones"};
        tabla.setColumnIdentifiers(titulos);

        List<Rutina> rutina = control.traerRutina();

        if (rutina != null) {
            for (Rutina ver : rutinas) {
                String dia = ver.getDia();
                List<Ejercicio> ejercicio = ver.getRutina();
                for (Ejercicio ejercicios : ejercicio) {
                    String nomEjercicio = ejercicios.getNomEjercicio();
                    int series = ejercicios.getSeries();
                    int reps = ejercicios.getRepeticiones();

                    Object[] objeto = {dia, nomEjercicio, series, reps};
                    tabla.addRow(objeto);
                }
            }
        }

        Tabla.setModel(tabla);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton BotonVolver1;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel IngreseSuNombre;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JPanel bg;
    public static javax.swing.JPanel bgDefaultTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
