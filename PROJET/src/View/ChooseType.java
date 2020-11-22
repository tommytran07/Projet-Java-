/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.Employee.LoginEmployee;
import View.Member.Login;

/**
 *
 * @author serena
 */
public class ChooseType extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public ChooseType() {
        initComponents();
        setVisible(true);
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
        CustomerBtn = new javax.swing.JButton();
        EmployeeBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        CustomerBtn.setBackground(new java.awt.Color(255, 153, 0));
        CustomerBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CustomerBtn.setText("CUSTOMER");
        CustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CustomerBtn);
        CustomerBtn.setBounds(320, 180, 240, 100);

        EmployeeBtn.setBackground(new java.awt.Color(255, 153, 0));
        EmployeeBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EmployeeBtn.setText("EMPLOYEE");
        EmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(EmployeeBtn);
        EmployeeBtn.setBounds(320, 310, 240, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/map.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 510, 350);

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/fond_colore.png"))); // NOI18N
        jLabel1.setText(" ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 910, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerBtnActionPerformed
        // TODO add your handling code here:
        new Login();
        dispose();
               
    }//GEN-LAST:event_CustomerBtnActionPerformed

    private void EmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeBtnActionPerformed
        // TODO add your handling code here:
        new LoginEmployee();
        dispose();
    }//GEN-LAST:event_EmployeeBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustomerBtn;
    private javax.swing.JButton EmployeeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
