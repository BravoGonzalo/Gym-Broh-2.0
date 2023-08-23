package com.gymbroh.igu;

import com.gymbroh.logica.Controladora;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalo Bravo
 */
public class Registrarse extends javax.swing.JFrame {

    Controladora control = null;

    public Registrarse() {
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
        GymBrohh = new javax.swing.JLabel();
        BotonRegistrarse = new javax.swing.JButton();
        Nombre = new javax.swing.JLabel();
        TextNombre = new javax.swing.JTextField();
        DateNacimiento = new com.toedter.calendar.JDateChooser();
        Apellido = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        TextApellido = new javax.swing.JTextField();
        Tel = new javax.swing.JLabel();
        TextEmail = new javax.swing.JTextField();
        Contraseña = new javax.swing.JLabel();
        TextCelular = new javax.swing.JTextField();
        RepitaLaContraseña = new javax.swing.JLabel();
        FechaNacimiento = new javax.swing.JLabel();
        ComboSexo = new javax.swing.JComboBox<>();
        Sexo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BotonIniciarSesion = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();
        TextContraseña2 = new javax.swing.JPasswordField();
        TextContraseña = new javax.swing.JPasswordField();
        imagenDeFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(897, 500));

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cInicioDeSesion.setBackground(new java.awt.Color(0, 0, 0,80));

        CompleteLosCampos.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        CompleteLosCampos.setForeground(new java.awt.Color(255, 255, 255));
        CompleteLosCampos.setText("Complete los campos:");

        IconoPequeño.setIcon(new javax.swing.ImageIcon("E:\\Gym_Broh\\src\\image\\logoPequeño.png")); // NOI18N

        GymBrohh.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        GymBrohh.setForeground(new java.awt.Color(255, 255, 255));
        GymBrohh.setText("Gym Brohh");

        BotonRegistrarse.setBackground(new java.awt.Color(255, 255, 255, 128));
        BotonRegistrarse.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        BotonRegistrarse.setText("Registrarse");
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

        Contraseña.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Contraseña.setText("Contraseña:");

        TextCelular.setBackground(new java.awt.Color(255, 255, 255, 128));
        TextCelular.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        TextCelular.setBorder(null);
        TextCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCelularActionPerformed(evt);
            }
        });

        RepitaLaContraseña.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        RepitaLaContraseña.setForeground(new java.awt.Color(255, 255, 255));
        RepitaLaContraseña.setText("Repita la contraseña:");

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

        jLabel1.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ya tienes cuenta?");

        BotonIniciarSesion.setBackground(new java.awt.Color(255, 255, 255, 128));
        BotonIniciarSesion.setText("Inicia sesión");
        BotonIniciarSesion.setBorder(null);
        BotonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarSesionActionPerformed(evt);
            }
        });

        BotonVolver.setBackground(new java.awt.Color(255, 255, 255, 128));
        BotonVolver.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        BotonVolver.setText("<");
        BotonVolver.setBorder(null);
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        TextContraseña2.setBackground(new java.awt.Color(255, 255, 255, 128));
        TextContraseña2.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        TextContraseña2.setBorder(null);

        TextContraseña.setBackground(new java.awt.Color(255, 255, 255, 128));
        TextContraseña.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        TextContraseña.setBorder(null);

        javax.swing.GroupLayout cInicioDeSesionLayout = new javax.swing.GroupLayout(cInicioDeSesion);
        cInicioDeSesion.setLayout(cInicioDeSesionLayout);
        cInicioDeSesionLayout.setHorizontalGroup(
            cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DateNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(TextNombre))
                        .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(ComboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addComponent(FechaNacimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sexo)
                        .addGap(61, 61, 61)))
                .addGap(70, 70, 70))
            .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(IconoPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GymBrohh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CompleteLosCampos))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(Nombre)
                        .addGap(151, 151, 151)
                        .addComponent(Apellido))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(Tel))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(Contraseña))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(S2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(BotonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(S3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(BotonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextContraseña2)
                            .addComponent(TextCelular)
                            .addComponent(TextContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(RepitaLaContraseña))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(Email))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cInicioDeSesionLayout.setVerticalGroup(
            cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(IconoPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(GymBrohh))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CompleteLosCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(DateNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RepitaLaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextContraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(S2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(S3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        bg.add(cInicioDeSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 460, 830));

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

    private void TextCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCelularActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        Login menu = new Login();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarSesionActionPerformed
        Login menu = new Login();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BotonIniciarSesionActionPerformed

    private void BotonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarseActionPerformed
        String nombre = TextNombre.getText();
        String apellido = TextApellido.getText();
        Date fecha = DateNacimiento.getDate();
        String sexo = (String) ComboSexo.getSelectedItem();
        String tel = TextCelular.getText();
        char[] var = TextContraseña.getPassword();
        char[] var1 = TextContraseña2.getPassword();
        String contra = new String(var);
        String contra2 = new String(var1);
        String email = TextEmail.getText();
        if (nombre.isEmpty() || apellido.isEmpty() || fecha == null || sexo.equals("*") || tel.isEmpty() || contra.isEmpty() || contra2.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo/s vacio/s");
        }else{
            if (contra.equals(contra2)) {
                control.guardarEntrenador(nombre, apellido, fecha, sexo, tel, contra, email);
                Login menu = new Login();
                menu.setVisible(true);
                menu.setLocationRelativeTo(null);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
            }
        }
    }//GEN-LAST:event_BotonRegistrarseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JButton BotonIniciarSesion;
    private javax.swing.JButton BotonRegistrarse;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JComboBox<String> ComboSexo;
    private javax.swing.JLabel CompleteLosCampos;
    private javax.swing.JLabel Contraseña;
    private com.toedter.calendar.JDateChooser DateNacimiento;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel FechaNacimiento;
    private javax.swing.JLabel GymBrohh;
    private javax.swing.JLabel IconoPequeño;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel RepitaLaContraseña;
    private javax.swing.JSeparator S1;
    private javax.swing.JSeparator S2;
    private javax.swing.JSeparator S3;
    private javax.swing.JLabel Sexo;
    private javax.swing.JLabel Tel;
    private javax.swing.JTextField TextApellido;
    private javax.swing.JTextField TextCelular;
    private javax.swing.JPasswordField TextContraseña;
    private javax.swing.JPasswordField TextContraseña2;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel cInicioDeSesion;
    private javax.swing.JLabel imagenDeFondo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
