/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IniciodeJuego;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author aldav
 */
public class Juego2 extends javax.swing.JFrame {

    private Color color1 = Color.BLACK;
    private Color color2 = Color.WHITE;
    
    /* @Override   /// Degradado 
    public void paint(Graphics g){ // Contro sobre el conportamiento del panel.
        super.paint(g);
        
       Graphics2D G2D = (Graphics2D) g; 
       
       int w = getWidth();
       int h = getHeight();
       // cero , cero es el promer color               // cero es el largo delpanel
       GradientPaint cp = new GradientPaint(0,0,color1,748,h,color2);
      
       G2D.setPaint(cp);
       G2D.fillRect(0, 0, 748, 519);
    
    }*/
    
    public Juego2() {
        
        
        
        JFrame frame = new JFrame();
        
      // ColorFondo mcolor=new ColorFondo();
       // frame.add(mcolor);
        this.setSize(748, 519);
        this.setLocationRelativeTo(null);// Se utiliza para centrar la ventana de Jframe.
        this.setTitle("Juego Escapando de SAW");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

        Botones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel2.setBackground(new java.awt.Color(0, 0, 0));
        Panel2.setPreferredSize(new java.awt.Dimension(640, 480));
        Panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 0, 51));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addContainerGap(686, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 40));

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText(" Puedo volar, pero no tengo alas , Puedo llorar , pero no tengo ojos.");
        Panel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 730, 60));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Donde quiera que vaya la oscuridad me sigue. Quien soy yo ???");
        Panel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 680, 60));

        jCheckBox1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 0, 0));
        jCheckBox1.setText("  Ojo");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        Panel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 0, 51));
        jCheckBox2.setText("  Pajaro");
        Panel2.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jCheckBox3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 0, 0));
        jCheckBox3.setText("  Nube");
        Panel2.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        jCheckBox4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 0, 0));
        jCheckBox4.setText("   Tiempo");
        Panel2.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Comprobar Juego");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Panel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 130, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sawpequeña.jpg"))); // NOI18N
        jLabel4.setText("jLabel3");
        Panel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 230, 190));

        jPanel1.add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         /// Con este Objeto me puedo pasar de de inicio con el boton indicado.
        Nivel_Intermedio juego1 = new Nivel_Intermedio();
         juego1.setVisible(true);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
     // Se utiliza para que solo se marque una sola opcion. 
     Botones.add(jCheckBox1);
     jCheckBox1.setActionCommand("1");
     Botones.add(jCheckBox2);
     jCheckBox1.setActionCommand("2");
     Botones.add(jCheckBox3);
     jCheckBox1.setActionCommand("3");
     Botones.add(jCheckBox4);
     jCheckBox1.setActionCommand("4");
     
     String[]Dato = new String[4];
     
     
     
     
// TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
        String botonSeleccionado = Botones.getSelection().getActionCommand();
    }//GEN-LAST:event_jButton2ActionPerformed
  
    
    private void colocarRadioBotones() {

        JRadioButton radioBoton1 = new JRadioButton("Opcion 1", false);/// sin le pongo true sale marcado la opcion
        radioBoton1.setBounds(50, 100, 200, 50);
        radioBoton1.setEnabled(true);// para quitar la opcion disponible
        radioBoton1.setText("Programacion");//// Para agregar el texto
        radioBoton1.setFont(new Font("cooper black", 0, 20));///tamano de la letra

        Panel2.add(radioBoton1);/// insertar dentro del panel.

        // radioBoton1.add(radioBoton1);/// insertar dentro del panel.
        JRadioButton radioBoton2 = new JRadioButton("Opcion 2", false);/// sin le pongo true sale marcado la opcion
        radioBoton2.setBounds(50, 150, 100, 50);
        Panel2.add(radioBoton2);

        JRadioButton radioBoton3 = new JRadioButton("Opcion 3", false);/// sin le pongo true sale marcado la opcion
        radioBoton3.setBounds(50, 200, 100, 50);
        Panel2.add(radioBoton3);

        ButtonGroup grupoRadioBotones = new ButtonGroup();  /// Se utiliza para hacer un grupo de botones
        grupoRadioBotones.add(radioBoton1);  // se utiliza [ara agregar los botones
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
        

        //Hay que  hacer un grupo de radio botones  para que se marque solo uno y no todos
        // 
    }

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
            java.util.logging.Logger.getLogger(Juego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Botones;
    private javax.swing.JPanel Panel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
