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
import javax.swing.JOptionPane;
import model.UsuarioRecebedor;


/**
 *
 * @author filip
 */
public class UsuarioRecebedorDAO {
     public void cadastrarUsuarioRecebedor(UsuarioRecebedor ur){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO usuariorecebedor (nome, email, telefone, funcao, senha, pontuacao) VALUES(?,?,?,?,?,?)");
            
            stmt.setString(1, ur.getNome());
            stmt.setString(2, ur.getEmail());
            stmt.setString(3, ur.getTelefone());
            stmt.setInt(4, ur.getFuncao());
            stmt.setString(5, ur.getSenha());
            stmt.setInt(6, ur.getNivel());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso");
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);

        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
