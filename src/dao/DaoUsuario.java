package dao;

import connection.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;

public class DaoUsuario {
    Connection connection;
    PreparedStatement pstm;
    
    
    public List<Usuario> getAll() {
        List<Usuario> userList = new ArrayList<>();
        connection = new Conexao().conectarBD();
        try{
            pstm = connection.prepareStatement("SELECT * FROM Usuario", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = pstm.executeQuery();
            if(rs.first()) {
                do{
                    Usuario user = new Usuario();
                    user.idUsuario = rs.getInt("idUsuario");
                    user.login = rs.getString("login");
                    user.senha = rs.getString("senha");
                    user.tipo  = rs.getInt("tipo");
                    user.foto = rs.getString("foto");
                    user.cnpjEmpresa = rs.getString("cnpjEmpresa");
                    

                    userList.add(user);
                }while(rs.next());
            }
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao coletar os dados: ", ex);
        }
        return userList;
    }
    
    public void addUsuario(Usuario user) {
        connection = new Conexao().conectarBD();
        try {
            pstm = connection.prepareStatement("INSERT INTO Usuario VALUES (DEFAULT, ?, ?, ?, ?)");
            pstm.setInt(1, user.idUsuario);
            pstm.setString(2, user.login);
            pstm.setString(3, user.senha);
            pstm.setInt(4, user.tipo);
            pstm.setString(5, user.foto);
            pstm.setString(6, user.cnpjEmpresa);
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao adicionar dados: ", ex);
        }
    }
    
    public void updateUsuario(Usuario user){
        connection = new Conexao().conectarBD();
        try {
            pstm = connection.prepareStatement("UPDATE Usuario SET login=?, senha=?, tipo=?, idEmpresa=? WHERE idUsuario=?;");
            pstm.setInt(1, user.idUsuario);
            pstm.setString(2, user.login);
            pstm.setString(3, user.senha);
            pstm.setInt(4, user.tipo);
            pstm.setString(5, user.foto);
            pstm.setString(6, user.cnpjEmpresa);
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao atualizar dados: ", ex);
        }
    }

    public void deleteUsuario(int id) {
        connection = new Conexao().conectarBD();
        try {
            pstm = connection.prepareStatement("DELETE FROM Usuario WHERE idUsuario=?;");
            pstm.setInt(1, id);
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao deletar dados: ", ex);
        }
    }
    
    public int validarUsuario(String login, String senha) {
        int tipo = -1; // 0:adm, 1:compra, 2:venda
        connection = new Conexao().conectarBD();
        try{
            pstm = connection.prepareStatement("SELECT login, senha, tipo FROM Usuario WHERE login = ? AND senha = ?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstm.setString(1, login);
            pstm.setString(2, senha);
            ResultSet rs = pstm.executeQuery();
            if(rs.first()) {
                tipo = rs.getInt("tipo");
            }
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao validar dados: ", ex);
        }
        return tipo;
    }
}
