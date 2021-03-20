/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author filip
 */
public class conectionFactory {
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/nomeDoBanco";
    private final String USER = "root";
    private final String PASS = "root";
    
    private Connection getConnection(){
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(PASS,USER,URL);
        } catch (ClassNotFoundException  | SQLException ex) {
             throw  new RuntimeException("Erro na conexão: ", ex);
        }
    }
}

