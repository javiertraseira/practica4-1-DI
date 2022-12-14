/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicioxml_sol;

/**
 *
 * @author Javier
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        b_botonaceptar = new javax.swing.JButton();
        d_Red = new javax.swing.JSlider();
        d_Green = new javax.swing.JSlider();
        d_Blue = new javax.swing.JSlider();
        t_textoprincipal = new javax.swing.JLabel();
        panel_color = new javax.swing.JPanel();
        t_textodam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Deslizador color");
        setResizable(false);

        b_botonaceptar.setText("Aceptar");
        b_botonaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_botonaceptarActionPerformed(evt);
            }
        });

        d_Red.setMaximum(255);
        d_Red.setPaintLabels(true);
        d_Red.setPaintTicks(true);
        d_Red.setValue(255);
        d_Red.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                d_RedStateChanged(evt);
            }
        });

        d_Green.setMaximum(255);
        d_Green.setPaintLabels(true);
        d_Green.setPaintTicks(true);
        d_Green.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                d_GreenStateChanged(evt);
            }
        });

        d_Blue.setMaximum(255);
        d_Blue.setPaintLabels(true);
        d_Blue.setPaintTicks(true);
        d_Blue.setValue(0);
        d_Blue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                d_BlueStateChanged(evt);
            }
        });

        t_textoprincipal.setText("Desliza los selectores para cambiar los valores RGB:");

        panel_color.setBackground(new java.awt.Color(255, 51, 0));

        t_textodam.setForeground(new java.awt.Color(255, 255, 255));
        t_textodam.setText("DAM");

        javax.swing.GroupLayout panel_colorLayout = new javax.swing.GroupLayout(panel_color);
        panel_color.setLayout(panel_colorLayout);
        panel_colorLayout.setHorizontalGroup(
            panel_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_colorLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(t_textodam)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        panel_colorLayout.setVerticalGroup(
            panel_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_colorLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(t_textodam)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panel_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(d_Blue, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(t_textoprincipal)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d_Green, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d_Red, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(b_botonaceptar)
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(t_textoprincipal)
                .addGap(18, 18, 18)
                .addComponent(panel_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(d_Red, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(d_Green, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(d_Blue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(b_botonaceptar)
                .addGap(43, 43, 43))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_botonaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_botonaceptarActionPerformed
       System.exit(0);
    }//GEN-LAST:event_b_botonaceptarActionPerformed

    private void d_RedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_d_RedStateChanged
        panel_color.setBackground(new java.awt.Color(d_Red.getValue(), d_Green.getValue(), d_Blue.getValue()));    
    }//GEN-LAST:event_d_RedStateChanged

    private void d_BlueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_d_BlueStateChanged
         panel_color.setBackground(new java.awt.Color(d_Red.getValue(), d_Green.getValue(), d_Blue.getValue()));  
    }//GEN-LAST:event_d_BlueStateChanged

    private void d_GreenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_d_GreenStateChanged
         panel_color.setBackground(new java.awt.Color(d_Red.getValue(), d_Green.getValue(), d_Blue.getValue()));  
    }//GEN-LAST:event_d_GreenStateChanged

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_botonaceptar;
    private javax.swing.JSlider d_Blue;
    private javax.swing.JSlider d_Green;
    private javax.swing.JSlider d_Red;
    private javax.swing.JPanel panel_color;
    private javax.swing.JLabel t_textodam;
    private javax.swing.JLabel t_textoprincipal;
    // End of variables declaration//GEN-END:variables
}
