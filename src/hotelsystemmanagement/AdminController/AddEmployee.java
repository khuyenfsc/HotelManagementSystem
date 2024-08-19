

package hotelsystemmanagement.AdminController;

import hotelsystemmanagement.Connection.ConnectToDB;
import hotelsystemmanagement.Home.HomePage;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class AddEmployee extends javax.swing.JFrame {
    private ConnectToDB connectToDB = new ConnectToDB();
    private Connection connection;
    
    public AddEmployee() {
        initComponents();
        setBackground();
        addChoicesToJobChoices();
        setConnection();
        setActionCommandForGenderRadioButton();
    }
    
    private void setBackground(){
        getContentPane().setBackground(new Color(62,62,66));
        
        String imagePath = ".\\src\\hotelsystemmanagement\\Icons\\employees.png";
        ImageIcon descriptionImage = new ImageIcon(imagePath);
        imageContainer.setIcon(descriptionImage);
    }
    
    private void addChoicesToJobChoices(){
        jobChoices.add("Front Desk Clerks");
        jobChoices.add("Porters");
        jobChoices.add("Housekeeping");
        jobChoices.add("Kitchen Staff");
        jobChoices.add("Room Service");
        jobChoices.add("Waiter/Waitress");
        jobChoices.add("Manager");
        jobChoices.add("Accountant");
        jobChoices.add("Chef");
    }
    
    private void setConnection(){
        connection = connectToDB.getCon();
    }
    
    private void setActionCommandForGenderRadioButton(){
        maleRadioButton.setActionCommand("Male");
        femaleRadioButton.setActionCommand("Female");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        nameLabel = new javax.swing.JLabel();
        nameInput = new hotelsystemmanagement.ControlPackage.MyTextField();
        ageLabel = new javax.swing.JLabel();
        ageInput = new hotelsystemmanagement.ControlPackage.MyTextField();
        genderLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        jobLabel = new javax.swing.JLabel();
        jobChoices = new java.awt.Choice();
        salaryLabel = new javax.swing.JLabel();
        salaryInput = new hotelsystemmanagement.ControlPackage.MyTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneInput = new hotelsystemmanagement.ControlPackage.MyTextField();
        idLabel = new javax.swing.JLabel();
        idInput = new hotelsystemmanagement.ControlPackage.MyTextField();
        emailLabel = new javax.swing.JLabel();
        emailInput = new hotelsystemmanagement.ControlPackage.MyTextField();
        saveButton = new javax.swing.JButton();
        imageContainer = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Empployee");
        setResizable(false);

        nameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name");

        ageLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ageLabel.setText("Age");

        genderLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setText("Gender");

        genderGroup.add(maleRadioButton);
        maleRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        maleRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        maleRadioButton.setText("Male");

        genderGroup.add(femaleRadioButton);
        femaleRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        femaleRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        femaleRadioButton.setText("Female");

        jobLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jobLabel.setForeground(new java.awt.Color(255, 255, 255));
        jobLabel.setText("Job");

        salaryLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salaryLabel.setForeground(new java.awt.Color(255, 255, 255));
        salaryLabel.setText("Salary");

        phoneLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneLabel.setText("Phone");

        idLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText("ID");

        emailLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");

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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(nameInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ageInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(phoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(salaryInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(maleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(femaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jobChoices, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(imageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maleRadioButton)
                            .addComponent(femaleRadioButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jobLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(jobChoices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salaryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(backButton))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if("".equals(nameInput.getText())){
            JOptionPane.showMessageDialog(null, "Miss Name!");
            return;
        }
        if("".equals(ageInput.getText())){
            JOptionPane.showMessageDialog(null, "Miss Age!");
            return;
        }
        if(genderGroup.getSelection() == null){
            JOptionPane.showMessageDialog(null, "Miss Gender!");
            return;
        }
        if("".equals(salaryInput.getText())){
            JOptionPane.showMessageDialog(null, "Miss Salary!");
            return;
        }
        if("".equals(phoneInput.getText())){
            JOptionPane.showMessageDialog(null, "Miss Phone!");
            return;
        }
 
        if("".equals(idInput.getText())){
            JOptionPane.showMessageDialog(null, "Miss ID!");
            return;
        }
        
        if("".equals(emailInput.getText())){
            JOptionPane.showMessageDialog(null, "Miss email!");
            return;
        }
        
        String name = nameInput.getText();
        int age = Integer.parseInt(ageInput.getText());
        String gender = genderGroup.getSelection().getActionCommand();
        String job = jobChoices.getSelectedItem();
        double salary = Double.parseDouble(salaryInput.getText());
        String phone = phoneInput.getText();
        String id = idInput.getText();
        String email = emailInput.getText();
        
        try {
            PreparedStatement findStatement = connection.prepareStatement("SELECT * FROM employees WHERE id = ?");
            
            findStatement.setString(1, id);
            findStatement.execute();
            ResultSet employee = findStatement.getResultSet();
            if(employee.next()){
                JOptionPane.showMessageDialog(null, "Employee already exist!");
                return;
            }
            
            PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO employees VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
            
            insertStatement.setString(1, name);
            insertStatement.setInt(2, age);
            insertStatement.setString(3, gender);
            insertStatement.setString(4, job);
            insertStatement.setDouble(5, salary);
            insertStatement.setString(6, phone);
            insertStatement.setString(7, id);
            insertStatement.setString(8, email);
            
            insertStatement.execute();
            JOptionPane.showMessageDialog(null, "Add employee successfully!");
            
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private hotelsystemmanagement.ControlPackage.MyTextField ageInput;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton backButton;
    private hotelsystemmanagement.ControlPackage.MyTextField emailInput;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel genderLabel;
    private hotelsystemmanagement.ControlPackage.MyTextField idInput;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel imageContainer;
    private java.awt.Choice jobChoices;
    private javax.swing.JLabel jobLabel;
    private javax.swing.JRadioButton maleRadioButton;
    private hotelsystemmanagement.ControlPackage.MyTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private hotelsystemmanagement.ControlPackage.MyTextField phoneInput;
    private javax.swing.JLabel phoneLabel;
    private hotelsystemmanagement.ControlPackage.MyTextField salaryInput;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables

}
