/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Modul9;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class latihan2d extends javax.swing.JFrame {

    /**
     * Creates new form latihan2d
     */
    public latihan2d() {
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

        OPENBUTTON = new javax.swing.JButton();
        SAVEBUTTON = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OPENBUTTON.setText("OPEN");
        OPENBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPENBUTTONActionPerformed(evt);
            }
        });

        SAVEBUTTON.setText("SAVE");
        SAVEBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEBUTTONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(OPENBUTTON)
                .addGap(77, 77, 77)
                .addComponent(SAVEBUTTON)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OPENBUTTON)
                    .addComponent(SAVEBUTTON))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OPENBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPENBUTTONActionPerformed
        // TODO add your handling code here:
        int status;
        JFileChooser chooser = new JFileChooser();
        status = chooser.showSaveDialog(null);

        if (status == JFileChooser.APPROVE_OPTION) {

            JOptionPane.showMessageDialog(null, "Anda membuka file: " + chooser.getSelectedFile().getAbsolutePath(), "Open", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_OPENBUTTONActionPerformed

    private void SAVEBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEBUTTONActionPerformed
        // TODO add your handling code here:
        int status;
        JFileChooser chooser = new JFileChooser();
        status = chooser.showSaveDialog(null);

        if (status == JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(null, "Anda menyimpan di: " + chooser.getSelectedFile().getAbsolutePath(), "Save", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_SAVEBUTTONActionPerformed

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
            java.util.logging.Logger.getLogger(latihan2d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan2d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan2d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan2d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan2d().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OPENBUTTON;
    private javax.swing.JButton SAVEBUTTON;
    // End of variables declaration//GEN-END:variables
}
