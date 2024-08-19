
package hotelsystemmanagement.ControlPackage;

import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

public class MyTextField extends JTextField{
    private UndoManager undoManager = new UndoManager();
    private String undoAction = "undo";
    
    public MyTextField(){
        getDocument().addUndoableEditListener(new UndoableEditListener(){
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                undoManager.addEdit(e.getEdit());
            }
            
        });
        
        getActionMap().put(undoAction, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(undoManager.canUndo()){
                        undoManager.undo();
                    }
                }catch(CannotUndoException error){
                    error.printStackTrace();
                }
                
            }
        });
        
        getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_DOWN_MASK), undoAction);
    }
    
    public static void main(String[] args) {
        
    }
}
