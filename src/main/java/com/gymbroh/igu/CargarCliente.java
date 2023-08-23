package com.gymbroh.igu;

import java.util.Date;

import javax.swing.JOptionPane;

import com.gymbroh.logica.Controladora;

/**
 *
 * @author Gonzalo Bravo
 */
public class CargarCliente extends javax.swing.JPanel {

    Controladora control = null;

    public CargarCliente() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        cInicioDeSesion = new javax.swing.JPanel();
        CompleteLosCampos = new javax.swing.JLabel();
        S1 = new javax.swing.JSeparator();
        S2 = new javax.swing.JSeparator();
        S3 = new javax.swing.JSeparator();
        IconoPequeño = new javax.swing.JLabel();
        BotonRegistrarse = new javax.swing.JButton();
        Nombre = new javax.swing.JLabel();
        TextNombre = new javax.swing.JTextField();
        DateNacimiento = new com.toedter.calendar.JDateChooser();
        Apellido = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        TextApellido = new javax.swing.JTextField();
        Tel = new javax.swing.JLabel();
        TextEmail = new javax.swing.JTextField();
        TextCelular = new javax.swing.JTextField();
        FechaNacimiento = new javax.swing.JLabel();
        ComboSexo = new javax.swing.JComboBox<>();
        Sexo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 710));
        setMinimumSize(new java.awt.Dimension(1000, 710));
        setPreferredSize(new java.awt.Dimension(1000, 710));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setMaximumSize(new java.awt.Dimension(1000, 710));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cInicioDeSesion.setBackground(new java.awt.Color(0, 0, 0,80));

        CompleteLosCampos.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        CompleteLosCampos.setForeground(new java.awt.Color(255, 255, 255));
        CompleteLosCampos.setText("Complete los campos:");

        IconoPequeño.setIcon(new javax.swing.ImageIcon("E:\\Gym_Broh\\src\\image\\logoPequeño.png")); // NOI18N

        BotonRegistrarse.setBackground(new java.awt.Color(255, 255, 255, 128));
        BotonRegistrarse.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        BotonRegistrarse.setText("Cargar Cliente");
        BotonRegistrarse.setBorder(null);
        BotonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarseActionPerformed(evt);
            }
        });

        Nombre.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setText("Nombre:");

        TextNombre.setBackground(new java.awt.Color(255, 255, 255, 128));
        TextNombre.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        TextNombre.setBorder(null);

        DateNacimiento.setBackground(new java.awt.Color(255, 255, 255, 128));
        DateNacimiento.setToolTipText("");

        Apellido.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        Apellido.setForeground(new java.awt.Color(255, 255, 255));
        Apellido.setText("Apellido:");

        Email.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("E-Mail:");

        TextApellido.setBackground(new java.awt.Color(255, 255, 255, 128));
        TextApellido.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        TextApellido.setBorder(null);

        Tel.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        Tel.setForeground(new java.awt.Color(255, 255, 255));
        Tel.setText("Celular:");

        TextEmail.setBackground(new java.awt.Color(255, 255, 255, 128));
        TextEmail.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        TextEmail.setBorder(null);

        TextCelular.setBackground(new java.awt.Color(255, 255, 255, 128));
        TextCelular.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        TextCelular.setBorder(null);
        TextCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCelularActionPerformed(evt);
            }
        });

        FechaNacimiento.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        FechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        FechaNacimiento.setText("Fecha de nacimiento:");

        ComboSexo.setBackground(new java.awt.Color(255, 255, 255, 128));
        ComboSexo.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        ComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Masculino", "Femenino", " " }));
        ComboSexo.setBorder(null);

        Sexo.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        Sexo.setForeground(new java.awt.Color(255, 255, 255));
        Sexo.setText("Sexo:");

        javax.swing.GroupLayout cInicioDeSesionLayout = new javax.swing.GroupLayout(cInicioDeSesion);
        cInicioDeSesion.setLayout(cInicioDeSesionLayout);
        cInicioDeSesionLayout.setHorizontalGroup(
            cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(Nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Apellido)
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cInicioDeSesionLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                                .addGap(0, 32, Short.MAX_VALUE)
                                .addComponent(FechaNacimiento))
                            .addComponent(DateNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(ComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(32, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cInicioDeSesionLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Sexo)
                                .addGap(97, 97, 97))))))
            .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(TextCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(CompleteLosCampos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cInicioDeSesionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cInicioDeSesionLayout.createSequentialGroup()
                        .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(S3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(S2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cInicioDeSesionLayout.createSequentialGroup()
                        .addComponent(IconoPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cInicioDeSesionLayout.createSequentialGroup()
                        .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cInicioDeSesionLayout.createSequentialGroup()
                        .addComponent(BotonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cInicioDeSesionLayout.createSequentialGroup()
                        .addComponent(Tel)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cInicioDeSesionLayout.createSequentialGroup()
                        .addComponent(Email)
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cInicioDeSesionLayout.createSequentialGroup()
                        .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))))
        );
        cInicioDeSesionLayout.setVerticalGroup(
            cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconoPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CompleteLosCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboSexo)
                    .addComponent(DateNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(S2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(S3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );

        bg.add(cInicioDeSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 480, 710));

        Fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gonzalo Bravo\\Pictures\\FONDO.png")); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(1000, 710));
        bg.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarseActionPerformed
        String nombre = TextNombre.getText();
        String apellido = TextApellido.getText();
        Date fecha = DateNacimiento.getDate();
        String sexo = (String) ComboSexo.getSelectedItem();
        String tel = TextCelular.getText();
        String email = TextEmail.getText();
        if (nombre.isEmpty() || apellido.isEmpty() || fecha == null || sexo.equals("*") || tel.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo/s vacio/s");
        } else {
            control.guardarCliente(nombre, apellido, fecha, sexo, tel, email);
            JOptionPane.showMessageDialog(null, "Cliente cargado con exito.");
        }
    }//GEN-LAST:event_BotonRegistrarseActionPerformed

    private void TextCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCelularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JButton BotonRegistrarse;
    private javax.swing.JComboBox<String> ComboSexo;
    private javax.swing.JLabel CompleteLosCampos;
    private com.toedter.calendar.JDateChooser DateNacimiento;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel FechaNacimiento;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel IconoPequeño;
    private javax.swing.JLabel Nombre;
    private javax.swing.JSeparator S1;
    private javax.swing.JSeparator S2;
    private javax.swing.JSeparator S3;
    private javax.swing.JLabel Sexo;
    private javax.swing.JLabel Tel;
    private javax.swing.JTextField TextApellido;
    private javax.swing.JTextField TextCelular;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel cInicioDeSesion;
    // End of variables declaration//GEN-END:variables
}
