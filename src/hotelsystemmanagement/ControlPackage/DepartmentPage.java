

package hotelsystemmanagement.ControlPackage;

import java.awt.Color;
import javax.swing.table.DefaultTableCellRenderer;
import hotelsystemmanagement.Connection.ConnectToDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class DepartmentPage extends javax.swing.JFrame {
    private ConnectToDB connectToDB = new ConnectToDB();
    private Connection connection;
    private DefaultTableModel departmentTableModel;
    
    public DepartmentPage() {
        initComponents();
        setBackground();
        setDepartmentTable();
    }
    
    private void setBackground(){
        getContentPane().setBackground(new Color(62,62,66));
    }
    
    private void setDepartmentTable(){
        departmentTable.setOpaque(true);
        departmentTable.setFillsViewportHeight(true);
        departmentTable.setBackground(new Color(62,62,66));
        
        DefaultTableCellRenderer header_render = new DefaultTableCellRenderer();
        header_render.setBackground(new Color(62,62,66));
        departmentTable.getTableHeader().setDefaultRenderer(header_render);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollForTable = new javax.swing.JScrollPane();
        departmentTable = new javax.swing.JTable();
        loadButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Department");
        setResizable(false);

        ScrollForTable.setBorder(null);

        departmentTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        departmentTable.setForeground(new java.awt.Color(255, 255, 255));
        departmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Department", "Budget"
            }
        ));
        departmentTable.setColumnSelectionAllowed(true);
        departmentTable.setGridColor(new java.awt.Color(255, 255, 255));
        departmentTable.setShowGrid(true);
        ScrollForTable.setViewportView(departmentTable);
        departmentTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollForTable, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ScrollForTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadButton)
                    .addComponent(backButton))
                .addGap(0, 32, Short.MAX_VALUE))
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
        departmentTableModel = (DefaultTableModel) departmentTable.getModel();
        departmentTableModel.setRowCount(0);
        
        try {
            Statement selectStatement = connection.createStatement();
            departmentTableModel = (DefaultTableModel) departmentTable.getModel();
            
            ResultSet departments = selectStatement.executeQuery("SELECT * FROM departments");
            while(departments.next()){
                String departmentName = departments.getString("department_name");
                double budget = departments.getDouble("budget");
                
                departmentTableModel.addRow(new Object[]{departmentName, budget});
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loadButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DepartmentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepartmentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepartmentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepartmentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepartmentPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollForTable;
    private javax.swing.JButton backButton;
    private javax.swing.JTable departmentTable;
    private javax.swing.JButton loadButton;
    // End of variables declaration//GEN-END:variables

}
