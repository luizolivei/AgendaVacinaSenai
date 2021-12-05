package dao;

import java.sql.*;
public class Conexao {
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //Dados para conexão com o banco de dados
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/agendavacina";
        String user = "root";
        String password = "";

        //Conecta no banco
        //O Try...Catch irá ajudar a tratar erros de conexão
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erro na tentativa de conexão. Dados:");
            System.out.println("URL: " + url);
            System.out.println("Usuário: " + user);
            System.out.println("Senha: " + password);
            return null;
        }
    }
}
