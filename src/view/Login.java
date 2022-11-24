package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// package view;

import java.sql.*;
import javax.swing.*;

import javax.swing.JOptionPane;

import org.netbeans.lib.awtextra.AbsoluteLayout;

import controller.UserController;
import database.db;
import models.User;

/**
 *
 * @author khadk
 */
public class Login extends javax.swing.JFrame {
    Connection conn;
    
    /**
     * Creates new form Login
     */
    public Login() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        loginbtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HMS");
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.gray);
        jPanel1.setLayout(new AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("SIGN IN");
        jPanel1.add(jLabel2, new AbsoluteConstraints(620, 40, 190, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Access Your Account");
        jPanel1.add(jLabel3, new AbsoluteConstraints(620, 90, 260, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new AbsoluteConstraints(530, 150, 180, -1));

        eText.setBackground(java.awt.Color.black);
        eText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        eText.setForeground(java.awt.Color.white);
        jPanel1.add(eText, new AbsoluteConstraints(530, 190, 290, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new AbsoluteConstraints(530, 250, 180, -1));

        pText.setBackground(java.awt.Color.black);
        pText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pText.setForeground(java.awt.Color.white);
        pText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pTextActionPerformed(evt);
            }
        });
        jPanel1.add(pText, new AbsoluteConstraints(530, 290, 300, 40));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Forgot Password");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new AbsoluteConstraints(580, 350, 180, -1));

        loginbtn.setBackground(new java.awt.Color(204, 204, 204));
        loginbtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginbtn, new AbsoluteConstraints(535, 440, 170, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setText("About us");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new AbsoluteConstraints(405, 520, 160, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Login_pic.png"))); // NOI18N
        jPanel1.add(jLabel1, new AbsoluteConstraints(0, 0, -1, 570));

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
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        if(eText.getText().equals("") || pText.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Your message here");
        }else{
            try {
                User s1 = new User(null, null, null, eText.getText(), null, pText.getText(), null, null, null, null);
                UserController sc= new UserController();
                ResultSet isInserted = sc.selectLogin(s1);
                
                if(isInserted.next()){
                    JOptionPane.showMessageDialog(null,"Inserted Success");
                    int result = sc.UpdateStatus(s1);
                    int resul1 = sc.changestatus(s1);
    
                }
                else{
                    System.out.println("Failed to insert student");
                    
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void pTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pTextActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JTextField pText;
    // End of variables declaration//GEN-END:variables
}
