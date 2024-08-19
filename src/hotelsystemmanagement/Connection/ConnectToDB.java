package hotelsystemmanagement.Connection;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDB {
    private Connection con;
    
    public ConnectToDB() {
        createConnection();
    }
    
    public void createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectToDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectToDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getCon(){
        return con;
    }
}
