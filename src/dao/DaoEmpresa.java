package dao;

import connection.Conexao;
import model.Empresa;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Residuo;

public class DaoEmpresa {
    Connection connection;
    PreparedStatement pstm;

    public List<Empresa> getAll() {
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
                    empresa.site = rs.getString("site");
                    empresa.email = rs.getString("email");

                    empresaList.add(empresa);
                }while(rs.next());
            }
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao selecionar dados: ", ex);
        }
        return empresaList;
    }
    
    // TN pega empresa a partir do cnpj
    public Empresa getEmpresa(String cnpj) {
        connection = new Conexao().conectarBD();
        try{
            pstm = connection.prepareStatement("SELECT * FROM Empresa WHERE cnpj=?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstm.setString(1, cnpj);
            ResultSet rs = pstm.executeQuery();
            if(rs.first()) {
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
                return empresa;
            }
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao selecionar dados: ", ex);
        }
        return null;
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
    
    // Combinação de empresa com residuo
    public List<Map<String, Object>> searchEmpresa(String cidade, String estado, int tipo, Double quantidade) {
        List<Map<String, Object>> listMapER = new ArrayList<>();
        connection = new Conexao().conectarBD();
        String query = """
            SELECT * 
            FROM Empresa JOIN Residuo ON cnpj=cnpjEmpresa
            WHERE (
                LOWER(cidade) LIKE LOWER(?) AND 
                uf=? AND 
                tipoResiduo=? AND 
                (capacidade-quantidadeAtual)>=? AND
                interesse=1
            )
        """;
        try{
            pstm = connection.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstm.setString(1, "%"+cidade+"%");
            pstm.setString(2, estado);
            pstm.setInt(3, tipo);
            pstm.setDouble(4, quantidade);
            ResultSet rs = pstm.executeQuery();
            if(rs.first()) {
                do{
                    Map<String, Object> mapER = new HashMap<>();
                    mapER.put("cnpj", rs.getString("cnpj"));
                    mapER.put("razaoSocial", rs.getString("razaosocial"));
                    mapER.put("nomeFantasia", rs.getString("nomefantasia"));
                    mapER.put("interesse", rs.getInt("interesse"));
                    mapER.put("cep", rs.getString("cep"));
                    mapER.put("uf", rs.getString("uf"));                    
                    mapER.put("cidade", rs.getString("cidade"));
                    mapER.put("bairro", rs.getString("bairro"));
                    mapER.put("rua", rs.getString("rua"));                    
                    mapER.put("numero", rs.getString("numero"));                    
                    mapER.put("complemento", rs.getString("complemento"));                    
                    mapER.put("telefone", rs.getString("telefone"));
                    mapER.put("site", rs.getString("site"));
                    mapER.put("tipoResiduo", rs.getString("tipoResiduo"));
                    mapER.put("capacidade", rs.getDouble("capacidade"));
                    mapER.put("quantidadeAtual", rs.getDouble("quantidadeAtual"));
                    mapER.put("preco", rs.getDouble("preco"));
                    
                    listMapER.add(mapER);
                }while(rs.next());
            }
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao pesquisar empresa: ", ex);
        }
        return listMapER;
    }
    
    // Pega valores de uma coluna em uma lista sem repetição
    public List<Object> getDistinct(String coluna) {
        List<Object> resultado = new ArrayList<>();
        connection = new Conexao().conectarBD();
        String query = String.format("SELECT DISTINCT %s FROM empresa", coluna);
        try{
            pstm = connection.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = pstm.executeQuery();
            if(rs.first()) {
                do{
                    resultado.add(rs.getObject(coluna));
                }while(rs.next());
            }
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao selecionar dados distintos: ", ex);
        }
        return resultado;
    }
}