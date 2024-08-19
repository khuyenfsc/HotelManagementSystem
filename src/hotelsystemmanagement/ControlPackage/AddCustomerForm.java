

package hotelsystemmanagement.ControlPackage;


import java.awt.Color;
import java.sql.Connection;
import javax.swing.ImageIcon;
import hotelsystemmanagement.Connection.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;


public class AddCustomerForm extends javax.swing.JFrame {
    private ConnectToDB connectToDB;
    private Connection connection;
    private List<String> roomNumbers = new ArrayList<>();
    private KeyListener keyListener = new KeyListener(){
        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if('1' <= e.getKeyChar() && e.getKeyChar() <= '9'){
                searchRoom(roomNumberInput.getText() + e.getKeyChar());
            }else if(e.getKeyCode() == 8){
                searchRoom(roomNumberInput.getText().substring(0, roomNumberInput.getText().length() - 1));
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            
        }
        
    };

    
    public AddCustomerForm() {
        initComponents();
        setConnection();
        setBackground();
        addTypesID();
        addTypeRoom();
        linkGenders();
        setRooms();
        setRoomNumber();
        addListenerToRoomNumberInput();
        setCheckInChoices();
        
        String UNDO_ACTION = "undo";

         

        
        UndoManager undoManager = new UndoManager();
        idNumberInput.getDocument().addUndoableEditListener(new UndoableEditListener(){
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                undoManager.addEdit(e.getEdit());
            }
            
        });
        
        idNumberInput.getActionMap().put(UNDO_ACTION, new AbstractAction(UNDO_ACTION) {
            public void actionPerformed(ActionEvent pEvt) {
                try {
                    if (undoManager.canUndo()) {
                        undoManager.undo();
                    }
                } catch (CannotUndoException e) {
                    e.printStackTrace();
                }
            }
        });
        
