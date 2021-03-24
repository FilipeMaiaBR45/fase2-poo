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

    public void cadastrarMissao(Missao m, String emailDoCriador) {
        Connection con = ConnectionFactory.getConnection();
        //Material materia = new Material ();

        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO usuariofornecedor (nome, pontucao, status, objetivo, emailDoRecebedor, emailDoFornecedor, material) VALUES(?,?,?,?,?,?)");

            stmt.setString(1, m.getNome());
            stmt.setInt(2, m.getPontuacao());
            stmt.setInt(3, m.getStatus().getStatus());
            stmt.setString(4, emailDoCriador);
            stmt.setString(5, m.getEmailDoFornecedor());
            stmt.setInt(6, m.getMaterial().getTipoDoMaterial());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "missao cadastrada com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no cadastro da missao" + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
