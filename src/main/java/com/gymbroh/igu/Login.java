package com.gymbroh.igu;

import com.gymbroh.logica.Controladora;
import com.gymbroh.logica.Entrenador;

/**
 *
 * @author Gonzalo Bravo
 */
public class Login extends javax.swing.JFrame {
    Controladora control = null;
    public Login() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        cInicioDeSesion = new javax.swing.JPanel();
        InicioDeSesion = new javax.swing.JLabel();
        S1 = new javax.swing.JSeparator();
        Email = new javax.swing.JLabel();
        TextEmail = new javax.swing.JTextField();
        Contraseña = new javax.swing.JLabel();
        TextContraseña = new javax.swing.JPasswordField();
        S2 = new javax.swing.JSeparator();
        S3 = new javax.swing.JSeparator();
        NoTienesCuenta = new javax.swing.JLabel();
        IconoPequeño = new javax.swing.JLabel();
        GymBrohh = new javax.swing.JLabel();
        BotonIngresar = new javax.swing.JButton();
        BotonRegistrarse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BotonVolver = new javax.swing.JButton();
        BotonVerRutina = new javax.swing.JButton();
        imagenDeFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(897, 500));
        setMinimumSize(new java.awt.Dimension(897, 500));

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cInicioDeSesion.setBackground(new java.awt.Color(0, 0, 0,80));

        InicioDeSesion.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        InicioDeSesion.setForeground(new java.awt.Color(255, 255, 255));
        InicioDeSesion.setText("Inicio de sesión: ");

        Email.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("E-mail:");

        TextEmail.setBackground(new java.awt.Color(255, 255, 255, 128));
        TextEmail.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        TextEmail.setBorder(null);
        TextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEmailActionPerformed(evt);
            }
        });

        Contraseña.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Contraseña.setText("Contraseña:");

        TextContraseña.setBackground(new java.awt.Color(255, 255, 255, 128));
        TextContraseña.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        TextContraseña.setBorder(null);

        NoTienesCuenta.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        NoTienesCuenta.setForeground(new java.awt.Color(255, 255, 255));
        NoTienesCuenta.setText("No tienes cuenta?");

        IconoPequeño.setIcon(new javax.swing.ImageIcon("E:\\Gym_Broh\\src\\image\\logoPequeño.png")); // NOI18N

        GymBrohh.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        GymBrohh.setForeground(new java.awt.Color(255, 255, 255));
        GymBrohh.setText("Gym Brohh");

        BotonIngresar.setBackground(new java.awt.Color(255, 255, 255, 128));
        BotonIngresar.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        BotonIngresar.setText("Ingresar");
        BotonIngresar.setBorder(null);
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarActionPerformed(evt);
            }
        });

        BotonRegistrarse.setBackground(new java.awt.Color(255, 255, 255, 128));
        BotonRegistrarse.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        BotonRegistrarse.setText("Registrarse");
        BotonRegistrarse.setBorder(null);
        BotonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Eres cliente?");

        BotonVolver.setBackground(new java.awt.Color(255, 255, 255, 128));
        BotonVolver.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        BotonVolver.setText("X");
        BotonVolver.setBorder(null);
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        BotonVerRutina.setBackground(new java.awt.Color(255, 255, 255, 128));
        BotonVerRutina.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        BotonVerRutina.setText("Ve tu rutina");
        BotonVerRutina.setBorder(null);
        BotonVerRutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVerRutinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cInicioDeSesionLayout = new javax.swing.GroupLayout(cInicioDeSesion);
        cInicioDeSesion.setLayout(cInicioDeSesionLayout);
        cInicioDeSesionLayout.setHorizontalGroup(
            cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(BotonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(IconoPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GymBrohh))
                            .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(BotonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cInicioDeSesionLayout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addComponent(NoTienesCuenta)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                    .addComponent(jLabel1)
                                    .addGap(34, 34, 34))
                                .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(InicioDeSesion)
                                        .addComponent(Contraseña)
                                        .addComponent(Email)
                                        .addComponent(S1)
                                        .addComponent(TextEmail)
                                        .addComponent(TextContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                                        .addComponent(S2)
                                        .addComponent(S3)))))
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cInicioDeSesionLayout.createSequentialGroup()
                        .addContainerGap(409, Short.MAX_VALUE)
                        .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cInicioDeSesionLayout.createSequentialGroup()
                    .addContainerGap(257, Short.MAX_VALUE)
                    .addComponent(BotonVerRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(68, 68, 68)))
        );
        cInicioDeSesionLayout.setVerticalGroup(
            cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(IconoPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(GymBrohh)))
                .addGap(70, 70, 70)
                .addComponent(InicioDeSesion)
                .addGap(28, 28, 28)
                .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(Email)
                .addGap(18, 18, 18)
                .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(Contraseña)
                .addGap(18, 18, 18)
                .addComponent(TextContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(S2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(S3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoTienesCuenta)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addComponent(BotonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cInicioDeSesionLayout.createSequentialGroup()
                    .addContainerGap(728, Short.MAX_VALUE)
                    .addComponent(BotonVerRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)))
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

    private void TextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEmailActionPerformed

    private void BotonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarseActionPerformed

        Registrarse menu = new Registrarse();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BotonRegistrarseActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonVerRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVerRutinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVerRutinaActionPerformed

    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed
        String email = TextEmail.getText();
        char[] var = TextContraseña.getPassword();
        String contra = new String (var);
        control.verificarEntrenador(email, contra);
    }//GEN-LAST:event_BotonIngresarActionPerformed

    public void mostrarVentana(Entrenador entrenador){
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton BotonRegistrarse;
    private javax.swing.JButton BotonVerRutina;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel GymBrohh;
    private javax.swing.JLabel IconoPequeño;
    private javax.swing.JLabel InicioDeSesion;
    private javax.swing.JLabel NoTienesCuenta;
    private javax.swing.JSeparator S1;
    private javax.swing.JSeparator S2;
    private javax.swing.JSeparator S3;
    private javax.swing.JPasswordField TextContraseña;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel cInicioDeSesion;
    private javax.swing.JLabel imagenDeFondo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
