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
import model.Material;


public class MaterialDAO {
    
    
public List<Material> mostrarMaterial (){
    
    Connection con = ConnectionFactory.getConnection();
     PreparedStatement stmt = null;
    ResultSet rs= null;
   List<Material> material = new ArrayList<>();
    
    try {
        stmt = con.prepareStatement("SELECT idMaterial FROM material ");
           rs = stmt.executeQuery();
           while ( rs.next()){
               Material material1 = new Material();
               material1.setTipoDoMaterial(rs.getInt(""));
           }
           
    } catch (SQLException ex) {
        Logger.getLogger(StatusDAO.class.getName()).log(Level.SEVERE, null, ex);
        
    }finally{
        ConnectionFactory.closeConnection(con, stmt,rs);
    }
    return material;       
}
 
    
}
