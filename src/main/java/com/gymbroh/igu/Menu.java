package com.gymbroh.igu;

import java.awt.BorderLayout;

/**
 *
 * @author Gonzalo Bravo
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bgDefaultTable = new javax.swing.JPanel();
        PanelBotones = new javax.swing.JPanel();
        BotonRegistrarCliente = new javax.swing.JButton();
        BotonVisualizarClientes = new javax.swing.JButton();
        BotonRutinas = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setMaximumSize(new java.awt.Dimension(1200, 800));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgDefaultTable.setBackground(new java.awt.Color(0, 0, 0, 80));

        javax.swing.GroupLayout bgDefaultTableLayout = new javax.swing.GroupLayout(bgDefaultTable);
        bgDefaultTable.setLayout(bgDefaultTableLayout);
        bgDefaultTableLayout.setHorizontalGroup(
            bgDefaultTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        bgDefaultTableLayout.setVerticalGroup(
            bgDefaultTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        bg.add(bgDefaultTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 1000, 710));

        PanelBotones.setBackground(new java.awt.Color(0, 0, 0,80));

        BotonRegistrarCliente.setBackground(new java.awt.Color(255, 255, 255, 128));
        BotonRegistrarCliente.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        BotonRegistrarCliente.setText("Registrar Cliente");
        BotonRegistrarCliente.setBorder(null);
        BotonRegistrarCliente.setMaximumSize(new java.awt.Dimension(72, 23));
        BotonRegistrarCliente.setMinimumSize(new java.awt.Dimension(72, 23));
        BotonRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarClienteActionPerformed(evt);
            }
        });

        BotonVisualizarClientes.setBackground(new java.awt.Color(255, 255, 255, 128));
        BotonVisualizarClientes.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        BotonVisualizarClientes.setText("Visualizar Clientes");
        BotonVisualizarClientes.setBorder(null);
        BotonVisualizarClientes.setMaximumSize(new java.awt.Dimension(72, 23));
        BotonVisualizarClientes.setMinimumSize(new java.awt.Dimension(72, 23));
        BotonVisualizarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVisualizarClientesActionPerformed(evt);
            }
        });

        BotonRutinas.setBackground(new java.awt.Color(255, 255, 255, 128));
        BotonRutinas.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        BotonRutinas.setText("Rutinas");
        BotonRutinas.setBorder(null);

        javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(PanelBotones);
        PanelBotones.setLayout(PanelBotonesLayout);
        PanelBotonesLayout.setHorizontalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(BotonRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(BotonVisualizarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(BotonRutinas, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );
        PanelBotonesLayout.setVerticalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonRegistrarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonVisualizarClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(BotonRutinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarClienteActionPerformed
        CargarCliente r = new CargarCliente();
        r.setSize(1000, 710);
        r.setLocation(0, 0);
        
        bgDefaultTable.removeAll();
        bgDefaultTable.add(r, BorderLayout.CENTER);
        bgDefaultTable.revalidate();
        bgDefaultTable.repaint();
    }//GEN-LAST:event_BotonRegistrarClienteActionPerformed

    private void BotonVisualizarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVisualizarClientesActionPerformed
        VisualizarClientes r = new VisualizarClientes();
        r.setSize(1000, 710);
        r.setLocation(0, 0);
        
        bgDefaultTable.removeAll();
        bgDefaultTable.add(r, BorderLayout.CENTER);
        bgDefaultTable.revalidate();
        bgDefaultTable.repaint();
    }//GEN-LAST:event_BotonVisualizarClientesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        VisualizarClientes r = new VisualizarClientes();
        r.cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegistrarCliente;
    private javax.swing.JButton BotonRutinas;
    private javax.swing.JButton BotonVisualizarClientes;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel bg;
    public static javax.swing.JPanel bgDefaultTable;
    // End of variables declaration//GEN-END:variables
}
