package dao;

import connection.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Transacao;

public class DaoTransacao {
    Connection connection;
    PreparedStatement pstm;
    
    public List<Transacao> getAll() {
        List<Transacao> list = new ArrayList<>();
        connection = new Conexao().conectarBD();
        try{
            pstm = connection.prepareStatement("SELECT * FROM Transacao", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = pstm.executeQuery();
            if(rs.first()) {
                do{
                    Transacao transacao = new Transacao();
                    transacao.idTransacao = rs.getInt("idTransacao");
                    transacao.horario = rs.getTimestamp("horario");
                    transacao.tipoResiduo = rs.getInt("tipoResiduo");
                    transacao.quantidade = rs.getDouble("quantidade");
                    transacao.valorUnitario = rs.getDouble("valorUnitario");
                    transacao.valorTransporte = rs.getDouble("valorTransporte");
                    transacao.idComprador = rs.getString("idComprador");
                    transacao.idVendedor = rs.getString("idVendedor");
                    
                    list.add(transacao);
                }while(rs.next());
            }
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, "Erro ao coletar os dados: ", ex);
        }
        return list;
    }
    
    public void addResiduo(Transacao transacao) {
        connection = new Conexao().conectarBD();
        try {
            pstm = connection.prepareStatement("INSERT INTO Transacao VALUES (DEFAULT, DEFAULT, ?, ?, ?, ?, ?, ?)");
            pstm.setInt(1, transacao.tipoResiduo);
            pstm.setDouble(2, transacao.quantidade);
            pstm.setDouble(3, transacao.valorUnitario);
            pstm.setDouble(4, transacao.valorTransporte);
            pstm.setString(5, transacao.idComprador);
            pstm.setString(6, transacao.idVendedor);
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
