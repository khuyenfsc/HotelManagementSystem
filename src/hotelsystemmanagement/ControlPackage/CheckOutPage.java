

package hotelsystemmanagement.ControlPackage;

import hotelsystemmanagement.Connection.ConnectToDB;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class CheckOutPage extends javax.swing.JFrame {
    private ConnectToDB connectToDB = new ConnectToDB();
    private Connection connection;
    private List<String> idNumbers = new ArrayList<>();
    private KeyListener searchListener = new KeyListener(){
        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if('0' <= e.getKeyChar() && e.getKeyChar() <= '9' ){
                searchCustomer(idNumberInput.getText() + e.getKeyChar());
            }else if(e.getKeyCode() == 8){
                searchCustomer(idNumberInput.getText().substring(0, idNumberInput.getText().length() - 1));
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            
        }
        
    };

    
    public CheckOutPage() {
        initComponents();
        setBackground();
        setConnection();
        setIdNumbers();
        addSearchListenerToIdNumberInput();
        setDefaultCustomer();
    }
    
    private void setIdNumbers(){
        try {
            Statement selectStatement = connection.createStatement();
            ResultSet availableIdNumbers = selectStatement.executeQuery("SELECT id_number FROM customers WHERE check_in = 'Check-in'");
            
            idNumberChoices.removeAll();
            while(availableIdNumbers.next()){
                idNumbers.add(availableIdNumbers.getString("id_number"));
                idNumberChoices.add(availableIdNumbers.getString("id_number"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CheckOutPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setConnection(){
        connection = connectToDB.getCon();
        
    }
    
    private void setBackground(){
        getContentPane().setBackground(new Color(62,62,66));
        
        String imagePath = ".\\src\\hotelsystemmanagement\\Icons\\check_out.jpg";
        ImageIcon descriptionImage = new ImageIcon(imagePath);
        imageContainer.setIcon(descriptionImage);
    }
    
    private void searchCustomer(String idNumberCondition){
        idNumberChoices.removeAll();
        
        for(String idNumber : idNumbers){
            if(idNumber.indexOf(idNumberCondition) == 0){
                idNumberChoices.add(idNumber);
            }
        }
    }
    
    private void addSearchListenerToIdNumberInput(){
        idNumberInput.addKeyListener(searchListener);
    }
    
    private void setDefaultCustomer(){
        String currentNumer = idNumberChoices.getSelectedItem();
        System.out.println(currentNumer);
        updateCustomerInput(currentNumer);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();
        roomInfoContainer = new javax.swing.JLayeredPane();
        idNumberInput = new javax.swing.JTextField();
        idNumberChoices = new java.awt.Choice();
        nameLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        roomLabel = new javax.swing.JLabel();
        roomInput = new javax.swing.JTextField();
        checkOutButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        imageContainer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Check-out");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Check-out");

        numberLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        numberLabel.setForeground(new java.awt.Color(255, 255, 255));
        numberLabel.setText("Number");

        roomInfoContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idNumberInput.setActionCommand("<Not Set>");
        idNumberInput.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idNumberInput.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                idNumberInputComponentResized(evt);
            }
        });
        idNumberInput.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                idNumberInputCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                idNumberInputInputMethodTextChanged(evt);
            }
        });
        idNumberInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idNumberInputActionPerformed(evt);
            }
        });
        roomInfoContainer.add(idNumberInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 9, 145, 25));

        idNumberChoices.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                idNumberChoicesItemStateChanged(evt);
            }
        });
        roomInfoContainer.add(idNumberChoices, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 20));

        nameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name");

        nameInput.setEditable(false);

        roomLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        roomLabel.setForeground(new java.awt.Color(255, 255, 255));
        roomLabel.setText("Room Number");

        roomInput.setEditable(false);

        checkOutButton.setBackground(new java.awt.Color(102, 102, 102));
        checkOutButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkOutButton.setForeground(new java.awt.Color(255, 255, 255));
        checkOutButton.setText("Check-out");
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomInfoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(roomLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomInput, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addComponent(imageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(checkOutButton)
                        .addGap(75, 75, 75)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roomInfoContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkOutButton)
                    .addComponent(backButton))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idNumberInputComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_idNumberInputComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_idNumberInputComponentResized

    private void idNumberInputCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_idNumberInputCaretPositionChanged

    }//GEN-LAST:event_idNumberInputCaretPositionChanged

    private void idNumberInputInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_idNumberInputInputMethodTextChanged

    }//GEN-LAST:event_idNumberInputInputMethodTextChanged

    private void idNumberInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idNumberInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idNumberInputActionPerformed

    private void idNumberChoicesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_idNumberChoicesItemStateChanged
        String currentNumber = idNumberChoices.getSelectedItem();
                
        updateCustomerInput(currentNumber);
    }//GEN-LAST:event_idNumberChoicesItemStateChanged

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        new Control().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtonActionPerformed
        String currentIdNumber = idNumberChoices.getSelectedItem();
        int currentRoomNumber = Integer.parseInt(roomInput.getText());
        
        try {
            PreparedStatement updateCustomerStatement = connection.prepareStatement("UPDATE customers SET check_in = 'Check-out' WHERE id_number = ?");
            PreparedStatement updateRoomStatement = connection.prepareStatement("UPDATE rooms SET availability = 'available' WHERE room_number = ?");
            
            updateCustomerStatement.setString(1, currentIdNumber);
            updateRoomStatement.setInt(1, currentRoomNumber);
            updateRoomStatement.execute();
            updateCustomerStatement.execute();
            JOptionPane.showMessageDialog(null, "Check-out successfully!");
            
            setIdNumbers();
            
        } catch (SQLException ex) {
            Logger.getLogger(CheckOutPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkOutButtonActionPerformed

    private void updateCustomerInput(String currentNumber){
        idNumberInput.setText(currentNumber);
        
        try {
            PreparedStatement findCustomerWithID = connection.prepareStatement("SELECT full_name, room_number FROM customers WHERE id_number  = ?");
            
            findCustomerWithID.setString(1, currentNumber);
            findCustomerWithID.execute();
            ResultSet availableCustomer = findCustomerWithID.getResultSet();
            
            if(availableCustomer.next()){
                nameInput.setText(availableCustomer.getString("full_name"));
                roomInput.setText(availableCustomer.getString("room_number"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CheckOutPage.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(CheckOutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOutPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton checkOutButton;
    private java.awt.Choice idNumberChoices;
    private javax.swing.JTextField idNumberInput;
    private javax.swing.JLabel imageContainer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JLayeredPane roomInfoContainer;
    private javax.swing.JTextField roomInput;
    private javax.swing.JLabel roomLabel;
    // End of variables declaration//GEN-END:variables

}
