/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

import controller.PatientController;
import models.Patient;

/**
 *
 * @author razee
 */
public class PatientDetails extends javax.swing.JFrame {

    /**
     * Creates new form PatientDetails
     */
    public PatientDetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gender = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        ageText = new javax.swing.JTextField();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        othersRadio = new javax.swing.JRadioButton();
        bloodCombo = new javax.swing.JComboBox<>();
        addressText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        medicalText = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(980, 690));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 48)); // NOI18N
        jLabel2.setText("Patient Details");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 490, 59));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel3.setText("Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 166, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel4.setText("Age:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 219, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel5.setText("Gender:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 265, 107, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Blood Group:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, 24));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel7.setText("Address:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 110, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel8.setText("E-mail:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel9.setText("Medical history:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 195, -1));

        nameText.setBackground(new java.awt.Color(51, 255, 255));
        nameText.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        getContentPane().add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 245, 37));

        ageText.setBackground(new java.awt.Color(0, 255, 255));
        ageText.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        getContentPane().add(ageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 215, 230, 32));

        Gender.add(maleRadio);
        maleRadio.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        maleRadio.setForeground(new java.awt.Color(255, 255, 51));
        maleRadio.setText("Male");
        maleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioActionPerformed(evt);
            }
        });
        getContentPane().add(maleRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 266, 80, -1));

        Gender.add(femaleRadio);
        femaleRadio.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        femaleRadio.setForeground(new java.awt.Color(255, 255, 0));
        femaleRadio.setText("Female");
        getContentPane().add(femaleRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 266, 80, -1));

        Gender.add(othersRadio);
        othersRadio.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        othersRadio.setForeground(new java.awt.Color(255, 255, 0));
        othersRadio.setText("Others");
        othersRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                othersRadioActionPerformed(evt);
            }
        });
        getContentPane().add(othersRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 266, 80, -1));

        bloodCombo.setBackground(new java.awt.Color(0, 0, 0));
        bloodCombo.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        bloodCombo.setForeground(new java.awt.Color(255, 255, 51));
        bloodCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A-", "A+", "B-", "B+", "O-", "O+", "AB-", "AB+", " " }));
        getContentPane().add(bloodCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 294, 80, 40));

        addressText.setBackground(new java.awt.Color(0, 255, 255));
        addressText.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        getContentPane().add(addressText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 265, 36));

        emailText.setBackground(new java.awt.Color(51, 255, 255));
        emailText.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        getContentPane().add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 265, 35));

        medicalText.setBackground(new java.awt.Color(0, 255, 255));
        medicalText.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        medicalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalTextActionPerformed(evt);
            }
        });
        getContentPane().add(medicalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 410, 80));

        createBtn.setBackground(new java.awt.Color(0, 0, 0));
        createBtn.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        createBtn.setForeground(new java.awt.Color(255, 255, 0));
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        getContentPane().add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 560, 170, 50));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("View Details");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 180, 50));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 255, 255));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 126, 48));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Create Patient Details.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, -1, 760));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 640));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Create Patient Details.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, -1, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        String name = nameText.getText();
        String age = ageText.getText();
        String gender = null;
        String blood = null;
        String address = addressText.getText();
        String email = emailText.getText();
        String medical = medicalText.getText();

        if (maleRadio.isSelected()) {
            gender = "Male";
        } else if (femaleRadio.isSelected()) {
            gender = "Female";
        } else {
            gender = "others";
        }
        Object selecteditem = bloodCombo.getSelectedItem();
        if (selecteditem != null) {
            blood = selecteditem.toString();
        }

        if (name.equals("") || age.equals("") || gender.equals(null) || blood.equals(null) || address.equals("")
                || email.equals("") || medical.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter all the details");
                }else{
                    try {
                        Patient p1 = new Patient(0, 0, 0, email, medical, blood,0);
                        PatientController pc = new PatientController();
                        int result = pc.insertDetails(p1);
                        if(result>0){

                            JOptionPane.showMessageDialog(null, "Patient details successfully created");
                        }
                    } catch (Exception e) {
                        // TODO: handle exception
                        JOptionPane.showMessageDialog(null, e);

            }
        }
    }//GEN-LAST:event_createBtnActionPerformed

    private void maleRadioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_maleRadioActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_maleRadioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton3ActionPerformed

    private void medicalTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_medicalTextActionPerformed
        // TODO add your handling code here:
        
    }// GEN-LAST:event_medicalTextActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_nameTextActionPerformed

    private void othersRadioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_othersRadioActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_othersRadioActionPerformed

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
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Gender;
    private javax.swing.JTextField addressText;
    private javax.swing.JTextField ageText;
    private javax.swing.JComboBox<String> bloodCombo;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField emailText;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JTextField medicalText;
    private javax.swing.JTextField nameText;
    private javax.swing.JRadioButton othersRadio;
    // End of variables declaration//GEN-END:variables
}
