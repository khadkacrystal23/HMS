/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
//importing required libraries
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import java.awt.*;
import models.*;
import controller.*;

/**
 *
 * @author razee
 */
public class AddBed extends javax.swing.JFrame {

    /**
     * Creates new form AddBed
     */
    public AddBed() {
        initComponents();
        table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BedSize = new javax.swing.ButtonGroup();
        BedType = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        wardField = new javax.swing.JTextField();
        singleRadio = new javax.swing.JRadioButton();
        MultipleRadio = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ManualRadio = new javax.swing.JRadioButton();
        SemiRadio = new javax.swing.JRadioButton();
        ElectricButton = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        WardCombo = new javax.swing.JComboBox<>();
        AddBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bedTable = new javax.swing.JTable();
        viewBed = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        aboutBtn = new javax.swing.JButton();
        contactBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Left panel");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1012, 606));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setMinimumSize(new java.awt.Dimension(1042, 600));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Stencil", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Add Bed ");
        jLabel4.setToolTipText("");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(430, 10, 230, 49);

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("Ward number");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(220, 43, 190, 40);
//ward field
        wardField.setBackground(new java.awt.Color(0, 0, 0));
        wardField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        wardField.setForeground(new java.awt.Color(255, 255, 255));
        wardField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        wardField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(wardField);
        wardField.setBounds(220, 80, 170, 30);
//radio buttons for bed type
        singleRadio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        singleRadio.setText("Single");
        jPanel2.add(singleRadio);
        singleRadio.setBounds(220, 160, 100, 27);

        MultipleRadio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MultipleRadio.setText("Multiple");
        jPanel2.add(MultipleRadio);
        MultipleRadio.setBounds(220, 190, 110, 27);
//Adding labels
        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("Bed Size");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(220, 130, 110, 30);

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setText("Bed Type");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(220, 220, 130, 40);

        ManualRadio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ManualRadio.setText("Manual");
        jPanel2.add(ManualRadio);
        ManualRadio.setBounds(220, 250, 150, 27);

        SemiRadio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SemiRadio.setText("Semi Electric");
        jPanel2.add(SemiRadio);
        SemiRadio.setBounds(220, 280, 150, 27);

        ElectricButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ElectricButton.setText("Electric");
        jPanel2.add(ElectricButton);
        ElectricButton.setBounds(220, 310, 130, 27);

        jLabel8.setFont(new java.awt.Font("Perpetua Titling MT", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setText("Ward Type");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(220, 350, 130, 23);

        WardCombo.setBackground(new java.awt.Color(0, 0, 0));
        WardCombo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        WardCombo.setForeground(new java.awt.Color(204, 0, 0));
        WardCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Emergency", "Semi Special", "ICU", "CCU", "SICU", "Special", "Deluxe", "Super Deluxe", "BurnWard", "NICU", "PICU" }));
        WardCombo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 3, true));
        jPanel2.add(WardCombo);
        WardCombo.setBounds(220, 370, 170, 40);

        AddBtn.setBackground(new java.awt.Color(0, 255, 255));
        AddBtn.setFont(new java.awt.Font("Perpetua Titling MT", 3, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(153, 0, 51));
        AddBtn.setText("Add Bed");
        AddBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)), javax.swing.BorderFactory.createCompoundBorder()), null));
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AddBtn);
        AddBtn.setBounds(220, 430, 160, 50);

        bedTable.setBackground(new java.awt.Color(102, 102, 102));
        bedTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(255, 0, 51)));
        bedTable.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        bedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bed no.", "Ward no", "Bed Size", "Bed Type", "Ward Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        bedTable.setRowHeight(30);
        jScrollPane1.setViewportView(bedTable);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(460, 60, 530, 430);

        viewBed.setBackground(new java.awt.Color(0, 255, 255));
        viewBed.setFont(new java.awt.Font("Perpetua Titling MT", 3, 18)); // NOI18N
        viewBed.setText("View Bed");
        viewBed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0)));
        viewBed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBedActionPerformed(evt);
            }
        });
        jPanel2.add(viewBed);
        viewBed.setBounds(470, 510, 200, 50);

        deleteBtn.setBackground(new java.awt.Color(0, 255, 255));
        deleteBtn.setFont(new java.awt.Font("Perpetua Titling MT", 3, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(51, 0, 102));
        deleteBtn.setText("Delete Bed");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(deleteBtn);
        deleteBtn.setBounds(760, 510, 190, 50);

        backBtn.setBackground(new java.awt.Color(51, 255, 255));
        backBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/back button.png"))); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 5));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel2.add(backBtn);
        backBtn.setBounds(840, 0, 150, 50);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/iccon.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("HMS");

        homeBtn.setBackground(new java.awt.Color(0, 0, 0));
        homeBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 153, 0));
        homeBtn.setText("HOME");
        homeBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 204), 3, true));

        aboutBtn.setBackground(new java.awt.Color(0, 0, 0));
        aboutBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        aboutBtn.setForeground(new java.awt.Color(255, 153, 0));
        aboutBtn.setText("About Us");
        aboutBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 3, true));
        aboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBtnActionPerformed(evt);
            }
        });

        contactBtn.setBackground(new java.awt.Color(0, 0, 0));
        contactBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        contactBtn.setForeground(new java.awt.Color(255, 153, 0));
        contactBtn.setText("Contact Us");
        contactBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        profileBtn.setBackground(new java.awt.Color(0, 0, 0));
        profileBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        profileBtn.setForeground(new java.awt.Color(255, 153, 0));
        profileBtn.setText("My Profile");
        profileBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 3, true));
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(0, 0, 0));
        logoutBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 153, 0));
        logoutBtn.setText("Log Out");
        logoutBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 3, true));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(contactBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contactBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(aboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 170, 600);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/AddBed.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1010, 600);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:

        int ward_no = Integer.parseInt(wardField.getText());
        String size = null;;
        if(singleRadio.isSelected()){
            size = "single";
        }else if(MultipleRadio.isSelected()){
            size = "multiple";
        }

        String type = null;
        if(ManualRadio.isSelected()){
            type = "manual";
        }else if(SemiRadio.isSelected()){
            type="semi-electric";

        }else if(ElectricButton.isSelected()){
            type="electric";
        }
        String wardType = null;
        Object selectedItem = WardCombo.getSelectedItem();
        if (selectedItem != null) {
            wardType = selectedItem.toString();

        }

        try {

            Bed b1 = new Bed(0, ward_no, type, size, wardType);
            // Bed b1 = new Bed(0, Integer.parseInt(wardField.getText()), , "42 inch", "General");
            BedController bc= new BedController();
            int result = bc.insertdetails(b1);
            if(result>0){
                JOptionPane.showMessageDialog(null, "Bed Added Successfully");
                tableadd();
            }
            else{
                JOptionPane.showMessageDialog(null, "Bed can't be added");

            }

        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "e");

        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void viewBedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBedActionPerformed
        // TODO add your handling code here:
        view();
    }//GEN-LAST:event_viewBedActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        dispose();
        new viewAdminProfile().setVisible(true);
    }//GEN-LAST:event_profileBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed


    public void table(){
        try {
            Bed d1 = new Bed(0,0,null,null,null);
            BedController sc = new BedController();
            ResultSet result = sc.selectdetails(d1);
            while (result.next()) {
                int id = Integer.parseInt(result.getString(1));
                int ward_no = Integer.parseInt(result.getString(4));
                String bedtype = result.getString(2);
                String bedsize = result.getString(3);
                String wardtype = result.getString(5);
                Object[] row = { id,ward_no,bedsize,bedtype,wardtype };
                DefaultTableModel model = (DefaultTableModel) bedTable.getModel();
                model.addRow(row);
            }

        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void tableadd(){
        try {
            
            Bed d1 = new Bed(0,0,null,null,null);
            BedController sc = new BedController();
            ResultSet result = sc.selectdetails(d1);
            DefaultTableModel model = (DefaultTableModel) bedTable.getModel();
            model.setRowCount(0);
            while (result.next()) {
                int id = Integer.parseInt(result.getString(1));
                int ward_no = Integer.parseInt(result.getString(4));
                String bedtype = result.getString(2);
                String bedsize = result.getString(3);
                String wardtype = result.getString(5);
                Object[] row = { id,ward_no,bedsize,bedtype,wardtype };
                model.addRow(row);
                
            }
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void view(){
        int i = bedTable.getSelectedRow();
        if(i>0){

            TableModel model = bedTable.getModel();
            int id = Integer.parseInt(model.getValueAt(i, 0).toString());
            try {
                Bed b1 = new Bed(id, 0, null, null, null);
    
                BedController bc = new BedController();
                int out = bc.updatestatus(b1);
                int result = bc.changestatus(b1);
                dispose();
                viewBed v1 = new viewBed();
                v1.setVisible(true);
    
            } catch (Exception e) {
                // TODO: handle exception
                JOptionPane.showMessageDialog(null, e);
            }
        }else{
            JOptionPane.showMessageDialog(null, "No row selected");
        }

    }
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
            java.util.logging.Logger.getLogger(AddBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.ButtonGroup BedSize;
    private javax.swing.ButtonGroup BedType;
    private javax.swing.JRadioButton ElectricButton;
    private javax.swing.JRadioButton ManualRadio;
    private javax.swing.JRadioButton MultipleRadio;
    private javax.swing.JRadioButton SemiRadio;
    private javax.swing.JComboBox<String> WardCombo;
    private javax.swing.JButton aboutBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable bedTable;
    private javax.swing.JButton contactBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton profileBtn;
    private javax.swing.JRadioButton singleRadio;
    private javax.swing.JButton viewBed;
    private javax.swing.JTextField wardField;
    // End of variables declaration//GEN-END:variables
}
