

package hotelsystemmanagement.ControlPackage;

import hotelsystemmanagement.Connection.ConnectToDB;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class EmployeePage extends javax.swing.JFrame {
    private ConnectToDB connectToDB = new ConnectToDB();
    private Connection connection;
    private DefaultTableModel employeeTableModel;
    
    public EmployeePage() {
        initComponents();
        setBackground();
        setEmployeeTable();
        setJobChoices();
    }
    
    private void setBackground(){
        getContentPane().setBackground(new Color(62,62,66));
    }
    
    private void setEmployeeTable(){
        employeeTable.setOpaque(true);
        employeeTable.setFillsViewportHeight(true);
        employeeTable.setBackground(new Color(62,62,66));
        
        DefaultTableCellRenderer head_render = new DefaultTableCellRenderer();
        head_render.setBackground(new Color(62,62,66));
        employeeTable.getTableHeader().setDefaultRenderer(head_render);
        
    }
    
    private void setJobChoices(){
        jobChoices.add("All");
        jobChoices.add("Front Desk Clerk");
        jobChoices.add("Porter");
        jobChoices.add("Housekeeping");
        jobChoices.add("Kitchen staff");
        jobChoices.add("Room Service");
        jobChoices.add("Waiter/Waitress");
        jobChoices.add("Manager");
        jobChoices.add("Accountant");
        jobChoices.add("Chef");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollForTable = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        loadButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jobChoices = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Employee");
        setResizable(false);

        ScrollForTable.setBorder(null);

        employeeTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        employeeTable.setForeground(new java.awt.Color(255, 255, 255));
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Gender", "Job", "Salary", "Phone", "ID", "Gmail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeeTable.setColumnSelectionAllowed(true);
        employeeTable.setGridColor(new java.awt.Color(255, 255, 255));
        employeeTable.setShowGrid(true);
        ScrollForTable.setViewportView(employeeTable);
        employeeTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (employeeTable.getColumnModel().getColumnCount() > 0) {
            employeeTable.getColumnModel().getColumn(0).setResizable(false);
            employeeTable.getColumnModel().getColumn(1).setResizable(false);
            employeeTable.getColumnModel().getColumn(2).setResizable(false);
            employeeTable.getColumnModel().getColumn(4).setResizable(false);
            employeeTable.getColumnModel().getColumn(5).setResizable(false);
            employeeTable.getColumnModel().getColumn(6).setResizable(false);
            employeeTable.getColumnModel().getColumn(7).setResizable(false);
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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Job");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employees");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jobChoices, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(304, Short.MAX_VALUE))
            .addComponent(ScrollForTable)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jobChoices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(ScrollForTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadButton)
                    .addComponent(backButton))
                .addGap(22, 22, 22))
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
        employeeTableModel = (DefaultTableModel) employeeTable.getModel();
        employeeTableModel.setRowCount(0);
        
        try {
            PreparedStatement selectStatement = getStatement();
            
            selectStatement.execute();
            ResultSet employees = selectStatement.getResultSet();
            while(employees.next()){
                String name = employees.getString("name");
                int age = employees.getInt("age");
                String gender = employees.getString("gender");
                String job = employees.getString("job");
                double salary = employees.getDouble("salary");
                String phone = employees.getString("phone");
                String id = employees.getString("id");
                String email = employees.getString("email");
                
                employeeTableModel.addRow(new Object[]{name, age, gender, job, salary, phone, id, email});
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loadButtonActionPerformed
    
    private PreparedStatement getStatement(){
        String jobCondition = jobChoices.getSelectedItem();
        PreparedStatement selectStatement = null;
        
        if(jobCondition == "All"){
            try {
                selectStatement = connection.prepareStatement("SELECT * FROM employees");    
            } catch (SQLException ex) {
                Logger.getLogger(EmployeePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                selectStatement = connection.prepareStatement("SELECT * FROM employees WHERE job = ?");
                selectStatement.setString(1, jobCondition);
            } catch (SQLException ex) {
                Logger.getLogger(EmployeePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return selectStatement;
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
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollForTable;
    private javax.swing.JButton backButton;
    private javax.swing.JTable employeeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Choice jobChoices;
    private javax.swing.JButton loadButton;
    // End of variables declaration//GEN-END:variables

}


