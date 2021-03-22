/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Endereco;
import model.UsuarioFornecedor;
import model.UsuarioRecebedor;

/**
 *
 * @author filip
 */
public class EnderecoDAO {
     public void cadastrarEndereco(Endereco e){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO endereco (rua, numero, bairro, cep, emailRecebedor, emailFornecedor) VALUES(?,?,?,?,?,?)");
            
            stmt.setString(1, e.getRua());
            stmt.setInt(2, e.getNumero());
            stmt.setString(3, e.getBairro());
            stmt.setString(4, e.getCep());
            stmt.setString(5, e.getEmailRecebedor());
            stmt.setString(6, e.getEmailFornecedor());
            
            stmt.executeUpdate();
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);

        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
