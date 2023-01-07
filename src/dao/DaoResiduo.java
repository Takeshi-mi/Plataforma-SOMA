package dao;

import connection.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Residuo;

public class DaoResiduo {
    Connection connection;
    PreparedStatement pstm;
    
    public List<Residuo> getAll() {
        List<Residuo> resList = new ArrayList<>();
        connection = new Conexao().conectarBD();
        try{
            pstm = connection.prepareStatement("SELECT * FROM Residuo", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = pstm.executeQuery();
            if(rs.first()) {
                do{
                    Residuo residuo = new Residuo();
                    residuo.tipoResiduo = rs.getInt("tipoResiduo");
                    residuo.cnpjEmpresa = rs.getString("cnpjEmpresa");
                    residuo.capacidade = rs.getDouble("capacidade");
                    residuo.quantidadeAtual = rs.getDouble("quantidadeAtual");
                    residuo.preco = rs.getDouble("preco");
                    
                    resList.add(residuo);
                }while(rs.next());
            }
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao coletar os dados: ", ex);
        }
        return resList;
    }
    
    public void addResiduo(Residuo residuo) {
        connection = new Conexao().conectarBD();
        try {
            pstm = connection.prepareStatement("INSERT INTO Residuo VALUES (?, ?, ?, ?, ?)");
            pstm.setInt(1, residuo.tipoResiduo);
            pstm.setString(2, residuo.cnpjEmpresa);
            pstm.setDouble(3, residuo.capacidade);
            pstm.setDouble(4, residuo.quantidadeAtual);
            pstm.setDouble(5, residuo.preco);
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao adicionar dados: ", ex);
        }
    }
    
    public void updateResiduo(Residuo residuo) {
        connection = new Conexao().conectarBD();
        try {
            pstm = connection.prepareStatement("UPDATE Residuo SET capacidade=?, quantidadeAtual=?, preco=? WHERE tipoResiduo=? AND cnpjEmpresa=?");
            pstm.setDouble(1, residuo.capacidade);
            pstm.setDouble(2, residuo.quantidadeAtual);
            pstm.setDouble(3, residuo.preco);
            pstm.setInt(4, residuo.tipoResiduo);
            pstm.setString(5, residuo.cnpjEmpresa);
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao adicionar dados: ", ex);
        }
    }
    
    public void deleteResiduo(int tipo, String cnpj) {
        connection = new Conexao().conectarBD();
        try {
            pstm = connection.prepareStatement("DELETE FROM Residuo WHERE tipo=? AND cnpjEmpresa=?;");
            pstm.setInt(1, tipo);
            pstm.setString(2, cnpj);
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao deletar dados: ", ex);
        }
    }
}
