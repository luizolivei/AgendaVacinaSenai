package backend;

import javax.swing.JOptionPane;
import dao.Conexao;
import java.sql.*;
public class LoginBack {
    
    Connection conexao = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    /**asd
     *
     * @param usuario
     * @param senha
     * @return
     */
    public boolean autenticar(String usuario, String senha) { 
        boolean autenticado = false;
        try {
            conexao = Conexao.conector();
            String sql = "select * from usuario where us_nome = ? and us_senha = ?";
            ps = conexao.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, senha);
            rs = ps.executeQuery();

            if (rs.next()) {
                autenticado = true; 
            }

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Problema ao tentar realizar LOGIN");
        } finally {
            try {
                conexao.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return autenticado;
    }                      
}
