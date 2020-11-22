/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Member;

import View.Member.MainPage;
import Controller.Flight;
import Controller.Member;
import Controller.Ticket;
import Model.FlightDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projet.DriverConnection;

/**
 *
 * @author Tommy
 */
public class ViewFlights extends javax.swing.JFrame {
    private Member user;
    /**
     * Creates new form ViewFlights
     */
    public ViewFlights(Member user) throws SQLException {
        this.user = user;
        initComponents();        
        showFlightInTable();
        setVisible(true);
    }
    
    public ArrayList<Flight> getFlightList() throws SQLException {
        
        ArrayList<Flight> flightList = new ArrayList<Flight>();
        
        try {
            Connection conn = DriverConnection.getConnection();
            String query = "SELECT * FROM `flights`";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            Flight flight;
            
            while(rs.next()) {
                
                flight = new Flight(rs.getString("dcity"), rs.getString("acity"), rs.getString("ddate"), rs.getString("adate"), Integer.parseInt(rs.getString("flightno"))
                        , rs.getString("dtime"), rs.getString("atime"), Double.parseDouble(rs.getString("price")), rs.getString("class"));
                
                flightList.add(flight);
            }
        }
        
        catch (SQLException e) {
            e.printStackTrace();
        }
        
        return flightList;
    }
    
    public void showFlightInTable() throws SQLException 
    {
        ArrayList<Flight> flightList = getFlightList();
        DefaultTableModel model = new DefaultTableModel();
               // (DefaultTableModel)jTable1.getModel();
        
         model.setColumnIdentifiers(new Object[]{"Flight no", "Departure city", "Arrival city", "Departure date", "Arrival date", "Departure time", "Arrival time", "Price", "Class"});
        Object[] row = new Object[9];
        
        for (int i = 0; i < flightList.size() ; i++) {
            
            row[0] = flightList.get(i).getFlightno();
            row[1] = flightList.get(i).getDcity();
            row[2] = flightList.get(i).getAcity();
            row[3] = flightList.get(i).getDdate();
            row[4] = flightList.get(i).getAdate();
            row[5] = flightList.get(i).getDtime();
            row[6] = flightList.get(i).getAtime();
            row[7] = flightList.get(i).getPrice();
            row[8] = flightList.get(i).getFclass();
            
            model.addRow(row);
        }
        jTable1.setModel(model);
    }
    
    public void executeSQLQuery(String query, String message) {
        Connection con = DriverConnection.getConnection();
        Statement stmt;
        
        try {
            stmt = con.createStatement();
            if ((stmt.executeUpdate(query)) == 1) {
                JOptionPane.showMessageDialog(null, "Data "+message+ " successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Data not" +message);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
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
        BackBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        BackBtn.setBackground(new java.awt.Color(255, 153, 0));
        BackBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BackBtn.setText("BACK");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackBtn);
        BackBtn.setBounds(20, 30, 140, 50);

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 204, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight no", "To", "From", "Depart", "Return", "Departure time", "Arrival time", "Price", "Class"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(102, 102, 102));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(80, 140, 780, 380);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/fond_colore.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1239, 895);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        if(user == null) {
            new MainPage();
        }
        else {
        new MainPage(this.user);
        }
        dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ViewFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    */
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
            //public void run() {
                //try {
                   // new ViewFlights(this.user);
                            
               // } catch (SQLException ex) {
                 //   ex.printStackTrace();
              //  }
           // }
       // });
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    

    
}
