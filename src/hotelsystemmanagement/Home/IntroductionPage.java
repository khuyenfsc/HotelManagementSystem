


package hotelsystemmanagement.Home;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class IntroductionPage extends javax.swing.JFrame {

    
    public IntroductionPage() {
        initComponents();
        setUpBackgroud();
        displayTitle();
        
    }
    
    public void setUpBackgroud(){
        ImageIcon backgroundImage = new ImageIcon(".\\src\\hotelsystemmanagement\\Icons\\introduction.jpg");
        background.setIcon(backgroundImage);
        this.add(background);
    }
    
    public void displayTitle(){
       Timer timer = new Timer(500, new ActionListener(){
           boolean isDisplay = true;
           
           @Override
           public void actionPerformed(ActionEvent e){
               title.setVisible(!isDisplay);
               isDisplay = !isDisplay;
           }
       });
       
       timer.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 550));
        setPreferredSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(640, 550));
        getContentPane().setLayout(null);

        background.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        background.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(background);
        background.setBounds(0, 0, 640, 550);

        loginButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton);
        loginButton.setBounds(530, 460, 73, 27);

        title.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 255));
        title.setText("HOTEL MANAGEMENT SYSTEM");
        getContentPane().add(title);
        title.setBounds(84, 450, 350, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_loginButtonActionPerformed

   
    public static void main(String args[]) {
     

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IntroductionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntroductionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntroductionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntroductionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IntroductionPage introductionPage = new IntroductionPage();
                introductionPage.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

}
