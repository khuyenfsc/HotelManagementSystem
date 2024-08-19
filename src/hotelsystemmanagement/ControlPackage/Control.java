

package hotelsystemmanagement.ControlPackage;


import hotelsystemmanagement.Home.HomePage;
import hotelsystemmanagement.Home.IntroductionPage;
import java.awt.Color;
import java.time.ZoneId;
import javax.swing.ImageIcon;


public class Control extends javax.swing.JFrame {
    private AddCustomerForm addCustomerForm;
    
    public Control() {
        initComponents();
        setBackground();
    }
    
    private void setBackground(){
        getContentPane().setBackground(new Color(62,62,66));
        
        String imagePath = ".\\src\\hotelsystemmanagement\\Icons\\control.png";
        ImageIcon descriptionImage = new ImageIcon(imagePath);
        imageContainer.setIcon(descriptionImage);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addCustomerButton = new javax.swing.JButton();
        roomsButton = new javax.swing.JButton();
        departmentButton = new javax.swing.JButton();
        employeesButton = new javax.swing.JButton();
        customersButton = new javax.swing.JButton();
        checkoutButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        imageContainer = new javax.swing.JLabel();
        updateRoomStatusButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Control");
        setResizable(false);

        addCustomerButton.setBackground(new java.awt.Color(102, 102, 102));
        addCustomerButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addCustomerButton.setForeground(new java.awt.Color(255, 255, 255));
        addCustomerButton.setText("New Customer");
        addCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButtonActionPerformed(evt);
            }
        });

        roomsButton.setBackground(new java.awt.Color(102, 102, 102));
        roomsButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        roomsButton.setForeground(new java.awt.Color(255, 255, 255));
        roomsButton.setText("Rooms");
        roomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsButtonActionPerformed(evt);
            }
        });

        departmentButton.setBackground(new java.awt.Color(102, 102, 102));
        departmentButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        departmentButton.setForeground(new java.awt.Color(255, 255, 255));
        departmentButton.setText("Departments");
        departmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentButtonActionPerformed(evt);
            }
        });

        employeesButton.setBackground(new java.awt.Color(102, 102, 102));
        employeesButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        employeesButton.setForeground(new java.awt.Color(255, 255, 255));
        employeesButton.setText("Employees info");
        employeesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesButtonActionPerformed(evt);
            }
        });

        customersButton.setBackground(new java.awt.Color(102, 102, 102));
        customersButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        customersButton.setForeground(new java.awt.Color(255, 255, 255));
        customersButton.setText("Customers Info");
        customersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersButtonActionPerformed(evt);
            }
        });

        checkoutButton.setBackground(new java.awt.Color(102, 102, 102));
        checkoutButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        checkoutButton.setForeground(new java.awt.Color(255, 255, 255));
        checkoutButton.setText("Check-out");
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });

        logOutButton.setBackground(new java.awt.Color(102, 102, 102));
        logOutButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(255, 255, 255));
        logOutButton.setText("Log out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        updateRoomStatusButton.setBackground(new java.awt.Color(102, 102, 102));
        updateRoomStatusButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        updateRoomStatusButton.setForeground(new java.awt.Color(255, 255, 255));
        updateRoomStatusButton.setText("Update Roon Status");
        updateRoomStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRoomStatusButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(102, 102, 102));
        backButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(addCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(departmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(employeesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roomsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateRoomStatusButton, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                        .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(checkoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addComponent(imageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(imageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(addCustomerButton)
                .addGap(23, 23, 23)
                .addComponent(roomsButton)
                .addGap(23, 23, 23)
                .addComponent(departmentButton)
                .addGap(23, 23, 23)
                .addComponent(employeesButton)
                .addGap(23, 23, 23)
                .addComponent(customersButton)
                .addGap(18, 18, 18)
                .addComponent(checkoutButton)
                .addGap(18, 18, 18)
                .addComponent(updateRoomStatusButton)
                .addGap(18, 18, 18)
                .addComponent(logOutButton)
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerButtonActionPerformed
        addCustomerForm = new AddCustomerForm();
        addCustomerForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_addCustomerButtonActionPerformed

    private void roomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsButtonActionPerformed
        dispose();
        new RoomPage().setVisible(true);
    }//GEN-LAST:event_roomsButtonActionPerformed

    private void departmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentButtonActionPerformed
        dispose();
        new DepartmentPage().setVisible(true);
    }//GEN-LAST:event_departmentButtonActionPerformed

    private void employeesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesButtonActionPerformed
        dispose();
        new EmployeePage().setVisible(true);
    }//GEN-LAST:event_employeesButtonActionPerformed

    private void customersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersButtonActionPerformed
        dispose();
        new CustomerPage().setVisible(true);
    }//GEN-LAST:event_customersButtonActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
        dispose();
        new CheckOutPage().setVisible(true);
    }//GEN-LAST:event_checkoutButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        dispose();
        new IntroductionPage().setVisible(true);
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void updateRoomStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRoomStatusButtonActionPerformed
        dispose();
        new UpdateRoomPage().setVisible(true);
    }//GEN-LAST:event_updateRoomStatusButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Control().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JButton customersButton;
    private javax.swing.JButton departmentButton;
    private javax.swing.JButton employeesButton;
    private javax.swing.JLabel imageContainer;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton roomsButton;
    private javax.swing.JButton updateRoomStatusButton;
    // End of variables declaration//GEN-END:variables

}
