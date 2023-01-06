package dao;

import connection.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

public class DaoUsuario {
    Connection connection;
    PreparedStatement pstm = null;
    
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
                    user.idEmpresa = rs.getInt(("idEmpresa"));
                    user.login = rs.getString("login");
                    user.senha = rs.getString("senha");
                    user.tipo  = rs.getInt("tipo");

                    userList.add(user);
                }while(rs.next());
            }
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userList;
    }
    
    public void addUsuario(Usuario user) {
        connection = new Conexao().conectarBD();
        try {
            pstm = connection.prepareStatement("INSERT INTO Usuario VALUES (DEFAULT, ?, ?, ?, ?)");
            pstm.setString(1, user.login);
            pstm.setString(2, user.senha);
            pstm.setInt(3, user.tipo);
            pstm.setInt(4, user.idEmpresa);
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateUsuario(Usuario user){
        connection = new Conexao().conectarBD();
        try {
            pstm = connection.prepareStatement("UPDATE Usuario SET login=?, senha=?, tipo=?, idEmpresa=? WHERE idUsuario=?;");
            pstm.setString(1, user.login);
            pstm.setString(2, user.senha);
            pstm.setInt(3, user.tipo);
            pstm.setInt(4, user.idEmpresa);
            pstm.setInt(5, user.idUsuario);
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int validarUsuario(String login, String senha) {
        int tipo = -1; // 0:adm, 1:compra, 2:venda
        connection = new Conexao().conectarBD();
        try{
            pstm = connection.prepareStatement("SELECT login, senha FROM Usuario WHERE login = ? AND senha = ?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstm.setString(1, login);
            pstm.setString(2, senha);
            ResultSet rs = pstm.executeQuery();
            if(rs.first()) {
                tipo = rs.getInt("tipo");
            }
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tipo;
    }
}
