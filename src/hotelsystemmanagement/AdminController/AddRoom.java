

package hotelsystemmanagement.AdminController;

import hotelsystemmanagement.Connection.ConnectToDB;
import hotelsystemmanagement.Home.HomePage;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class AddRoom extends javax.swing.JFrame {

    
    private ConnectToDB connectToDB = new ConnectToDB();
    private Connection connection;
    
    public AddRoom() {
        initComponents();
        setBackground();
        setConnection();
        addChoicesToAvailabilityChoices();
        addChoicesToCleanStatusChoices();
        addChoicesToRoomTypeChoices();
    }

    private void setBackground(){
        getContentPane().setBackground(new Color(62,62,66));
        
        String imagePath = ".\\src\\hotelsystemmanagement\\Icons\\room_update.jpg";
        ImageIcon descriptionImage = new ImageIcon(imagePath);
        imageContainer.setIcon(descriptionImage);
    }
    
    private void setConnection(){
        connection = connectToDB.getCon();
    }
    
    private void addChoicesToAvailabilityChoices(){
        availabilityChoices.add("available");
        availabilityChoices.add("unavailable");
    }
    
    private void addChoicesToCleanStatusChoices(){
        cleanStatusChoices.add("cleaned");
        cleanStatusChoices.add("dirty");
    }
    
    private void addChoicesToRoomTypeChoices(){
        roomTypeChoices.add("Single Bed");
        roomTypeChoices.add("Double Bed");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roomNumberLabel = new javax.swing.JLabel();
        priceInput = new hotelsystemmanagement.ControlPackage.MyTextField();
        availabilityLabel = new javax.swing.JLabel();
        availabilityChoices = new java.awt.Choice();
        cleanStatusLabel = new javax.swing.JLabel();
        cleanStatusChoices = new java.awt.Choice();
        priceLabel = new javax.swing.JLabel();
        roomNumberInput1 = new hotelsystemmanagement.ControlPackage.MyTextField();
        imageContainer = new javax.swing.JLabel();
        cleanStatusLabel1 = new javax.swing.JLabel();
        roomTypeChoices = new java.awt.Choice();
        saveButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Room");
        setResizable(false);

        roomNumberLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        roomNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        roomNumberLabel.setText("Room Number");

        availabilityLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        availabilityLabel.setForeground(new java.awt.Color(255, 255, 255));
        availabilityLabel.setText("Availability");

        cleanStatusLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cleanStatusLabel.setForeground(new java.awt.Color(255, 255, 255));
        cleanStatusLabel.setText("Clean Status");

        priceLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(255, 255, 255));
        priceLabel.setText("Price");

        cleanStatusLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cleanStatusLabel1.setForeground(new java.awt.Color(255, 255, 255));
        cleanStatusLabel1.setText("Room Type");

        saveButton.setBackground(new java.awt.Color(102, 102, 102));
        saveButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(availabilityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roomNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cleanStatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(55, 55, 55))
                        .addComponent(priceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cleanStatusLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(priceInput, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(availabilityChoices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cleanStatusChoices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roomNumberInput1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(roomTypeChoices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(imageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roomNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomNumberInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(availabilityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(availabilityChoices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cleanStatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cleanStatusChoices, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(imageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cleanStatusLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomTypeChoices, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(backButton))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if("".equals(roomNumberInput1.getText())){
            JOptionPane.showMessageDialog(null, "Miss Room Number!");
            return;
        }
        if("".equals(priceInput.getText())){
            JOptionPane.showMessageDialog(null, "Miss Price!");
            return;
        }
        
        int roomNumber = Integer.parseInt(roomNumberInput1.getText());
        String availability = availabilityChoices.getSelectedItem();
        String cleanStatus = cleanStatusChoices.getSelectedItem();
        double price = Double.parseDouble(priceInput.getText());
        String roomType = roomTypeChoices.getSelectedItem();
        
        
        try {
            PreparedStatement findStatement = connection.prepareStatement("SELECT * FROM rooms WHERE room_number = ?");
            
            findStatement.setInt(1, roomNumber);
            findStatement.execute();
            ResultSet employee = findStatement.getResultSet();
            if(employee.next()){
                JOptionPane.showMessageDialog(null, "Room already exist!");
                return;
            }
            
            PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO rooms VALUES(?, ?, ?, ?, ?)");

            insertStatement.setInt(1, roomNumber);
            insertStatement.setString(2, availability);
            insertStatement.setString(3, cleanStatus);
            insertStatement.setDouble(4, price);
            insertStatement.setString(5, roomType);
            
            insertStatement.execute();
            sortRoomByRoomNumber();
            JOptionPane.showMessageDialog(null, "Add room successfully!");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed
    
    
    private void sortRoomByRoomNumber(){
        try {
            Statement sortStatement = connection.createStatement();
            
            sortStatement.execute("ALTER TABLE rooms ORDER BY room_number ASC");
        } catch (SQLException ex) {
            Logger.getLogger(AddRoom.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice availabilityChoices;
    private javax.swing.JLabel availabilityLabel;
    private javax.swing.JButton backButton;
    private java.awt.Choice cleanStatusChoices;
    private javax.swing.JLabel cleanStatusLabel;
    private javax.swing.JLabel cleanStatusLabel1;
    private javax.swing.JLabel imageContainer;
    private hotelsystemmanagement.ControlPackage.MyTextField priceInput;
    private javax.swing.JLabel priceLabel;
    private hotelsystemmanagement.ControlPackage.MyTextField roomNumberInput1;
    private javax.swing.JLabel roomNumberLabel;
    private java.awt.Choice roomTypeChoices;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables

}
