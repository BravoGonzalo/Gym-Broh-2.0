package com.gymbroh.igu;

/**
 *
 * @author Gonzalo Bravo
 */
public class Login extends javax.swing.JFrame {

    public Login() {
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
        TextContraseña.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        TextContraseña.setBorder(null);

        NoTienesCuenta.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        NoTienesCuenta.setForeground(new java.awt.Color(255, 255, 255));
        NoTienesCuenta.setText("No tienes cuenta?");

        IconoPequeño.setIcon(new javax.swing.ImageIcon("E:\\Gym_Broh\\src\\image\\logoPequeño.png")); // NOI18N

        GymBrohh.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        GymBrohh.setForeground(new java.awt.Color(255, 255, 255));
        GymBrohh.setText("Gym Brohh");

        BotonIngresar.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        BotonIngresar.setText("Ingresar");
        BotonIngresar.setBorder(null);

        BotonRegistrarse.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        BotonRegistrarse.setText("Registrarse");
        BotonRegistrarse.setBorder(null);

        javax.swing.GroupLayout cInicioDeSesionLayout = new javax.swing.GroupLayout(cInicioDeSesion);
        cInicioDeSesion.setLayout(cInicioDeSesionLayout);
        cInicioDeSesionLayout.setHorizontalGroup(
            cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(S3)))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(IconoPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GymBrohh))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(BotonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(NoTienesCuenta))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(BotonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        cInicioDeSesionLayout.setVerticalGroup(
            cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                .addGroup(cInicioDeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(IconoPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cInicioDeSesionLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
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
                .addComponent(NoTienesCuenta)
                .addGap(18, 18, 18)
                .addComponent(BotonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton BotonRegistrarse;
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
    // End of variables declaration//GEN-END:variables
}
