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
        public void cadastrarMissao(Missao m) {
            Connection con = ConnectionFactory.getConnection();
            //Material materia = new Material ();
       
        PreparedStatement stmt = null;
       try {
            stmt = con.prepareStatement("INSERT INTO usuariofornecedor (nome, email, telefone, funcao, senha, pontuacao) VALUES(?,?,?,?,?,?)");
            
            stmt.setString(1, m.getNome());
            stmt.setString(2, m.getObjetivo());
           // stmt.setInt(3, materia.getTipoDoMaterial());
            stmt.setInt(4, m.getPontuacao());
            stmt.setInt (5,m.getQtdMaterial());
           stmt.setInt(3, m.getMaterial().getTipoDoMaterial());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "missao cadastrado com sucesso");
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro no cadastro da missao" + ex);

           
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }}