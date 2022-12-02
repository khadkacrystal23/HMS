/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controller.AppointmentController;
import models.Appointment;

/**
 *
 * @author khadk
 */
public class UpdateAppointment extends javax.swing.JFrame {

    /**
     * Creates new form UpdateAppointment
     */
    public UpdateAppointment() {
        initComponents();
        display();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        emailTxt = new javax.swing.JTextField();
        appointId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        speciality = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        appointDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setText("User email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 190, 60));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/iccon.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("HMS");

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jButton1.setText("HOME");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED,
                new java.awt.Color(255, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(255, 0, 0),
                new java.awt.Color(102, 0, 51)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jButton2.setText("Contact Us");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED,
                new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0)));

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jButton3.setText("About Us");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED,
                new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 51)));

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jButton4.setText("My Profile");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED,
                new java.awt.Color(255, 0, 51), new java.awt.Color(255, 0, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jButton5.setText("Log Out");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED,
                new java.awt.Color(255, 0, 51), new java.awt.Color(255, 0, 0)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 142,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGroup(jPanel2Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel3,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        134,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanel2Layout
                                                                                        .createSequentialGroup()
                                                                                        .addGap(9, 9, 9)
                                                                                        .addComponent(jButton1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                105,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jButton2,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        126,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton3,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        126,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                        .addGap(35, 35, 35)
                                                                        .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                100,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(5, 5, 5)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 112,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(13, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(36, Short.MAX_VALUE)));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 620));

        emailTxt.setBackground(java.awt.Color.black);
        emailTxt.setForeground(java.awt.Color.white);
        jPanel1.add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 320, 60));

        appointId.setBackground(java.awt.Color.black);
        appointId.setForeground(java.awt.Color.white);
        jPanel1.add(appointId, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 320, 60));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("Appointment ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 190, 60));

        speciality.setBackground(java.awt.Color.black);
        speciality.setForeground(java.awt.Color.white);
        jPanel1.add(speciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 320, 60));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setText("Speciality");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 190, 60));

        appointDate.setBackground(java.awt.Color.black);
        appointDate.setForeground(java.awt.Color.white);
        jPanel1.add(appointDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 320, 60));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setText("Appointment Date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 190, 60));

        deleteBtn.setBackground(new java.awt.Color(153, 172, 51));
        deleteBtn.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        deleteBtn.setText("Delete Appointment");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 300, 80));

        updateBtn.setBackground(new java.awt.Color(153, 172, 51));
        updateBtn.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        updateBtn.setText("Update Appointment");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 300, 80));

        jButton6.setBackground(new java.awt.Color(0, 51, 51));
        jButton6.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 0, 51));
        jButton6.setText("BACK");
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 130, 60));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Update Appointment");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 690, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Update Appointment.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton5ActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:

        String email = emailTxt.getText();
        String apponitmentId = appointId.getText();
        String appointmentDate = appointDate.getText();
        String special = speciality.getText();

        try {
            Appointment a1 = new Appointment(Integer.parseInt(apponitmentId), 0, email, null, null, 0, null,
                    appointmentDate, null, special);
                    AppointmentController ac = new AppointmentController();
                    int result= ac.UpdateAppoint(a1);
                    if(result>0){
                        JOptionPane.showMessageDialog(this,"Updated Success");
                    }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }// GEN-LAST:event_updateBtnActionPerformed

    public void display() {
        try {
            Appointment a1 = new Appointment(0, 0, null, null, null, 0, null, null, null, null);
            AppointmentController ac = new AppointmentController();
            ResultSet rs = ac.selectAppoint(a1);
            while (rs.next()) {
                emailTxt.setText(rs.getString(1));
                appointId.setText(rs.getString(2));
                appointDate.setText(rs.getString(3));
                speciality.setText(rs.getString(4));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateAppointment.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAppointment.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAppointment.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAppointment.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField appointDate;
    private javax.swing.JTextField appointId;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField speciality;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
