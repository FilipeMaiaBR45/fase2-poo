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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Material;
import model.Status;
import model.UsuarioFornecedor;

/**
 *
 * @author filip
 */
public class MissaoDao {

    public void cadastrarMissao(Missao m) {
        Connection con = ConnectionFactory.getConnection();
        

        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO missao (nome, pontuacao, status, objetivo, emailDoRecebedor, emailDoFornecedor, material) VALUES(?,?,?,?,?,?,?)");

            stmt.setString(1, m.getNome());
            stmt.setInt(2, m.getPontuacao());
            stmt.setInt(3, m.getStatus().getStatus());
            stmt.setString(4, m.getObjetivo());
            stmt.setString(5, m.getEmailDoCriador());
            stmt.setString(6, m.getEmailDoFornecedor());
            stmt.setInt(7, m.getMaterial().getTipoDoMaterial());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "missao cadastrada com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no cadastro da missao" + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Missao> listarMissoesEmAberto() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Missao> listaDeMissoes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM missao WHERE status = 0");

            rs = stmt.executeQuery();

            while (rs.next()) {
               Missao m = new Missao();
               Status s = new Status();
               Material ma = new Material();
               
               
               m.setId(rs.getInt("idMissao"));
               m.setNome(rs.getString("nome"));
               m.setPontuacao(rs.getInt("pontuacao"));
               s.setStatus(rs.getInt("status"));
               m.setStatus(s);
               m.setObjetivo(rs.getString("objetivo"));
               m.setEmailDoCriador(rs.getString("emailDoRecebedor"));
               m.setEmailDoFornecedor(rs.getString("emailDoFornecedor"));
               ma.setTipoDoMaterial(rs.getInt("material"));
               //ma.setMaterial(rs.getString("material"));
               m.setMaterial(ma);
               
               
               listaDeMissoes.add(m);
               
              
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao efetuar Login, verifique as suas credencias..." + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaDeMissoes;
    }
    
    public List<Missao> listarMissoesPorUsuarioRecebedor(int status, String emailDoRecebedor) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Missao> listaDeMissoes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM missao WHERE status = ? and emailDoRecebedor = ?");
            
            stmt.setInt(1, status);
            stmt.setString(2, emailDoRecebedor);

            rs = stmt.executeQuery();

            while (rs.next()) {
               Missao m = new Missao();
               Status s = new Status();
               Material ma = new Material();
               
               
               m.setId(rs.getInt("idMissao"));
               m.setNome(rs.getString("nome"));
               m.setPontuacao(rs.getInt("pontuacao"));
               s.setStatus(rs.getInt("status"));
               m.setStatus(s);
               m.setObjetivo(rs.getString("objetivo"));
               m.setEmailDoCriador(rs.getString("emailDoRecebedor"));
               m.setEmailDoFornecedor(rs.getString("emailDoFornecedor"));
               ma.setTipoDoMaterial(rs.getInt("material"));
               m.setMaterial(ma);
               
               listaDeMissoes.add(m);
               
              
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao efetuar Login, verifique as suas credencias..." + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaDeMissoes;
    }
    
    
    public List<Missao> listarMissoesPorUsuarioFornecedor(int status, String emailDoFornecedor) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Missao> listaDeMissoes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM missao WHERE status = ? and emailDoFornecedor = ?");
            
            stmt.setInt(1, status);
            stmt.setString(2, emailDoFornecedor);

            rs = stmt.executeQuery();

            while (rs.next()) {
               Missao m = new Missao();
               Status s = new Status();
               Material ma = new Material();
               
               
               m.setId(rs.getInt("idMissao"));
               m.setNome(rs.getString("nome"));
               m.setPontuacao(rs.getInt("pontuacao"));
               s.setStatus(rs.getInt("status"));
               m.setStatus(s);
               m.setObjetivo(rs.getString("objetivo"));
               m.setEmailDoCriador(rs.getString("emailDoRecebedor"));
               m.setEmailDoFornecedor(rs.getString("emailDoFornecedor"));
               ma.setTipoDoMaterial(rs.getInt("material"));
               m.setMaterial(ma);
               
               listaDeMissoes.add(m);
               
              
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao efetuar Login, verifique as suas credencias..." + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaDeMissoes;
    }
    
    
    
    // tela usuarioFornecedor
    public void aceitarMissao(Missao m, int idMissao){
        Connection con = ConnectionFactory.getConnection();
        
        
        

        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE missao SET emailDoFornecedor = ?, status = 1  WHERE idmissao = ?");
            
            
            stmt.setString(1, m.getEmailDoFornecedor());
            //stmt.setInt(2, m.getStatus().getStatus());
            stmt.setInt(2, idMissao);
            

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "missao aceita com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao aceitar missao " + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    //telaUsuarioRecebedor
    public void missaoConcluidaSucesso(int idMissao){
        Connection con = ConnectionFactory.getConnection();
        
        
        

        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE missao SET status = 2  WHERE idmissao = ?");
            
            stmt.setInt(1, idMissao);
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "missao cadastrada com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no cadastro da missao" + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    //telaUsuarioRecebedor
    public void missaoConcluidaSemSucesso(int idMissao){
        Connection con = ConnectionFactory.getConnection();
        
        
        

        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE missao SET status = 3  WHERE idmissao = ?");
            
            stmt.setInt(1, idMissao);
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "missao cadastrada com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no cadastro da missao" + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
       
    }
     
    //telaUsuarioFornecedor
     public int valorDaMissaoAceita(String emailFornecedor, int IdMissao){
         
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

         
         int valorMissao = 0;
         
         try {
             stmt = con.prepareStatement("select missao.pontuacao from missao INNER JOIN usuariofornecedor ON usuariofornecedor.email = ? where missao.emailDoFornecedor = usuariofornecedor.email and missao.idmissao = ?");
             
             stmt.setString(1, emailFornecedor);
             stmt.setInt(2, IdMissao);
             
             rs = stmt.executeQuery();
             
             if(rs.next()){
                 valorMissao = rs.getInt("pontuacao");
             }
             
         } catch (SQLException e) {
             System.out.println("n foi possivel obter o valor da missao "  + e);
         }
            
            return valorMissao;
        }
}
