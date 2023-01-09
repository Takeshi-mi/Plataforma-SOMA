package model;

public class Residuo {
    // TN evitar hardcoding usando variaveis para traduzir os valores
    public static final int METAL = 0;
    public static final int PAPEL = 1;
    public static final int PLASTICO = 2;
    public static final int VIDRO = 3;
    
    public int tipoResiduo; // 0:METAL, 1:PAPEL, 2:PLASTICO, 3:VIDRO
    public String cnpjEmpresa;
    public Double capacidade; // em Kg
    public Double quantidadeAtual; // em Kg
    public Double preco; // R$/Kg
}
