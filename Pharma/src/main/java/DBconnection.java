/**
 *this class is created to establish the server connection with the project Pharma
 * 
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBconnection {
   
    
    public static void main(String args[])
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String path="jdbc:mysql://localhost:3306/pharmacy";
            Connection con = DriverManager.getConnection(path,"root","");
            Statement st=con.createStatement();
            
        } 
        
        catch (ClassNotFoundException ex) {
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static Connection createConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ResultSet executeQuery() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ResultSet executeQuery(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
