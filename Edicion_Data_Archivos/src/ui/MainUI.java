/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author J
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form MainUI
     */
    public MainUI() {
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

        jMenuBar_TopPrincipal = new javax.swing.JMenuBar();
        JMB_TP_Opcion_Archivo = new javax.swing.JMenu();
        JMB_TP_Archivo_Nuevo = new javax.swing.JMenu();
        JMB_TP_Archivo_Nuevo_EdicionArchivo = new javax.swing.JMenuItem();
        JMB_TP_Archivo_Nuevo_Traza = new javax.swing.JMenuItem();
        JMB_TP_Archivo_Nuevo_EncryptDecrypt = new javax.swing.JMenuItem();
        JMB_TP_Opcion_Ayuda = new javax.swing.JMenu();
        JMB_TP_Ayuda_AcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JMB_TP_Opcion_Archivo.setText("Archivo");

        JMB_TP_Archivo_Nuevo.setText("Nuevo");

        JMB_TP_Archivo_Nuevo_EdicionArchivo.setText("Edicion Archivo");
        JMB_TP_Archivo_Nuevo_EdicionArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMB_TP_Archivo_Nuevo_EdicionArchivoActionPerformed(evt);
            }
        });
        JMB_TP_Archivo_Nuevo.add(JMB_TP_Archivo_Nuevo_EdicionArchivo);

        JMB_TP_Archivo_Nuevo_Traza.setText("Traza Archivo");
        JMB_TP_Archivo_Nuevo_Traza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMB_TP_Archivo_Nuevo_TrazaActionPerformed(evt);
            }
        });
        JMB_TP_Archivo_Nuevo.add(JMB_TP_Archivo_Nuevo_Traza);

        JMB_TP_Archivo_Nuevo_EncryptDecrypt.setText("Encriptar // Desencriptar");
        JMB_TP_Archivo_Nuevo_EncryptDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMB_TP_Archivo_Nuevo_EncryptDecryptActionPerformed(evt);
            }
        });
        JMB_TP_Archivo_Nuevo.add(JMB_TP_Archivo_Nuevo_EncryptDecrypt);

        JMB_TP_Opcion_Archivo.add(JMB_TP_Archivo_Nuevo);

        jMenuBar_TopPrincipal.add(JMB_TP_Opcion_Archivo);

        JMB_TP_Opcion_Ayuda.setText("Ayuda");

        JMB_TP_Ayuda_AcercaDe.setText("Acerca De ...");
        JMB_TP_Opcion_Ayuda.add(JMB_TP_Ayuda_AcercaDe);

        jMenuBar_TopPrincipal.add(JMB_TP_Opcion_Ayuda);

        setJMenuBar(jMenuBar_TopPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 858, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMB_TP_Archivo_Nuevo_EdicionArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMB_TP_Archivo_Nuevo_EdicionArchivoActionPerformed
        // TODO add your handling code here:
        EdicionArchivo jFrame= new EdicionArchivo();//Levantar un JFrame con su funcionalidad
        jFrame.setVisible(true);
    }//GEN-LAST:event_JMB_TP_Archivo_Nuevo_EdicionArchivoActionPerformed

    private void JMB_TP_Archivo_Nuevo_TrazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMB_TP_Archivo_Nuevo_TrazaActionPerformed
        // TODO add your handling code here:
        //Frame2 jFrame= new Frame2();//Levantar un JFrame con su funcionalidad
        //jFrame.setVisible(true);
    }//GEN-LAST:event_JMB_TP_Archivo_Nuevo_TrazaActionPerformed

    private void JMB_TP_Archivo_Nuevo_EncryptDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMB_TP_Archivo_Nuevo_EncryptDecryptActionPerformed
        // TODO add your handling code here:
        Encrypt_Drecrypt jFrame = new Encrypt_Drecrypt();
        jFrame.setVisible(true);
        
    }//GEN-LAST:event_JMB_TP_Archivo_Nuevo_EncryptDecryptActionPerformed

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMB_TP_Archivo_Nuevo;
    private javax.swing.JMenuItem JMB_TP_Archivo_Nuevo_EdicionArchivo;
    private javax.swing.JMenuItem JMB_TP_Archivo_Nuevo_EncryptDecrypt;
    private javax.swing.JMenuItem JMB_TP_Archivo_Nuevo_Traza;
    private javax.swing.JMenuItem JMB_TP_Ayuda_AcercaDe;
    private javax.swing.JMenu JMB_TP_Opcion_Archivo;
    private javax.swing.JMenu JMB_TP_Opcion_Ayuda;
    private javax.swing.JMenuBar jMenuBar_TopPrincipal;
    // End of variables declaration//GEN-END:variables
}