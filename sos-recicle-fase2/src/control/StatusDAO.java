package control;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Status;




public class StatusDAO {
    
public List<Status> mostrarStatus (){
    
    Connection con = ConnectionFactory.getConnection();
     PreparedStatement stmt = null;
    ResultSet rs= null;
   List<Status> status = new ArrayList<>();
    
    try {
        stmt = con.prepareStatement("SELECT idStatus FROM status ");
           rs = stmt.executeQuery();
           while ( rs.next()){
               Status status1 = new Status();
               status1.setStatus(rs.getInt("idStatus"));
           }
           
    } catch (SQLException ex) {
        Logger.getLogger(StatusDAO.class.getName()).log(Level.SEVERE, null, ex);
        
    }finally{
        ConnectionFactory.closeConnection(con, stmt,rs);
    }
    return status;       
}
 
    
}