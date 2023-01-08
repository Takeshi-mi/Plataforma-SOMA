package model;


public class Empresa {
    final public int COMPRA = 1;
    final public int VENDA = 2;
    
    public String cnpj; //PK
    public String razaoSocial;
    public String nomeFantasia;
    public int interesse; // 1:COMPRA, 2:VENDA
    public String cep;
    public String uf;
    public String cidade;
    public String bairro;
    public String rua;
    public String numero;
    public String complemento;
    public String telefone;
    public String site;
    public String email;
}
