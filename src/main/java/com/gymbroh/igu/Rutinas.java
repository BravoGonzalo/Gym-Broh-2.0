package com.gymbroh.igu;

import com.gymbroh.logica.Cliente;
import com.gymbroh.logica.Controladora;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gonzalo Bravo
 */
public class Rutinas extends javax.swing.JPanel {

    private Controladora control = null;

    public Rutinas() {
        control = new Controladora();
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        cRutinas = new javax.swing.JPanel();
        IconoPequeño = new javax.swing.JLabel();
        S1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        BotonCrear = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 710));
        setMinimumSize(new java.awt.Dimension(1000, 710));
        setPreferredSize(new java.awt.Dimension(1000, 710));

        bg.setMaximumSize(new java.awt.Dimension(1000, 710));
        bg.setMinimumSize(new java.awt.Dimension(1000, 710));

        cRutinas.setBackground(new java.awt.Color(0, 0, 0,80));
        cRutinas.setMaximumSize(new java.awt.Dimension(1000, 710));
        cRutinas.setMinimumSize(new java.awt.Dimension(1000, 710));

        IconoPequeño.setIcon(new javax.swing.ImageIcon("E:\\Gym_Broh\\src\\image\\logoPequeño.png")); // NOI18N

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

        BotonCrear.setBackground(new java.awt.Color(255, 255, 255, 128));
        BotonCrear.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        BotonCrear.setForeground(new java.awt.Color(255, 255, 255));
        BotonCrear.setText("Crear");
        BotonCrear.setBorder(null);
        BotonCrear.setRolloverEnabled(false);
        BotonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearActionPerformed(evt);
            }
        });

        BotonEliminar.setBackground(new java.awt.Color(255, 255, 255, 128));
        BotonEliminar.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        BotonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminar.setText("Eliminar");
        BotonEliminar.setBorder(null);
        BotonEliminar.setRolloverEnabled(false);
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cRutinasLayout = new javax.swing.GroupLayout(cRutinas);
        cRutinas.setLayout(cRutinasLayout);
        cRutinasLayout.setHorizontalGroup(
            cRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cRutinasLayout.createSequentialGroup()
                .addGroup(cRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cRutinasLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cRutinasLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(BotonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(IconoPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cRutinasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        cRutinasLayout.setVerticalGroup(
            cRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cRutinasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cRutinasLayout.createSequentialGroup()
                        .addComponent(IconoPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(BotonCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        Fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gonzalo Bravo\\Pictures\\FONDO.png")); // NOI18N
        Fondo.setMaximumSize(new java.awt.Dimension(1000, 710));
        Fondo.setMinimumSize(new java.awt.Dimension(1000, 710));
        Fondo.setPreferredSize(new java.awt.Dimension(1000, 710));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cRutinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cRutinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearActionPerformed
        if (Tabla.getRowCount() > 0) {
            if (Tabla.getSelectedRow() != -1) {
                int id = Integer.parseInt(String.valueOf(Tabla.getValueAt(Tabla.getSelectedRow(), 0)));

                CrearRutina menu = new CrearRutina(id);
                menu.setVisible(true);
                menu.setLocationRelativeTo(null);
                this.disable();
            } else {
                mostrarMensaje("No ha seleccionado ningun cliente", "Error", "error al eliminar");
            }
        } else {
            mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "error al eliminar");
        }
    }//GEN-LAST:event_BotonCrearActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        if (Tabla.getRowCount() > 0) {
            if (Tabla.getSelectedRow() != -1) {
                int id = Integer.parseInt(String.valueOf(Tabla.getValueAt(Tabla.getSelectedRow(), 0)));
                control.eliminarCliente(id);
                
                cargarTabla();
                mostrarMensaje("Cliente eliminado con exito.", "Info", "borrado de cliente");
            } else {
                mostrarMensaje("No ha seleccionado ningun cliente", "Error", "error al eliminar");
            }
        } else {
            mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "error al eliminar");
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane mensajes = new JOptionPane(mensaje);
        if (tipo.equals("info")) {
            mensajes.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            mensajes.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = mensajes.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCrear;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel IconoPequeño;
    private javax.swing.JSeparator S1;
    private javax.swing.JTable Tabla;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel cRutinas;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
        DefaultTableModel tabla = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"ID", "Nombre", "Apellido", "Sexo", "Email", "Num.Celular"};
        tabla.setColumnIdentifiers(titulos);

        List<Cliente> listaClientes = control.traerClientes();

        if (listaClientes != null) {
            for (Cliente cliente : listaClientes) {
                Object[] objeto = {cliente.getId(), cliente.getNombre(), cliente.getApellido(), cliente.getSexo(), cliente.getEmail(), cliente.getTel()};
                tabla.addRow(objeto);
            }
        }

        Tabla.setModel(tabla);
    }
}
