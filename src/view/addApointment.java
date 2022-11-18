/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import controller.AppointmentController;
import database.db;
import models.Appointment;

/**
 *
 * @author khadk
 */
public class addApointment extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs;
    Statement smt;
    /**
     * Creates new form addApointment
     */
    public addApointment() {
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
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ageText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        genderText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        locationText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        appointText = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        specialistText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new AbsoluteLayout());

        jPanel4.setBackground(java.awt.Color.lightGray);
        jPanel4.setLayout(new AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.gray);

        jButton9.setText("Home");
        jButton9.setSelected(true);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Contact");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton12.setText("My profile");

        jButton13.setText("Log out");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image 4 (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jButton11.setText("About us");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel2, new AbsoluteConstraints(0, 0, 150, 460));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Please fill up the given details");
        jPanel4.add(jLabel3, new AbsoluteConstraints(260, 30, 390, -1));

        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Full Name");
        jPanel4.add(jLabel4, new AbsoluteConstraints(170, 90, 100, 30));

        nameText.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        jPanel4.add(nameText, new AbsoluteConstraints(300, 90, 230, 30));

        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Age");
        jPanel4.add(jLabel5, new AbsoluteConstraints(170, 130, 100, 30));

        ageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextActionPerformed(evt);
            }
        });
        jPanel4.add(ageText, new AbsoluteConstraints(300, 130, 230, 30));

        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Gender");
        jPanel4.add(jLabel6, new AbsoluteConstraints(170, 170, 100, 30));

        genderText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderTextActionPerformed(evt);
            }
        });
        jPanel4.add(genderText, new AbsoluteConstraints(300, 170, 230, 30));

        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Location");
        jPanel4.add(jLabel7, new AbsoluteConstraints(170, 210, 100, 30));

        locationText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationTextActionPerformed(evt);
            }
        });
        jPanel4.add(locationText, new AbsoluteConstraints(300, 210, 230, 30));

        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Appointment Time");
        jPanel4.add(jLabel8, new AbsoluteConstraints(170, 250, 120, 30));
        jPanel4.add(appointText, new AbsoluteConstraints(300, 250, 230, 30));

        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Phone no.");
        jPanel4.add(jLabel9, new AbsoluteConstraints(170, 290, 100, 30));

        phoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextActionPerformed(evt);
            }
        });
        jPanel4.add(phoneText, new AbsoluteConstraints(300, 290, 230, 30));

        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Specialist");
        jPanel4.add(jLabel10, new AbsoluteConstraints(170, 330, 100, 30));

        specialistText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialistTextActionPerformed(evt);
            }
        });
        jPanel4.add(specialistText, new AbsoluteConstraints(300, 330, 230, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Update Appointment");
        jPanel4.add(jButton1, new AbsoluteConstraints(540, 300, 170, 40));

        jButton2.setBackground(java.awt.Color.black);
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(java.awt.Color.white);
        jButton2.setText("Add Appointment");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton2ActionPerformed(evt);
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        jPanel4.add(jButton2, new AbsoluteConstraints(300, 380, 230, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("View Appointment");
        jPanel4.add(jButton3, new AbsoluteConstraints(540, 120, 170, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Appointment_img.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jLabel2, new AbsoluteConstraints(0, 0, 730, 460));

        jPanel1.add(jPanel4, new AbsoluteConstraints(0, 0, 720, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void ageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextActionPerformed

    private void genderTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderTextActionPerformed

    private void locationTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationTextActionPerformed

    private void phoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextActionPerformed

    private void specialistTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialistTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specialistTextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_jButton2ActionPerformed
        String name = nameText.getText();
        String age = ageText.getText();
        String phone = phoneText.getText();
        String specialist = specialistText.getText();
        DateFormat fmt = new SimpleDateFormat("dd/MM/YY");
        String appoint = fmt.format(this.appointText.getDate());
        String gender = genderText.getText();
        String location = locationText.getText();

        
        
        
        // JOptionPane.showMessageDialog(null, appoint);
        
        if(name.equals("")||age.equals("")||gender.equals("")||location.equals("")||appoint.equals("")||phone.equals("")||specialist.equals("")){
          JOptionPane.showMessageDialog(null, "Please Fill all the details");
        
    }else{
        // try {
            String fName="";
            String lName="";
            String temp = "";
            char[] ary = name.toCharArray();

            for(int i=0;i<ary.length;i++){
                if(ary[i]==' '){
                    temp+="1";
                }
                if(temp==""){
                    fName+=ary[i];
                }else{
                    lName+=ary[i];
                }
            }
            conn=db.connectmysqldb();
            
            int age_int   = Integer.parseInt(age);
            Appointment s1 = new Appointment(fName,lName,age_int,location,appoint,gender,specialist);
            AppointmentController sc= new AppointmentController();
            int isInserted = sc.insertAppointment(s1);
            if(isInserted>0){
                System.out.println("Inserted");
            }else{
                System.out.println(" NOt Inserted");

            }
            JOptionPane.showMessageDialog(null,"Inserted Successfully");
            
        // } catch (Exception e) {
        //     // TODO Auto-generated catch block
        //     JOptionPane.showMessageDialog(null,e);
        //     System.out.println(e);
        // }
    }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(addApointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addApointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addApointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addApointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addApointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageText;
    private com.toedter.calendar.JDateChooser appointText;
    private javax.swing.JTextField genderText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField locationText;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField phoneText;
    private javax.swing.JTextField specialistText;
    // End of variables declaration//GEN-END:variables
}
