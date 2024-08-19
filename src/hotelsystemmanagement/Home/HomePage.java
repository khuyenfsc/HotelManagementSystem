
package hotelsystemmanagement.Home;

import hotelsystemmanagement.AdminController.*;
import javax.swing.ImageIcon;
import hotelsystemmanagement.ControlPackage.Control;


public class HomePage extends javax.swing.JFrame {
    private Control control;

    public HomePage() {
        initComponents();
        setBackgroundImage();
    }

    private void setBackgroundImage(){
        String imagePath = ".\\src\\hotelsystemmanagement\\Icons\\home.jpg";
        ImageIcon backgroundImage = new ImageIcon(imagePath);
        
        background.setIcon(backgroundImage);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        receptionChoice = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        addEmployeeChoice = new javax.swing.JMenuItem();
        addRoomChoice = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setResizable(false);

        jMenu1.setForeground(new java.awt.Color(51, 51, 255));
        jMenu1.setText("HOTEL MANAGEMENT");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        receptionChoice.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        receptionChoice.setForeground(new java.awt.Color(0, 0, 0));
        receptionChoice.setText("RECEPTION");
        receptionChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receptionChoiceActionPerformed(evt);
            }
        });
        jMenu1.add(receptionChoice);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 0, 102));
        jMenu2.setText("ADMIN");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        addEmployeeChoice.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addEmployeeChoice.setForeground(new java.awt.Color(0, 0, 0));
        addEmployeeChoice.setText("ADD EMPLOYEE");
        addEmployeeChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeChoiceActionPerformed(evt);
            }
        });
        jMenu2.add(addEmployeeChoice);

        addRoomChoice.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addRoomChoice.setForeground(new java.awt.Color(0, 0, 0));
        addRoomChoice.setText("ADD ROOM");
        addRoomChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomChoiceActionPerformed(evt);
            }
        });
        jMenu2.add(addRoomChoice);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void receptionChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receptionChoiceActionPerformed
        dispose();
        control = new Control();
        control.setVisible(true);
    }//GEN-LAST:event_receptionChoiceActionPerformed

    private void addEmployeeChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeChoiceActionPerformed
        new AddEmployee().setVisible(true);
    }//GEN-LAST:event_addEmployeeChoiceActionPerformed

    private void addRoomChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomChoiceActionPerformed
        
    }//GEN-LAST:event_addRoomChoiceActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addEmployeeChoice;
    private javax.swing.JMenuItem addRoomChoice;
    private javax.swing.JLabel background;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem receptionChoice;
    // End of variables declaration//GEN-END:variables
}
