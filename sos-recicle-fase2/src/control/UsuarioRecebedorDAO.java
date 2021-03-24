/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.UsuarioFornecedor;
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
            stmt = con.prepareStatement("INSERT INTO usuariorecebedor (nome, email, telefone, funcao, senha, nivel) VALUES(?,?,?,?,?,?)");
            
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
     
     public boolean verificarLoginUsuarioRecebedor(String email, String senha){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        boolean retorno = false;
        
        //List<UsuarioRecebedor> listaUsuarioRecebedor = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT email, senha FROM usuariorecebedor WHERE email= ?  AND senha= ? ");
            
            stmt.setString(1, email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            
            
            if(rs.next()){
              retorno =  true;
                
            }
            
            //fui comer, volto ja
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao efetuar Login, verifique as suas credencias..." + ex);
            
        }
        
        return retorno;
    }
}
