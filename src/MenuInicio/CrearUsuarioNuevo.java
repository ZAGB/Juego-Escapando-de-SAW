/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MenuInicio;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author zujeily
 */
public class CrearUsuarioNuevo extends javax.swing.JFrame {
Fondo fondoSaw=new Fondo();
    /**
     * Creates new form CrearUsuarioNuevo
     */
    public CrearUsuarioNuevo() {
        this.setContentPane(fondoSaw);
        this.setLocationRelativeTo(null);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IconoSawRegistro = new javax.swing.JLabel();
        TituloSawRegistro = new javax.swing.JLabel();
        NombreRegistro1 = new javax.swing.JLabel();
        CedulaRegistro2 = new javax.swing.JLabel();
        CorreoRegistro3 = new javax.swing.JLabel();
        ContraseñaRegistro4 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        CedulaTextField1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        CorreoTextField2 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        RegistrarButonCUN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ButonregresarCUN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IconoSawRegistro.setIcon(new javax.swing.ImageIcon("/home/zujeily/Downloads/Cliente Servidor/personajes historia y proyecto Escape Saw info /sawlogosmallLU.png")); // NOI18N

        TituloSawRegistro.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        TituloSawRegistro.setForeground(new java.awt.Color(255, 0, 0));
        TituloSawRegistro.setText("Registro Usuario Nuevo");

        NombreRegistro1.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        NombreRegistro1.setForeground(new java.awt.Color(255, 0, 0));
        NombreRegistro1.setText("Nombre Completo ");

        CedulaRegistro2.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        CedulaRegistro2.setForeground(new java.awt.Color(255, 0, 0));
        CedulaRegistro2.setText("Contraseña");

        CorreoRegistro3.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        CorreoRegistro3.setForeground(new java.awt.Color(255, 0, 0));
        CorreoRegistro3.setText("Cedula, use el siguiente formato (000000000)");

        ContraseñaRegistro4.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        ContraseñaRegistro4.setForeground(new java.awt.Color(255, 0, 0));
        ContraseñaRegistro4.setText("Correo electronico");

        NameTextField.setBackground(new java.awt.Color(0, 0, 0));
        NameTextField.setForeground(new java.awt.Color(255, 255, 255));
        NameTextField.setText("Nombre");
        NameTextField.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));

        CedulaTextField1.setBackground(new java.awt.Color(0, 0, 0));
        CedulaTextField1.setForeground(new java.awt.Color(255, 255, 255));
        CedulaTextField1.setText("Cedula");
        CedulaTextField1.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(255, 0, 0));

        CorreoTextField2.setBackground(new java.awt.Color(0, 0, 0));
        CorreoTextField2.setForeground(new java.awt.Color(255, 255, 255));
        CorreoTextField2.setText("Correo ");
        CorreoTextField2.setBorder(null);

        jSeparator4.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(255, 0, 0));

        jPasswordField1.setBackground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);

        RegistrarButonCUN.setBackground(new java.awt.Color(0, 0, 0));
        RegistrarButonCUN.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        RegistrarButonCUN.setForeground(new java.awt.Color(255, 0, 0));
        RegistrarButonCUN.setText("Registrar");
        RegistrarButonCUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarButonCUNActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SawGame.png"))); // NOI18N

        ButonregresarCUN.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        ButonregresarCUN.setForeground(new java.awt.Color(255, 0, 0));
        ButonregresarCUN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prev_previous_icon.png"))); // NOI18N
        ButonregresarCUN.setText("Regresar");
        ButonregresarCUN.setContentAreaFilled(false);
        ButonregresarCUN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButonregresarCUN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButonregresarCUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonregresarCUNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CorreoTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CedulaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ContraseñaRegistro4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CedulaRegistro2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NombreRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(IconoSawRegistro)
                                    .addGap(18, 18, 18)
                                    .addComponent(TituloSawRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(CorreoRegistro3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(RegistrarButonCUN)
                                    .addGap(133, 133, 133))
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(ButonregresarCUN, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(IconoSawRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(TituloSawRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(NombreRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(CorreoRegistro3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CedulaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(ContraseñaRegistro4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CorreoTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(CedulaRegistro2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(RegistrarButonCUN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButonregresarCUN, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(66, 66, 66))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarButonCUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarButonCUNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrarButonCUNActionPerformed

    private void ButonregresarCUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonregresarCUNActionPerformed
        // Buton de Regresar a LoginDeUsuarioInicio
        LoginDeUsuarioInicio LUN = new LoginDeUsuarioInicio();
        LUN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ButonregresarCUNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuarioNuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButonregresarCUN;
    private javax.swing.JLabel CedulaRegistro2;
    private javax.swing.JTextField CedulaTextField1;
    private javax.swing.JLabel ContraseñaRegistro4;
    private javax.swing.JLabel CorreoRegistro3;
    private javax.swing.JTextField CorreoTextField2;
    private javax.swing.JLabel IconoSawRegistro;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel NombreRegistro1;
    private javax.swing.JButton RegistrarButonCUN;
    private javax.swing.JLabel TituloSawRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
 class Fondo extends JPanel{
     private Image sawImage;         

     @Override
     public void paint (Graphics imagen){
         
     sawImage =new ImageIcon(getClass().getResource("/imagenes/ES.png")).getImage();
     imagen.drawImage(sawImage, 0, 0, getWidth(), getHeight(), this);
     setOpaque(false);
     super.paint(imagen);
         
     }
         
     }
    




}
