package Config;

import java.sql.*;
import javax.swing.JOptionPane;

public class MySQL {

    private String url = "jdbc:mysql://localhost:3306/banco";
    private String nome = "root";
    private String senha = "root";
    private Connection conn;
    
    public Connection conectar(){
        try{
            conn = DriverManager.getConnection(url, nome, senha);
            JOptionPane.showMessageDialog(null, "Conectado ao banco de dados com sucesso!");
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro de conexao em MySQL: " + erro);
        }
        return conn;
    }

}
