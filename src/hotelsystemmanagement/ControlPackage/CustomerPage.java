

package hotelsystemmanagement.ControlPackage;

import hotelsystemmanagement.Connection.ConnectToDB;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class CustomerPage extends javax.swing.JFrame {
    private ConnectToDB connectToDB = new ConnectToDB();
    private Connection connection;
    private DefaultTableModel customerTableModel;
    
    public CustomerPage() {
        initComponents();
        setBackground();
        setCustomerTable();
        setCheckInChoices();
    }
    
    private void setBackground(){
        getContentPane().setBackground(new Color(62,62,66));
    }

    private void setCustomerTable(){
        customerTable.setOpaque(true);
        customerTable.setFillsViewportHeight(true);
        customerTable.setBackground(new Color(62,62,66));
        
        DefaultTableCellRenderer head_render = new DefaultTableCellRenderer();
        head_render.setBackground(new Color(62,62,66));
        customerTable.getTableHeader().setDefaultRenderer(head_render);
    }
    
    private void setCheckInChoices(){
        checkInChoices.add("All");
        checkInChoices.add("Check-in");
        checkInChoices.add("Check-out");
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollForTable = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        loadButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        idNumberInput = new javax.swing.JTextField();
        idNumberLabel = new javax.swing.JLabel();
        checkInChoices = new java.awt.Choice();
        filterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer");
        setResizable(false);

        ScrollForTable.setBorder(null);

        customerTable.setForeground(new java.awt.Color(255, 255, 255));
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Number", "Name", "Gender", "Country", "Room Type", "Room Number", "Check-in Status", "Deposit", "Check-in/out Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerTable.setColumnSelectionAllowed(true);
        customerTable.setGridColor(new java.awt.Color(255, 255, 255));
        customerTable.setShowGrid(true);
        customerTable.getTableHeader().setReorderingAllowed(false);
        ScrollForTable.setViewportView(customerTable);
        customerTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (customerTable.getColumnModel().getColumnCount() > 0) {
            customerTable.getColumnModel().getColumn(0).setResizable(false);
            customerTable.getColumnModel().getColumn(1).setResizable(false);
            customerTable.getColumnModel().getColumn(2).setResizable(false);
            customerTable.getColumnModel().getColumn(3).setResizable(false);
            customerTable.getColumnModel().getColumn(4).setResizable(false);
            customerTable.getColumnModel().getColumn(5).setResizable(false);
            customerTable.getColumnModel().getColumn(6).setResizable(false);
            customerTable.getColumnModel().getColumn(7).setResizable(false);
            customerTable.getColumnModel().getColumn(8).setResizable(false);
            customerTable.getColumnModel().getColumn(9).setResizable(false);
        }

        loadButton.setBackground(new java.awt.Color(102, 102, 102));
        loadButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loadButton.setForeground(new java.awt.Color(255, 255, 255));
        loadButton.setText("Load");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(102, 102, 102));
        backButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customers");

        nameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name");

        idNumberInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idNumberInputActionPerformed(evt);
            }
        });

        idNumberLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        idNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        idNumberLabel.setText("ID Number");

        filterButton.setBackground(new java.awt.Color(102, 102, 102));
        filterButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        filterButton.setForeground(new java.awt.Color(255, 255, 255));
        filterButton.setText("Filter");
        filterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollForTable)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(557, 557, 557)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addComponent(checkInChoices, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(filterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(filterButton)
                                .addGap(53, 53, 53)))
                        .addComponent(ScrollForTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backButton)
                            .addComponent(loadButton))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(checkInChoices, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        new Control().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        connection = connectToDB.getCon();
        customerTableModel = (DefaultTableModel) customerTable.getModel();
        customerTableModel.setRowCount(0);
        
        try {
            Statement selectStatement = connection.createStatement();
            
            ResultSet customers = selectStatement.executeQuery("SELECT * FROM customers");
            addRowToCustomerTable(customers);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loadButtonActionPerformed

    private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInputActionPerformed

    private void idNumberInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idNumberInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idNumberInputActionPerformed

    private void filterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterButtonActionPerformed
        connection = connectToDB.getCon();
        customerTableModel = (DefaultTableModel) customerTable.getModel();
        customerTableModel.setRowCount(0);
        
        PreparedStatement selectStatement = getStatement();
        customerTableModel.setRowCount(0);
        
        try {
            selectStatement.execute();
            ResultSet customers = selectStatement.getResultSet();
            addRowToCustomerTable(customers);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_filterButtonActionPerformed

    private PreparedStatement getStatement(){
        String checkInCondition = checkInChoices.getSelectedItem();
        String nameCondition = nameInput.getText();
        String idNumberCondition = idNumberInput.getText();
        PreparedStatement selectStatement  = null;
        
        if(checkInCondition == "All"){
            try {
                selectStatement = connection.prepareStatement("SELECT * FROM customers WHERE full_name LIKE ? AND id_number LIKE ?");
                
                selectStatement.setString(1, "%" + nameCondition + "%");
                selectStatement.setString(2, idNumberCondition + "%");
                System.out.println("\"%" + nameCondition + "%\"");
                System.out.println("\"" + idNumberCondition + "%\"");
            } catch (SQLException ex) {
                Logger.getLogger(CustomerPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                selectStatement = connection.prepareStatement("SELECT * FROM customers WHERE full_name like ? AND id_number LIKE ? AND check_in = ?");
                
                selectStatement.setString(1, "%" + nameCondition + "%");
                selectStatement.setString(2, idNumberCondition + "%");
                selectStatement.setString(3, checkInCondition);
            } catch (SQLException ex) {
                Logger.getLogger(CustomerPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return selectStatement;
    }
    
    private void addRowToCustomerTable(ResultSet customers){
        System.out.println("Hello");
        try {
            while(customers.next()){
                String id = customers.getString("id_type");
                String number = customers.getString("id_number");
                String name = customers.getString("full_name");
                String gender = customers.getString("gender");
                String country = customers.getString("country");
                String roomType = customers.getString("room_type");
                int roomNumber = customers.getInt("room_number");
                String checkInStatus = customers.getString("check_in");
                Double deposit = customers.getDouble("deposit");
                Timestamp checkInOrOutTime = customers.getTimestamp("check_in_out_time");
                
                customerTableModel.addRow(new Object[]{id, number, name, gender, country, roomType, roomNumber, checkInStatus, deposit, checkInOrOutTime});
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerPage.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollForTable;
    private javax.swing.JButton backButton;
    private java.awt.Choice checkInChoices;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton filterButton;
    private javax.swing.JTextField idNumberInput;
    private javax.swing.JLabel idNumberLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loadButton;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables

}
