package model;

import java.sql.Timestamp;

public class Transacao {
    public int idTransacao;
    public Timestamp horario; // definido pelo banco de dados: DEFAULT NOW()::TIMESTAMP
    public int tipoResiduo; // 0:METAL, 1:PAPEL, 2:PLASTICO, 3:VIDRO
    public Double quantidade; // Kg
    public Double valorUnitario; // R$/Kg
    public Double valorTransporte; //R$
    public String idComprador;
    public String idVendedor;
}
