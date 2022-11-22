    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author corte
 */
public class ModuloConexao {

    // metodo responsavel por estabelecer a conexão com o banco
    public static Connection conector() {
        Connection conexao = null;
        // a linha abaixo "chama" o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenando informações sobre referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox?characterEncoding=utf-8";
        String user = "dba";
        String password = "Infox@123456";
        // Estabelecendo a conexçao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // A linha abaixo serve de apoio para esclarecer o erro
            //System.out.println(e);
            
            return null;
        }
    }
}
