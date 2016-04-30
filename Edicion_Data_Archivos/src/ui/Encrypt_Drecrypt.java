/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import utils.Archivo;
import utils.StringEncrypt;

/**
 *
 * @author J
 */
public class Encrypt_Drecrypt extends javax.swing.JFrame {

    private JFileChooser jfcEncrypt;
    
    /**
     * Creates new form Encrypt_Drecrypt
     */
    public Encrypt_Drecrypt() {
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

        JDG_PW_Encrypt = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        JPF_JPCE_Password = new javax.swing.JPasswordField();
        JBT_ED_PasswordAceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTA_Encrypt_Decrypt = new javax.swing.JTextArea();
        JMB_Encrypt_Decrypt = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMI_Encrypt = new javax.swing.JMenuItem();
        JMI_Decrypt = new javax.swing.JMenuItem();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Contraseña de Encriptación:");

        JPF_JPCE_Password.setText("jPasswordField1");

        JBT_ED_PasswordAceptar.setText("Aceptar");
        JBT_ED_PasswordAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBT_ED_PasswordAceptarActionPerformed(evt);
            }
        });

        jLabel2.setText("(Mínimo 16 caracteres)");

        javax.swing.GroupLayout JDG_PW_EncryptLayout = new javax.swing.GroupLayout(JDG_PW_Encrypt.getContentPane());
        JDG_PW_Encrypt.getContentPane().setLayout(JDG_PW_EncryptLayout);
        JDG_PW_EncryptLayout.setHorizontalGroup(
            JDG_PW_EncryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDG_PW_EncryptLayout.createSequentialGroup()
                .addGroup(JDG_PW_EncryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDG_PW_EncryptLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(JDG_PW_EncryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPF_JPCE_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JDG_PW_EncryptLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1))))
                    .addGroup(JDG_PW_EncryptLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(JBT_ED_PasswordAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JDG_PW_EncryptLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel2)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        JDG_PW_EncryptLayout.setVerticalGroup(
            JDG_PW_EncryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDG_PW_EncryptLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPF_JPCE_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBT_ED_PasswordAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTA_Encrypt_Decrypt.setEditable(false);
        JTA_Encrypt_Decrypt.setColumns(20);
        JTA_Encrypt_Decrypt.setRows(5);
        jScrollPane2.setViewportView(JTA_Encrypt_Decrypt);

        jMenu1.setText("Nuevo");

        JMI_Encrypt.setText("Encrypt");
        JMI_Encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_EncryptActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_Encrypt);

        JMI_Decrypt.setText("Decrypt");
        JMI_Decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_DecryptActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_Decrypt);

        JMB_Encrypt_Decrypt.add(jMenu1);

        setJMenuBar(JMB_Encrypt_Decrypt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMI_EncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_EncryptActionPerformed
        // TODO add your handling code here:
        jfcEncrypt = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".txt", "txt", "text");
        jfcEncrypt.setFileFilter(filter);
        JDialog dialogFileChooser = new JDialog(this, "Seleccione Archivo .txt");
        dialogFileChooser.getContentPane().add(jfcEncrypt);
        dialogFileChooser.setSize(700,500);
        //dialogFileChooser.show();
                        
        int respuesta = jfcEncrypt.showOpenDialog(this);
        //Comprobar si se ha pulsado Aceptar
        if (respuesta == JFileChooser.APPROVE_OPTION)
        {      
            JDG_PW_Encrypt.setTitle("Ingrese contraseña");
            JDG_PW_Encrypt.setSize(400, 240);
            JDG_PW_Encrypt.show();

//            Archivo file = new Archivo();
//            String data = file.LeeAchivo(pathFile);
//            JTA_Encrypt_Decrypt.setText(data);
            
        }
    }//GEN-LAST:event_JMI_EncryptActionPerformed

    private void EncriptaArchivo()
    {
        Archivo file = new Archivo();
        //Crear un objeto File con el archivo elegido
        File archivoElegido = jfcEncrypt.getSelectedFile();
        //Mostrar el nombre del archvivo en un campo de texto
        //JTA_Encrypt_Decrypt.setText(archivoElegido.getAbsolutePath());
        String pathFileSelected = archivoElegido.getAbsolutePath();
        Path path = Paths.get(pathFileSelected);
        byte[] data = null;
        try
        {
            data = Files.readAllBytes(path);
        }
        catch(IOException ex){
            System.out.println("Error encrypt/decrypt: " + ex.getMessage());
        }          
        StringEncrypt objEncrypt = new StringEncrypt();            
        String key = "92AE31A79FEEB2A3"; //llave
        String iv = "0123456789ABCDEF"; // vector de inicialización      
        try
        {
            String dataEncrypt = objEncrypt.encrypt(key, iv, data);              
            System.out.println("Texto encriptado: " + dataEncrypt);

            Date fecha = new Date ();
            DateFormat hourdateFormat = new SimpleDateFormat("HHmmss_ddMMyyyy");
            
            
            JFileChooser jfcEncryptSave = new JFileChooser();
            JDialog dialogFileChooser = new JDialog(this, "Seccione ubicación para guardar archivo.");
            dialogFileChooser.getContentPane().add(jfcEncryptSave);
            dialogFileChooser.setSize(700,500);
            //dialogFileChooser.show();

            int respuesta = jfcEncryptSave.showSaveDialog(this);
            //Comprobar si se ha pulsado Aceptar
            if (respuesta == JFileChooser.APPROVE_OPTION)
            {
                //Crear un objeto File con el archivo elegido
                File dirElegido = jfcEncryptSave.getSelectedFile();
                //Mostrar el nombre del archvivo en un campo de texto
                String pathSave = dirElegido.getPath();
                
                Boolean resp = file.CreaArchivo(pathSave + hourdateFormat.format(fecha)  + ".siu", dataEncrypt); //.siu : Seguridad Informatica Unab
            
                if(resp == true){
                    JOptionPane.showMessageDialog(null, "Encriptación exitosa!");
                    jfcEncrypt = null;
                    JDG_PW_Encrypt.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "No se pudo encriptar el archivo.");
                }
            }
        }
        catch(Exception e){
            System.out.println("Error encrypt/decrypt: " + e.getMessage());
        }  
    }
    
    private void JMI_DecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_DecryptActionPerformed
        // TODO add your handling code here:
        Archivo file = new Archivo();
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".siu", "siu", "text");
        jfc.setFileFilter(filter);
        JDialog dialogFileChooser = new JDialog(this, "Seleccione Archivo .siu");
			dialogFileChooser.getContentPane().add(jfc);
			dialogFileChooser.setSize(700,500);
			//dialogFileChooser.show();
                        
        int respuesta = jfc.showOpenDialog(this);
        //Comprobar si se ha pulsado Aceptar
        if (respuesta == JFileChooser.APPROVE_OPTION)
        {
            //Crear un objeto File con el archivo elegido
            File archivoElegido = jfc.getSelectedFile();
            
            String pathFileSelected = archivoElegido.getAbsolutePath();
            
            String data = "";
            data = file.LeeAchivo(pathFileSelected);
        
            StringEncrypt objEncrypt = new StringEncrypt();            
            String key = "92AE31A79FEEB2A3"; //llave
            String iv = "0123456789ABCDEF"; // vector de inicialización
     
            try
            {
                String dataDecrypt = objEncrypt.decrypt(key, iv, data);   
                System.out.println("Texto desencriptado: " + dataDecrypt);
                
                String textDecrypt = file.LeeAchivo(pathFileSelected);
                JTA_Encrypt_Decrypt.setText(dataDecrypt);
                 
            }
            catch(Exception e){
                System.out.println("Error encrypt/decrypt: " + e.getMessage());
            }  
        }
    }//GEN-LAST:event_JMI_DecryptActionPerformed

    private void JBT_ED_PasswordAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_ED_PasswordAceptarActionPerformed
        // TODO add your handling code here:
        String pass = JPF_JPCE_Password.getText();
        if(pass.equals("jPasswordField1"))
        {
            JOptionPane.showMessageDialog(null, "Ingrese una contraseña.");
        }
        else if(pass.length() < 16)
        {
            JOptionPane.showMessageDialog(null, "Contraseña debe tener al menos 16 caracteres.");
        }
        else{
            EncriptaArchivo();
        }
    }//GEN-LAST:event_JBT_ED_PasswordAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Encrypt_Drecrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encrypt_Drecrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encrypt_Drecrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encrypt_Drecrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encrypt_Drecrypt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBT_ED_PasswordAceptar;
    private javax.swing.JDialog JDG_PW_Encrypt;
    private javax.swing.JMenuBar JMB_Encrypt_Decrypt;
    private javax.swing.JMenuItem JMI_Decrypt;
    private javax.swing.JMenuItem JMI_Encrypt;
    private javax.swing.JPasswordField JPF_JPCE_Password;
    private javax.swing.JTextArea JTA_Encrypt_Decrypt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}