         idNumberInput.getInputMap().put(
        KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_DOWN_MASK), UNDO_ACTION);
    }

    private void setBackground(){
        getContentPane().setBackground(new Color(62,62,66));
        
        String imagePath = ".\\src\\hotelsystemmanagement\\Icons\\customer.png";
        ImageIcon descriptionImage = new ImageIcon(imagePath);
        imageContainer.setIcon(descriptionImage);
        
    }
    
    private void addTypesID(){
        idTypeList.add("Identify Card");
        idTypeList.add("Passport");
        idTypeList.add("Driving license");
        
    }
    
    private void linkGenders(){
        maleChoice.setActionCommand("male");
        femaleChoice.setActionCommand("female");
        
        genderGroup.add(maleChoice);
        genderGroup.add(femaleChoice);

    }
    
    private void addTypeRoom(){
        roomTypes.add("Single Bed");
        roomTypes.add("Double Bed");
    }
    
    private void setConnection(){
        connectToDB = new ConnectToDB();
        connection = connectToDB.getCon();
    }
    
    private void setRooms(){
        String currentRoomType = roomTypes.getSelectedItem();
        roomNumberChoices.removeAll();
        roomNumbers.clear();
        System.out.println(currentRoomType);
             
        
        try {
            PreparedStatement getRoomsStatement = connection.prepareStatement("SELECT room_number FROM rooms WHERE room_type = ? AND availability = \"available\" AND clean_status = \"cleaned\"");
            getRoomsStatement.setString(1, currentRoomType);
            
            getRoomsStatement.execute();
            ResultSet availableRooms  = getRoomsStatement.getResultSet();
            
            while(availableRooms.next()){
                roomNumberChoices.add(String.valueOf(availableRooms.getInt("room_number")));
                roomNumbers.add(String.valueOf(availableRooms.getInt("room_number")));
                System.out.println(availableRooms.getInt("room_number"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setRoomNumber(){
        roomNumberInput.setText(roomNumberChoices.getSelectedItem());
    }
    
    private void searchRoom(String currentText){
        roomNumberChoices.removeAll();
        
        for(String number : roomNumbers){
            if(number.indexOf(currentText) == 0){
                roomNumberChoices.add(number);
            }
        }
    }
    
    private void addListenerToRoomNumberInput(){
        roomNumberInput.addKeyListener(keyListener);
    }
    
    private void setCheckInChoices(){
        checkInChoices.add("Check-in");
        checkInChoices.add("Check-out");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idTypeList = new java.awt.Choice();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        maleChoice = new javax.swing.JRadioButton();
        femaleChoice = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        depositInput = new javax.swing.JTextField();
        imageContainer = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        roomTypes = new java.awt.Choice();
        roomInfoContainer = new javax.swing.JLayeredPane();
        roomNumberInput = new javax.swing.JTextField();
        roomNumberChoices = new java.awt.Choice();
        checkInChoices = new java.awt.Choice();
        idNumberInput = new hotelsystemmanagement.ControlPackage.MyTextField();
        fullNameInput = new hotelsystemmanagement.ControlPackage.MyTextField();
        countryInput = new hotelsystemmanagement.ControlPackage.MyTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Form");
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("New Customer Form");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");

        idTypeList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        idTypeList.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                idTypeListComponentShown(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Number");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Full Name");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender");

        maleChoice.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        maleChoice.setForeground(new java.awt.Color(255, 255, 255));
        maleChoice.setText("Male");

        femaleChoice.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        femaleChoice.setForeground(new java.awt.Color(255, 255, 255));
        femaleChoice.setText("Female");
        femaleChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleChoiceActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Country");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Room Type");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Check-in");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Deposit");

        depositInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositInputActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(102, 102, 102));
        addButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
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

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Room Number");

        roomTypes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                roomTypesItemStateChanged(evt);
            }
        });

        roomInfoContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roomNumberInput.setActionCommand("<Not Set>");
        roomNumberInput.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        roomNumberInput.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                roomNumberInputComponentResized(evt);
            }
        });
        roomNumberInput.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                roomNumberInputCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                roomNumberInputInputMethodTextChanged(evt);
            }
        });
        roomNumberInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomNumberInputActionPerformed(evt);
            }
        });
        roomInfoContainer.add(roomNumberInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 9, 94, 25));

        roomNumberChoices.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                roomNumberChoicesItemStateChanged(evt);
            }
        });
        roomInfoContainer.add(roomNumberChoices, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 109, 20));

        idNumberInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idNumberInputActionPerformed(evt);
            }
        });

        fullNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(checkInChoices, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82))
                                    .addComponent(depositInput)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fullNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idTypeList, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(44, 44, 44)
                                .addComponent(roomInfoContainer))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(roomTypes, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(maleChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(femaleChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(countryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGap(178, 178, 178)
                .addComponent(imageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(idTypeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(fullNameInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maleChoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(femaleChoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(roomTypes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomInfoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(checkInChoices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton)
                    .addComponent(backButton))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idTypeListComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_idTypeListComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_idTypeListComponentShown

    private void femaleChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleChoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleChoiceActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        new Control().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void roomTypesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_roomTypesItemStateChanged
        setRooms();
        roomNumberInput.setText(roomNumberChoices.getSelectedItem());     
    }//GEN-LAST:event_roomTypesItemStateChanged

    private void roomNumberInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomNumberInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomNumberInputActionPerformed

    private void roomNumberChoicesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_roomNumberChoicesItemStateChanged
        setRoomNumber();
        
        
    }//GEN-LAST:event_roomNumberChoicesItemStateChanged

    private void roomNumberInputInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_roomNumberInputInputMethodTextChanged
        
    }//GEN-LAST:event_roomNumberInputInputMethodTextChanged

    private void roomNumberInputComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_roomNumberInputComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_roomNumberInputComponentResized

    private void roomNumberInputCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_roomNumberInputCaretPositionChanged
        
    }//GEN-LAST:event_roomNumberInputCaretPositionChanged

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if("".equals(idNumberInput.getText())){
            JOptionPane.showMessageDialog(null, "Miss Number!");
            return;
        }
        if("".equals(fullNameInput.getText())){
            JOptionPane.showMessageDialog(null, "Miss Full Name!");
            return;
        }
        if(genderGroup.getSelection() == null){
            JOptionPane.showMessageDialog(null, "Miss Gender!");
            return;
        }
        if("".equals(countryInput.getText())){
            JOptionPane.showMessageDialog(null, "Miss Country!");
            return;
        }
        if("".equals(roomNumberInput.getText())){
            JOptionPane.showMessageDialog(null, "Miss Room Number!");
            return;
        }
 
        if("".equals(depositInput.getText())){
            JOptionPane.showMessageDialog(null, "Miss Deposit!");
            return;
        }
        
        String idType = idTypeList.getSelectedItem();
        String idNumber = idNumberInput.getText();
        String fullName = fullNameInput.getText();
        String gender = genderGroup.getSelection().getActionCommand();
        String country = countryInput.getText();
        String roomType = roomTypes.getSelectedItem();
        String roomNumber = roomNumberInput.getText();
        String checkIn = checkInChoices.getSelectedItem();
        String deposit = depositInput.getText();
        
        try {
            PreparedStatement findStatement = connection.prepareStatement("SELECT * FROM customers WHERE id_number = ? AND check_in = 'Check-in'");
            
            findStatement.setString(1, idNumber);
            findStatement.execute();
            ResultSet foundRoom = findStatement.getResultSet();
            if(foundRoom.next()){
                JOptionPane.showMessageDialog(null, "Customer already exist!");
                return;
            }
            
            PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO customers VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, now())");
            
            insertStatement.setString(1, idType);
            insertStatement.setString(2, idNumber);
            insertStatement.setString(3, fullName);
            insertStatement.setString(4, gender);
            insertStatement.setString(5, country);
            insertStatement.setString(6, roomType);
            insertStatement.setString(7, roomNumber);
            insertStatement.setString(8, checkIn);
            insertStatement.setString(9, deposit);
            
            insertStatement.execute();
            JOptionPane.showMessageDialog(null, "Add customer successfully!");
            
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);   
        }
        
        updateRoom(roomNumber);
    }//GEN-LAST:event_addButtonActionPerformed

    private void idNumberInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idNumberInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idNumberInputActionPerformed

    private void depositInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositInputActionPerformed

    private void fullNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameInputActionPerformed

    private void updateRoom(String roomNumber){
        
        try {
            PreparedStatement updateRoomStatement = connection.prepareStatement("UPDATE  rooms SET availability = 'unavailable' WHERE room_number = ?");
            
            updateRoomStatement.setString(1, roomNumber);
            updateRoomStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(AddCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCustomerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private java.awt.Choice checkInChoices;
    private hotelsystemmanagement.ControlPackage.MyTextField countryInput;
    private javax.swing.JTextField depositInput;
    private javax.swing.JRadioButton femaleChoice;
    private hotelsystemmanagement.ControlPackage.MyTextField fullNameInput;
    private javax.swing.ButtonGroup genderGroup;
    private hotelsystemmanagement.ControlPackage.MyTextField idNumberInput;
    private java.awt.Choice idTypeList;
    private javax.swing.JLabel imageContainer;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton maleChoice;
    private javax.swing.JLayeredPane roomInfoContainer;
    private java.awt.Choice roomNumberChoices;
    private javax.swing.JTextField roomNumberInput;
    private java.awt.Choice roomTypes;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}
