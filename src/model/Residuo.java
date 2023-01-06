package model;

public class Residuo {
    // TN evitar hardcoding usando variaveis para traduzir os valores
    public final int METAL = 0;
    public final int PAPEL = 1;
    public final int PLASTICO = 2;
    public final int VIDRO = 3;
    
    public int tipoResiduo; // 0:METAL, 1:PAPEL, 2:PLASTICO, 3:VIDRO
    public String cnpjEmpresa;
    public Double capacidade; // em Kg
    public Double quantidadeAtual; // em Kg
    public Double preco; // R$/Kg
}
