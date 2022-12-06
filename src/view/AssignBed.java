/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controller.BedController;
import controller.PatientController;
import models.Bed;
import models.Patient;

/**
 *
 * @author razee
 */
public class AssignBed extends javax.swing.JFrame {

    /**
     * Creates new form AssignBed
     */
    public AssignBed() {
        initComponents();
        func1();
        id();
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        wardType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        wardNo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        BedNO = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        patinettxt = new javax.swing.JTextField();
        bedSizTXt = new javax.swing.JTextField();
        BedTypeTxt = new javax.swing.JTextField();
        assignBtn = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(963, 622));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("HMS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/iccon.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 255));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, 40));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 255, 255));
        jButton2.setText("Contact Us");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 150, 50));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 255, 255));
        jButton3.setText("About US");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 130, 40));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 255, 255));
        jButton4.setText("My Profile");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 150, 50));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 255, 255));
        jButton5.setText("Log Out");
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 110, 60));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ASSIGN BED");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 260, -1));

        jLabel5.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PATIENT ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("WARD TYPE");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        wardType.setBackground(new java.awt.Color(51, 51, 51));
        wardType.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        wardType.setForeground(new java.awt.Color(0, 255, 255));
        wardType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Emergency", "Semi Special", "ICU", "CCU", "SICU", "Special", "Deluxe", "Super Deluxe", "BurnWard", "NICU", "PICU" }));
        wardType.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                wardTypeFocusLost(evt);
            }
        });
        jPanel2.add(wardType, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 170, 40));

        jLabel7.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("WARD NO");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        wardNo.setBackground(new java.awt.Color(0, 0, 0));
        wardNo.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        wardNo.setForeground(new java.awt.Color(0, 255, 255));
        wardNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                wardNoFocusLost(evt);
            }
        });
        jPanel2.add(wardNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 150, 40));

        jLabel8.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("BED NO");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        BedNO.setBackground(new java.awt.Color(0, 0, 0));
        BedNO.setEditable(true);
        BedNO.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        BedNO.setForeground(new java.awt.Color(255, 255, 0));
        BedNO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BedNOFocusLost(evt);
            }
        });
        BedNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BedNOActionPerformed(evt);
            }
        });
        jPanel2.add(BedNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 160, 50));

        jLabel9.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("BED SIZE");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        jLabel10.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("BED TYPE");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, -1));

        patinettxt.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jPanel2.add(patinettxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 200, 40));

        bedSizTXt.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jPanel2.add(bedSizTXt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 290, 40));

        BedTypeTxt.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jPanel2.add(BedTypeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 250, 40));

        assignBtn.setBackground(new java.awt.Color(0, 0, 0));
        assignBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        assignBtn.setForeground(new java.awt.Color(0, 255, 255));
        assignBtn.setText("ASSIGN BED");
        assignBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 255, 255), null));
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        jPanel2.add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, 240, -1));

        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Assign Bed.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wardTypeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_wardTypeFocusLost
        // TODO add your handling code here:
            wardNo.removeAllItems();
            String wardtype = null;
            Object selecteditem = wardType.getSelectedItem();
            if(selecteditem!=null){
                wardtype = selecteditem.toString();
            }
        try {
            
            String item = null;
                Bed b1 = new Bed(ALLBITS, ABORT, getTitle(), getWarningString(), wardtype);
                BedController bc = new BedController();
                ResultSet result = bc.selectWardNo(b1);
                while(result.next()){

                    item = result.getString(1);
                    boolean exists = false;
                for (int index = 0; index < wardNo.getItemCount() && !exists; index++) {
                    if (item.equals(wardNo.getItemAt(index))) {
                        exists = true;
                    }
                }
                if (!exists) {
                    wardNo.addItem(item);
                }
                }
        } catch (Exception e) {
            // TODO: handle exception
        }

        
    }//GEN-LAST:event_wardTypeFocusLost

    private void wardNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_wardNoFocusLost
        BedNO.removeAllItems();
            String wardno = null;
            Object selecteditem = wardNo.getSelectedItem();
            if(selecteditem!=null){
                wardno = selecteditem.toString();
            }
        try {
            
            String item = null;
                Bed b1 = new Bed(ALLBITS, Integer.parseInt(wardno), null, getWarningString(), null);
                BedController bc = new BedController();
                ResultSet result = bc.selectBedNo(b1);
                while(result.next()){

                    item = result.getString(1);
                    BedNO.addItem(item);
                    
                }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }//GEN-LAST:event_wardNoFocusLost

    private void BedNOFocusLost(java.awt.event.FocusEvent evt) {                                
        // BedNO.removeAllItems();
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String bedno = null;
            Object selecteditem = BedNO.getSelectedItem();
            if(selecteditem!=null){
                bedno = selecteditem.toString();
            }
        try {
            
            // String item = null;
                Bed b1 = new Bed(Integer.parseInt(bedno), 0, null, getWarningString(), null);
                BedController bc = new BedController();
                ResultSet result = bc.selectBedDetails(b1);
                while(result.next()){
                    String bedtype = result.getString(1);
                    String bedsize = result.getString(2);

                    bedSizTXt.setText(bedsize);
                    BedTypeTxt.setText(bedtype);

                    // item = result.getString(1);
                    // BedNO.addItem(item);
                    
                }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
        String bedno = null;
            Object selecteditem = BedNO.getSelectedItem();
            if(selecteditem!=null){
                bedno = selecteditem.toString();
            }

        String patient_id = patinettxt.getText();
        Patient p1 = new Patient(Integer.parseInt(patient_id),0,0,null,null,null,0,Integer.parseInt(bedno));
        PatientController pc = new PatientController();
        int result = pc.AssignBed(p1);
        if(result>0){
            JOptionPane.showMessageDialog(this, "Assigned Success");
        }
    }//GEN-LAST:event_assignBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton2ActionPerformed

    private void BedNOActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BedNOActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_BedNOActionPerformed

    public void func1() {
        wardType.removeAllItems();
        try {
            String item = null;
            Bed b1 = new Bed(ALLBITS, ABORT, getTitle(), getWarningString(), getName());
            BedController bc = new BedController();
            ResultSet result = bc.selectWardType(b1);
            while (result.next()) {
                item = result.getString(1);
                boolean exists = false;
                for (int index = 0; index < wardType.getItemCount() && !exists; index++) {
                    if (item.equals(wardType.getItemAt(index))) {
                        exists = true;
                    }
                }
                if (!exists) {
                    wardType.addItem(item);
                }
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public void id(){
        try {
            // String id = null;
            Patient p1  = new Patient(0,0,0,null,null,null,0,0);
            PatientController pc = new PatientController();
            ResultSet result = pc.selectPatientId(p1);
            while(result.next()){
                patinettxt.setText(result.getString(1));
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
            java.util.logging.Logger.getLogger(AssignBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignBed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BedNO;
    private javax.swing.JTextField BedTypeTxt;
    private javax.swing.JButton assignBtn;
    private javax.swing.JTextField bedSizTXt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JTextField patinettxt;
    private javax.swing.JComboBox<String> wardNo;
    private javax.swing.JComboBox<String> wardType;
    // End of variables declaration//GEN-END:variables
}
