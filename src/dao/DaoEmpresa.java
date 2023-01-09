package dao;

import connection.Conexao;
import model.Empresa;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Residuo;

public class DaoEmpresa {
    Connection connection;
    PreparedStatement pstm;

    public List<Empresa> getEmpresas() {
        List<Empresa> empresaList = new ArrayList<>();
        connection = new Conexao().conectarBD();
        try{
            pstm = connection.prepareStatement("SELECT * FROM Empresa", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = pstm.executeQuery();
            if(rs.first()) {
                do{
                    Empresa empresa = new Empresa();
                    empresa.cnpj = rs.getString("cnpj");
                    empresa.razaoSocial = rs.getString("razaosocial");
                    empresa.nomeFantasia = rs.getString("nomefantasia");
                    empresa.interesse = rs.getInt("interesse");
                    empresa.cep = rs.getString("cep");
                    empresa.uf = rs.getString("uf");                    
                    empresa.cidade = rs.getString("cidade");
                    empresa.bairro = rs.getString("bairro");
                    empresa.rua = rs.getString("rua");                    
                    empresa.numero = rs.getString("numero");                    
                    empresa.complemento = rs.getString("complemento");                    
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
    
    public List<Empresa> searchEmpresa(String cidade, String estado, int tipo, Double quantidade) {
        List<Empresa> empresaList = new ArrayList<>();
        connection = new Conexao().conectarBD();
        try{
            pstm = connection.prepareStatement("SELECT * FROM Empresa WHERE cidade=?, uf=?, tipo=?, quantidade=?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstm.setString(1, cidade);
            pstm.setString(2, estado);
            pstm.setInt(3, tipo);
            pstm.setDouble(4, quantidade);
            ResultSet rs = pstm.executeQuery();
            if(rs.first()) {
                do{
                    Empresa empresa = new Empresa();
                    empresa.cnpj = rs.getString("cnpj");
                    empresa.razaoSocial = rs.getString("razaosocial");
                    empresa.nomeFantasia = rs.getString("nomefantasia");
                    empresa.interesse = rs.getInt("interesse");
                    empresa.cep = rs.getString("cep");
                    empresa.uf = rs.getString("uf");                    
                    empresa.cidade = rs.getString("cidade");
                    empresa.bairro = rs.getString("bairro");
                    empresa.rua = rs.getString("rua");                    
                    empresa.numero = rs.getString("numero");                    
                    empresa.complemento = rs.getString("complemento");                    
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
        // 14 interrogações
        String query = "INSERT INTO Empresa VALUES (?,";
        for (int i=0; i<12; i++) {
            query += " ?,";
        }
        query += " ?)";
        try {
            pstm = connection.prepareStatement(query);
            pstm.setString(1, empresa.cnpj);
            pstm.setString(2, empresa.razaoSocial);
            pstm.setString(3, empresa.nomeFantasia);
            pstm.setInt(4, empresa.interesse);
            pstm.setString(5, empresa.cep);
            pstm.setString(6, empresa.uf);
            pstm.setString(7, empresa.cidade);
            pstm.setString(8, empresa.bairro);
            pstm.setString(9, empresa.rua);
            pstm.setString(10, empresa.numero);
            pstm.setString(11, empresa.complemento);
            pstm.setString(12, empresa.telefone);
            pstm.setString(13, empresa.site);
            pstm.setString(14, empresa.email);
            
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao adicionar empresa: ", ex);
        }
    }
    
    public void updateEmpresa(Empresa empresa) {
        connection = new Conexao().conectarBD();
        String query = "UPDATE Empresa SET razaoSocial=?, nomeFantasia=?, interesse=?, cep=?, uf, cidade=?, bairro=?, rua=?, "
                + "numero=?, complemento=?, telefone=?, site=?, email=? WHERE cnpj=?";
        try {
            pstm = connection.prepareStatement(query);
            pstm.setString(1, empresa.razaoSocial);
            pstm.setString(2, empresa.nomeFantasia);
            pstm.setInt(3, empresa.interesse);
            pstm.setString(4, empresa.cep);
            pstm.setString(5, empresa.uf);
            pstm.setString(6, empresa.cidade);
            pstm.setString(7, empresa.bairro);
            pstm.setString(8, empresa.rua);
            pstm.setString(9, empresa.numero);
            pstm.setString(10, empresa.complemento);
            pstm.setString(11, empresa.telefone);
            pstm.setString(12, empresa.site);
            pstm.setString(13, empresa.email);
            pstm.setString(14, empresa.cnpj);
            
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao atualizar empresa: ", ex);
        }
    }
    
    public void deleteEmpresa(String cnpj) {
        connection = new Conexao().conectarBD();
        try {
            pstm = connection.prepareStatement("DELETE FROM Empresa WHERE cnpj=?;");
            pstm.setString(1, cnpj);
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao deletar empresa: ", ex);
        }
    }
    
    public List<Residuo> getResiduos(String cnpj) {
        List<Residuo> residuoList = new ArrayList<>();
        connection = new Conexao().conectarBD();
        String query = """
                       SELECT *
                       FROM Residuo NATURAL JOIN (
                            SELECT cnpj AS cnpjEmpresa 
                            FROM Empresa
                            WHERE cnpj=?
                       ) AS e
                       """;
        try{
            pstm = connection.prepareStatement(query);
            pstm.setString(1, cnpj);
            ResultSet rs = pstm.executeQuery();
            if(rs.first()) {
                do{
                    Residuo residuo = new Residuo();
                    residuo.tipoResiduo = rs.getInt("tipoResiduo");
                    residuo.cnpjEmpresa = rs.getString("cnpjEmpresa");
                    residuo.capacidade = rs.getDouble("capacidade");
                    residuo.quantidadeAtual = rs.getDouble("quantidadeAtual");
                    residuo.preco = rs.getDouble("preco");
                    residuoList.add(residuo);
                }while(rs.next());
            }
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao selecionar dados: ", ex);
        }
        return residuoList;
    }
}