/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IniciodeJuego;

/**
 *
 * @author aldav
 */
public class Introducion2 extends javax.swing.JFrame {

    /**
     * Creates new form Introducion2
     */
    public Introducion2() {
       this.setSize(748, 519);
       this.setTitle("Juego Escapando de SAW");
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1Cierra = new javax.swing.JButton();
        jButton2Siguiente = new javax.swing.JButton();
        jLabel1Imagen = new javax.swing.JLabel();
        jLabel2textoLetras1 = new javax.swing.JLabel();
        jLabel3TextoLetras2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1Cierra.setBackground(new java.awt.Color(255, 0, 0));
        jButton1Cierra.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jButton1Cierra.setText("X");
        jButton1Cierra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CierraActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1Cierra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        jButton2Siguiente.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jButton2Siguiente.setForeground(new java.awt.Color(255, 0, 0));
        jButton2Siguiente.setText("Jugar");
        jButton2Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2SiguienteActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 90, 30));

        jLabel1Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sawpequeña.jpg"))); // NOI18N
        jLabel1Imagen.setText("jLabel1");
        jPanel2.add(jLabel1Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 370, 230));

        jLabel2textoLetras1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2textoLetras1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2textoLetras1.setText("Para la siguiente pantalla tienes que resolver un acertijo.");
        jPanel2.add(jLabel2textoLetras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 670, 80));

        jLabel3TextoLetras2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel3TextoLetras2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3TextoLetras2.setText("Se te daran cuatro obsiciones  pero solo una  sera la correcta.");
        jPanel2.add(jLabel3TextoLetras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 740, 130));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 520));

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

    private void jButton2SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2SiguienteActionPerformed
        /// Con este Objeto me puedo pasar de pantallas con el boton indicado.
        Juego2 juego2 = new Juego2();
         juego2.setVisible(true);
    }//GEN-LAST:event_jButton2SiguienteActionPerformed

    private void jButton1CierraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CierraActionPerformed
         /// Con este Objeto me puedo pasar de de inicio con el boton indicado.
        Nivel_Intermedio juego1 = new Nivel_Intermedio();
         juego1.setVisible(true);
    }//GEN-LAST:event_jButton1CierraActionPerformed

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
            java.util.logging.Logger.getLogger(Introducion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Introducion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Introducion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Introducion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Introducion2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Cierra;
    private javax.swing.JButton jButton2Siguiente;
    private javax.swing.JLabel jLabel1Imagen;
    private javax.swing.JLabel jLabel2textoLetras1;
    private javax.swing.JLabel jLabel3TextoLetras2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
