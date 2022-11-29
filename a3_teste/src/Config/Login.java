package Config;

import java.sql.*;
import javax.swing.JOptionPane;

public class Login {
    private Connection conn;
    
    public ResultSet autenticarUsuario(Config cfg){
        conn = new MySQL().conectar();
        
        try {
            String sql = "select * from banco.senhas Where senha_usuario = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, cfg.getSenha_usuario());
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro Login: " + erro);
            return null;
        }
    }
}
