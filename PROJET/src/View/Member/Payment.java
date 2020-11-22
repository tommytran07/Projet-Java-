/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Member;

import Controller.Member;
import Controller.Ticket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import projet.DriverConnection;

/**
 *
 * @author Tommy
 */
public class Payment extends javax.swing.JFrame {

    private final Member member;
    private final Ticket ticket;

    /**
     * Creates new form Payment
     */
    public Payment(Member member, Ticket ticket) {
        this.member = member;
        this.ticket = ticket;
        initComponents();
        setVisible(true);
    }

    public Payment() {
        this.member = null;
        this.ticket = null;
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
        payBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        payBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        payBtn.setText("Pay");
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );

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

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        // TODO add your handling code here:

        //SelectedFlight selectedFlight = new SelectedFlight(member);
        //double price = 0;

        try {
            
            
            /*
            String name = selectedFlight.customerName.getText();
            String flightno = selectedFlight.flightnoLabel.getText();
            String dcity = selectedFlight.dcityLabel.getText();
            String acity = selectedFlight.acityLabel.getText();
            String ddate = selectedFlight.ddateLabel.getText();
            String dtime = selectedFlight.dtimeLabel.getText();
            String atime = selectedFlight.atimeLabel.getText();
            String fclass = selectedFlight.fclassLabel.getText();
            if (!selectedFlight.txtTotal.getText().isEmpty()) {
                price = Double.parseDouble(selectedFlight.txtTotal.getText());
            }
             String seats = selectedFlight.txtSeats.getValue().toString();
            
           // Ticket ticket = new Ticket(name, flightno, dcity, acity, ddate, dtime, atime, fclass, price, Integer.parseInt(seats));
            /*
            ticket.setName(name);
            ticket.setFlightno(flightno);
            ticket.setDcity(dcity);
            ticket.setAcity(acity);
            ticket.setDdate(ddate);
            ticket.setDtime(dtime);
            ticket.setAtime(atime);
            ticket.setFclass(fclass);
*/
            
/*
           
            ticket.setSeats(Integer.parseInt(seats));
            ticket.setPrice(price);
*/
            Connection connection = DriverConnection.getConnection();


            PreparedStatement pst = connection.prepareStatement("INSERT INTO `ticket`(`name`, `flightno`, `dcity`, `acity`, `ddate`, `dtime`, `atime`, `class`, `price`, `seats`) VALUES "
                    + "('" + ticket.getName() + "','" + ticket.getFlightno() + "','" + ticket.getDcity() + "','" + ticket.getAcity() + "','" + ticket.getDdate() + "','" + ticket.getDtime() + "','" + ticket.getAtime() + "','" + ticket.getFclass() + "','" + ticket.getPrice() + "','" + ticket.getSeats() + "')");

            //PreparedStatement pst = connection.prepareStatement("INSERT INTO `ticket`(`name`, `flightno`, `dcity`, `acity`, `ddate`, `dtime`, `atime`, `class`, `price`, `seats`) VALUES (?,?,?,?,?,?,?,?,?,?) ");
            /*
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date dateStr = sdf.parse(ddate);
            java.sql.Date dateDB = new java.sql.Date(dateStr.getTime());
             */
 /*
             pst.setString(1, name);
             pst.setString(2,  flightno);
             pst.setString(3,  dcity);
             pst.setString(4,  acity);
             pst.setString(5,  ddate);
             pst.setString(6,  dtime);
             pst.setString(7,  atime);
             pst.setString(8, fclass );
             pst.setDouble(9, price );
             pst.setString(10, seats );
             */
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Ticket booked ! ");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_payBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        new SelectedFlight(this.member);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    // public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
 /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     */
    //</editor-fold>

    /* Create and display the form */
 /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton payBtn;
    // End of variables declaration//GEN-END:variables
}
