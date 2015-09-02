/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ArmandNokbak.ForeignLanguageTerritory;

import foreign.language.territory.management.kit.ForeignLanguageTerritoryManagementKit;
import static foreign.language.territory.management.kit.ForeignLanguageTerritoryManagementKit.dataList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author anokbakn
 */
public class ChangePasswordFrame extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPasswordFrame
     */
    public ChangePasswordFrame() {
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
        oldPwdLbl = new javax.swing.JLabel();
        oldPwdField = new javax.swing.JPasswordField();
        newPwdLbl = new javax.swing.JLabel();
        newPwdField = new javax.swing.JPasswordField();
        verifyNewPwdLbl = new javax.swing.JLabel();
        verifyNewPwdField = new javax.swing.JPasswordField();
        userNameLbl = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        changePwdBtn = new javax.swing.JButton();
        errorLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Changing Your Password?");
        setBounds(new java.awt.Rectangle(500, 250, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("SearchIcon.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));

        oldPwdLbl.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        oldPwdLbl.setForeground(new java.awt.Color(0, 102, 102));
        oldPwdLbl.setText("Old Password : ");

        newPwdLbl.setFont(oldPwdLbl.getFont());
        newPwdLbl.setForeground(oldPwdLbl.getForeground());
        newPwdLbl.setText("New password : ");

        verifyNewPwdLbl.setFont(oldPwdLbl.getFont());
        verifyNewPwdLbl.setForeground(oldPwdLbl.getForeground());
        verifyNewPwdLbl.setText("Verify new password : ");

        userNameLbl.setFont(oldPwdLbl.getFont());
        userNameLbl.setForeground(oldPwdLbl.getForeground());
        userNameLbl.setText("User name : ");

        userNameField.setFont(oldPwdLbl.getFont());
        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });

        changePwdBtn.setFont(oldPwdLbl.getFont());
        changePwdBtn.setText("Change Password");
        changePwdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePwdBtnActionPerformed(evt);
            }
        });

        errorLbl.setFont(oldPwdLbl.getFont());
        errorLbl.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(errorLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(changePwdBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oldPwdLbl)
                            .addComponent(newPwdLbl))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newPwdField, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(oldPwdField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verifyNewPwdLbl)
                            .addComponent(userNameLbl))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verifyNewPwdField)
                            .addComponent(userNameField))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldPwdLbl)
                    .addComponent(oldPwdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPwdLbl)
                    .addComponent(newPwdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verifyNewPwdLbl)
                    .addComponent(verifyNewPwdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameLbl)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changePwdBtn)
                    .addComponent(errorLbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changePwdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePwdBtnActionPerformed
        if (ForeignLanguageTerritoryManagementKit.user.getPwd().equals(oldPwdField.getText())
                && userNameField.getText().equalsIgnoreCase(ForeignLanguageTerritoryManagementKit.user.getUserName()))//if the old pwd & username are correct
        {
            if (newPwdField.getText().equals(verifyNewPwdField.getText())) {
                errorLbl.setText("");
                ForeignLanguageTerritoryManagementKit.user.setPwd(newPwdField.getText());//resetting the user's pwd

                String fileName = "trash.bin";
                try {
                    // Write User info to the "trash.bin" file
                    ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName));
                    output.writeObject(ForeignLanguageTerritoryManagementKit.user);
                    output.close();

                       /////////////////////////////
                    //SENDING NEW CREDENTIALS VIA EMAIL
                    Properties props = new Properties();
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.host", "smtp.gmail.com");
                    props.put("mail.smtp.socketFactory.port", "465");
                    props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                    props.put("mail.smtp.port", "465");

                    Session session = Session.getDefaultInstance(props,
                            new javax.mail.Authenticator() {
                                protected PasswordAuthentication getPasswordAuthentication() {
                                    return new PasswordAuthentication("ardeondia@gmail.com", "Johndoe57");
                                }
                            }
                    );

                    try {

                        Message message = new MimeMessage(session);
                        message.setFrom(new InternetAddress(ForeignLanguageTerritoryManagementKit.user.getEmail(), ForeignLanguageTerritoryManagementKit.user.getUserName()
                                + " from " + ForeignLanguageTerritoryManagementKit.user.getCongregation()));
                        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(ForeignLanguageTerritoryManagementKit.user.getEmail()));
                        message.setSubject("ASP Finder ... Your password has been reset.");
                        message.setText("Hello " + ForeignLanguageTerritoryManagementKit.user.getUserName() + ",\n"
                                + "Your user name is '" + ForeignLanguageTerritoryManagementKit.user.getUserName()
                                + "', and your new password is '" + ForeignLanguageTerritoryManagementKit.user.getPwd() + "'.\n"
                                + "\nThanks for using All Sorts of People Finder.\n\nYour developer.");
                        Transport.send(message);
                        JOptionPane.showMessageDialog(null, "An email was just sent to you with your new credentials. Thank you.");

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "An internet connection was not detected.\n"
                                + "We intended to email you your new credentials. Unfortunately it didn't succeed.\nPlease be advised though that "
                                + "your password has been changed and registered.");

                    }

                    this.hide();// concealing this frame  
                } catch (IOException ex1) {
                    JOptionPane.showMessageDialog(null, "Login output stream not created.\n Contact developer.");
                }
            } else {
                errorLbl.setText("Password Mismatch");
            }
        } else {
            errorLbl.setText("wrong password or user name");
        }
    }//GEN-LAST:event_changePwdBtnActionPerformed

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameFieldActionPerformed
        changePwdBtn.doClick();
        
    }//GEN-LAST:event_userNameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePasswordFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePwdBtn;
    private javax.swing.JLabel errorLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField newPwdField;
    private javax.swing.JLabel newPwdLbl;
    private javax.swing.JPasswordField oldPwdField;
    private javax.swing.JLabel oldPwdLbl;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JPasswordField verifyNewPwdField;
    private javax.swing.JLabel verifyNewPwdLbl;
    // End of variables declaration//GEN-END:variables
}