

package hotelsystemmanagement.ControlPackage;

import java.awt.Color;
import javax.swing.ImageIcon;
import hotelsystemmanagement.Connection.ConnectToDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class RoomPage extends javax.swing.JFrame {
    private ConnectToDB connectToDB = new ConnectToDB();
    private Connection connection;
    private DefaultTableModel roomTableModel;
    private String typeBed ;
    private String availabilityCondition;
    private String cleanStatusCondition;
    
    public RoomPage() {
        initComponents();
        setUpBackground();
        setRoomTable();
        addTypeToTypeBedChoices();
    }
    
    private void setUpBackground(){
        getContentPane().setBackground(new Color(62,62,66));
        
        String imagePath = ".\\src\\hotelsystemmanagement\\Icons\\hotel_room.jpg";
        ImageIcon desciptionImage = new ImageIcon(imagePath);
        ImageContainer.setIcon(desciptionImage);
    }
    
    private void setRoomTable(){
        roomTable.setOpaque(true);
        roomTable.setFillsViewportHeight(true);
        roomTable.setBackground(new Color(62,62,66));
        
       
        DefaultTableCellRenderer head_render = new DefaultTableCellRenderer(); 
        head_render.setBackground(new Color(62,62,66));
        roomTable.getTableHeader().setDefaultRenderer(head_render);
        
        
    }

    private void addTypeToTypeBedChoices(){
        typeBedChoices.add("All");
        typeBedChoices.add("Single Bed");
        typeBedChoices.add("Double Bed");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollForTable = new javax.swing.JScrollPane();
        roomTable = new javax.swing.JTable();
        loadButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        ImageContainer = new javax.swing.JLabel();
        typeBedChoices = new java.awt.Choice();
        availableCheck = new javax.swing.JRadioButton();
        cleanedCheck = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Room");
        setResizable(false);

        ScrollForTable.setBorder(null);

        roomTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        roomTable.setForeground(new java.awt.Color(255, 255, 255));
        roomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Availability", "Clean Status", "Price", "Bed Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        roomTable.setColumnSelectionAllowed(true);
        roomTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        roomTable.setGridColor(new java.awt.Color(204, 204, 204));
        roomTable.setInheritsPopupMenu(true);
        roomTable.setShowGrid(true);
        ScrollForTable.setViewportView(roomTable);
        roomTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (roomTable.getColumnModel().getColumnCount() > 0) {
            roomTable.getColumnModel().getColumn(0).setResizable(false);
            roomTable.getColumnModel().getColumn(1).setResizable(false);
            roomTable.getColumnModel().getColumn(2).setResizable(false);
            roomTable.getColumnModel().getColumn(3).setResizable(false);
            roomTable.getColumnModel().getColumn(4).setResizable(false);
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

        typeBedChoices.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typeBedChoicesItemStateChanged(evt);
            }
        });

        availableCheck.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        availableCheck.setForeground(new java.awt.Color(255, 255, 255));
        availableCheck.setText("Available");
        availableCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableCheckActionPerformed(evt);
            }
        });

        cleanedCheck.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cleanedCheck.setForeground(new java.awt.Color(255, 255, 255));
        cleanedCheck.setText("Cleaned");
        cleanedCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanedCheckActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new Color(62,62,66));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rooms");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ScrollForTable, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(typeBedChoices, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(availableCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cleanedCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGap(6, 6, 6)
                .addComponent(ImageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(ImageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeBedChoices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(availableCheck)
                                .addComponent(cleanedCheck)))
                        .addGap(40, 40, 40)
                        .addComponent(ScrollForTable, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadButton)
                    .addComponent(backButton))
                .addGap(43, 43, 43))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        connection = connectToDB.getCon();
        roomTableModel = (DefaultTableModel) roomTable.getModel();
        roomTableModel.setRowCount(0);

        PreparedStatement selectStatement = getStatement(connection);
        
        try {

            selectStatement.execute();
            ResultSet rooms = selectStatement.getResultSet();
            while(rooms.next()){
                int roomNumber = rooms.getInt("room_number");
                String availability = rooms.getString("availability");
                String cleanStatus = rooms.getString("clean_status");
                double price = rooms.getDouble("price");
                String roomType = rooms.getString("room_type");
                
                roomTableModel.addRow(new Object[]{roomNumber, availability, cleanStatus, price, roomType});
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoomPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_loadButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        new Control().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private PreparedStatement getStatement(Connection connection){
        typeBed = typeBedChoices.getSelectedItem();
        availabilityCondition = (availableCheck.isSelected()) ? "available" : "unavailable";
        cleanStatusCondition = (cleanedCheck.isSelected()) ? "cleaned" : "dirty";
        
        PreparedStatement selectStatement = null;
        
        if(typeBed == "All"){
            try {
                selectStatement = connection.prepareCall("SELECT * FROM rooms WHERE availability = ? AND clean_status = ?");
                
                selectStatement.setString(1, availabilityCondition);
                selectStatement.setString(2, cleanStatusCondition);
            } catch (SQLException ex) {
                Logger.getLogger(RoomPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else {
            try {
                selectStatement = connection.prepareCall("SELECT * FROM rooms WHERE room_type = ? AND availability = ? AND clean_status = ?");
                
                selectStatement.setString(1, typeBed);
                selectStatement.setString(2, availabilityCondition);
                selectStatement.setString(3, cleanStatusCondition);
            } catch (SQLException ex) {
                Logger.getLogger(RoomPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return selectStatement;
    }
    
    private void availableCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableCheckActionPerformed
        
             
    }//GEN-LAST:event_availableCheckActionPerformed

    private void typeBedChoicesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typeBedChoicesItemStateChanged
        
    }//GEN-LAST:event_typeBedChoicesItemStateChanged

    private void cleanedCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanedCheckActionPerformed
        
    }//GEN-LAST:event_cleanedCheckActionPerformed

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
            java.util.logging.Logger.getLogger(RoomPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageContainer;
    private javax.swing.JScrollPane ScrollForTable;
    private javax.swing.JRadioButton availableCheck;
    private javax.swing.JButton backButton;
    private javax.swing.JRadioButton cleanedCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loadButton;
    private javax.swing.JTable roomTable;
    private java.awt.Choice typeBedChoices;
    // End of variables declaration//GEN-END:variables

}
