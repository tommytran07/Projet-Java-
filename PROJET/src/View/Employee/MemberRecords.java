/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Employee;

import Controller.Flight;
import Controller.Ticket;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import projet.DriverConnection;

/**
 *
 * @author Tommy
 */
public class MemberRecords extends javax.swing.JFrame {

    /**
     * Creates new form MemberRecords
     */
    public MemberRecords() throws SQLException {
        initComponents();
        showRecordsInTable();
        setVisible(true);
    }

    public ArrayList<Ticket> getTicketList() throws SQLException {
        
        ArrayList<Ticket> ticketList = new ArrayList<Ticket>();
        
        try {
            Connection conn = DriverConnection.getConnection();
            String query = "SELECT * FROM `ticket`";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            Ticket ticket;
            
            while(rs.next()) {
                
                ticket = new Ticket(rs.getString("name"), rs.getString("flightno"), rs.getString("dcity"), rs.getString("acity"), rs.getString("ddate")
                        , rs.getString("dtime"), rs.getString("atime"), rs.getString("class"), Double.parseDouble(rs.getString("price")), Integer.parseInt(rs.getString("seats")));
                
                ticketList.add(ticket);
            }
        }
        
        catch (SQLException e) {
            e.printStackTrace();
        }
        
        return ticketList;
    }
    
    
    public void showRecordsInTable() throws SQLException 
    {
        
        ArrayList<Ticket> ticketList = getTicketList();
        DefaultTableModel model = new DefaultTableModel();
        
        model.setColumnIdentifiers(new Object[]{"Name", "Flight no", "Departure city", "Arrival city", "Departure date", "Departure time", "Arrival time", "Class", "Price", "Seats"});
        Object[] row = new Object[10];
        
        for (int i = 0; i < ticketList.size() ; i++) {
            
            row[0] = ticketList.get(i).getName();
            row[1] = ticketList.get(i).getFlightno();
            row[2] = ticketList.get(i).getDcity();
            row[3] = ticketList.get(i).getAcity();
            row[4] = ticketList.get(i).getDdate();
            row[5] = ticketList.get(i).getDtime();
            row[6] = ticketList.get(i).getAtime();
            row[7] = ticketList.get(i).getFclass();
            row[8] = ticketList.get(i).getPrice();
            row[9] = ticketList.get(i).getSeats();
            
            model.addRow(row);
        }
        jTable1.setModel(model);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Flight no", "Departure city", "Arrival city", "Departure date", "Departure time", "E.T.A", "Class", "Price", "Seats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MemberRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MemberRecords().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MemberRecords.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
