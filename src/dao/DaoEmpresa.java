package dao;

import connection.Conexao;
import model.Empresa;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoEmpresa {
    Connection connection;
    PreparedStatement pstm;

    public List<Empresa> getEmpresas() {
        List<Empresa> empresaList = new ArrayList<>();
        connection = new Conexao().conectarBD();
        try{
            pstm = connection.prepareStatement("SELECT * FROM Usuario", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = pstm.executeQuery();
            if(rs.first()) {
                do{
                    Empresa empresa = new Empresa();
                    empresa.idEmpresa = rs.getInt("idEmpresa");
                    empresa.nome = rs.getString("nome");
                    empresa.interesse = rs.getInt("interesse");
                    empresa.cep = rs.getInt("cep");
                    empresa.cidade = rs.getString("cidade");
                    empresa.estado = rs.getString("estado");                    
                    empresa.rua = rs.getString("rua");                    
                    empresa.telefone = rs.getString("telefone");
                    empresa.site = rs.getString("telefone");
                    empresa.email = rs.getString("telefone");

                    empresaList.add(empresa);
                }while(rs.next());
            }
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao selecionar dados: ", ex);
        }
        return empresaList;
    }
    
    public void addEmpresa(Empresa empresa) {
        connection = new Conexao().conectarBD();
        try {
            pstm = connection.prepareStatement("INSERT INTO Empresa VALUES (DEFAULT, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            pstm.setString(1, empresa.nome);
            pstm.setInt(2, empresa.interesse);
            pstm.setInt(3, empresa.cep);
            pstm.setString(4, empresa.cidade);
            pstm.setString(5, empresa.estado);
            pstm.setString(6, empresa.rua);
            pstm.setString(7, empresa.telefone);
            pstm.setString(8, empresa.site);
            pstm.setString(9, empresa.email);
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao adicionar empresa: ", ex);
        }
    }
    
    public void updateEmpresa(Empresa empresa) {
        connection = new Conexao().conectarBD();
        try {
            pstm = connection.prepareStatement("UPDATE Empresa SET nome=?, interesse=?, cep=?, cidade=?, estado=?, rua=?, telefone=?, site=?, email=? WHERE idEmpresa=?;");
            pstm.setString(1, empresa.nome);
            pstm.setInt(2, empresa.interesse);
            pstm.setInt(3, empresa.cep);
            pstm.setString(4, empresa.cidade);
            pstm.setString(5, empresa.estado);
            pstm.setString(6, empresa.rua);
            pstm.setString(7, empresa.telefone);
            pstm.setString(8, empresa.site);
            pstm.setString(9, empresa.email);
            pstm.setInt(10, empresa.idEmpresa);
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao atualizar empresa: ", ex);
        }
    }
    
    public void deleteEmpresa(int id) {
        connection = new Conexao().conectarBD();
        try {
            pstm = connection.prepareStatement("DELETE FROM Empresa WHERE idEmpresa=?;");
            pstm.setInt(1, id);
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao deletar empresa: ", ex);
        }
    }
}
