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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.UsuarioFornecedor;

/**
 *
 * @author filip
 */
public class UsuarioFornecedorDAO {

    public void cadastrarUsuarioFornecedor(UsuarioFornecedor uf) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO usuariofornecedor (nome, email, telefone, funcao, senha, pontuacao) VALUES(?,?,?,?,?,?)");

            stmt.setString(1, uf.getNome());
            stmt.setString(2, uf.getEmail());
            stmt.setString(3, uf.getTelefone());
            stmt.setInt(4, uf.getFuncao());
            stmt.setString(5, uf.getSenha());
            stmt.setInt(6, uf.getPontuacao());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario não cadastrado" + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public boolean verificarLoginUsuarioFornecedor(String email, String senha) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean retorno = false;
        //List<UsuarioFornecedor> listaUsuarioFornecedor = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuariofornecedor WHERE email= ? AND senha= ?");

            stmt.setString(1, email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            if (rs.next()) {

                retorno = true;

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao efetuar Login, verifique as suas credencias..." + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt,rs);
        }

        return retorno;
    }
}
