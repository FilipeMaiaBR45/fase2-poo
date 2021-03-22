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
import model.UsuarioFornecedor;

/**
 *
 * @author filip
 */
public class UsuarioFornecedorDAO {
    
    public void cadastrarUsuarioFornecedor(UsuarioFornecedor uf){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO usuariofornecedor (nome, email, telefone, funcao, senha, pontuacao), VALUES(?,?,?,?,?,?)");
            
            stmt.setString(1, uf.getNome());
            stmt.setString(2, uf.getEmail());
            stmt.setString(3, uf.getTelefone());
            stmt.setInt(4, uf.getFuncao());
            stmt.setString(5, uf.getSenha());
            stmt.setInt(6, uf.getPontuacao());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso");
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso" + ex);

        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
