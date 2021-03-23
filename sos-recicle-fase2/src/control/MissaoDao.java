/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Missao;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Material;
import model.UsuarioFornecedor;

/**
 *
 * @author filip
 */
    public class MissaoDao {
        public void cadastrarMissao(Missao m) throws SQLException{
            Connection con = ConnectionFactory.getConnection();
        System.out.println(con);
        PreparedStatement stmt = null;
       try {
            stmt = con.prepareStatement("INSERT INTO usuariofornecedor (nome, email, telefone, funcao, senha, pontuacao) VALUES(?,?,?,?,?,?)");
            
            stmt.setString(1, m.getNome());
            stmt.setString(2, m.getObjetivo());
            //stmt.setString(3, m.());
            stmt.setInt(4, m.getPontuacao());
           
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso");
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso" + ex);

        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }}