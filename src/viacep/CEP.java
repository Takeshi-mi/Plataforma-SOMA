/*
 * PARG Desenvolvimento de Sistemas
 * Pablo Alexander - pablo@parg.com.br
 * 
 * Obtem um CEP no ViaCEP
 */
package viacep;

/**
 * Define um CEP
 * @author PABLO
 */
public class CEP {
    // pripriedades do CEP
    public String CEP;
    public String Logradouro;
    public String Complemento;
    public String Bairro;
    public String Localidade;
    public String Uf;
    public String Ibge;
    public String Gia;
    
    /**
     * Cria um novo CEP vazio
     */
    public CEP() {
        this.Logradouro = null;
        this.Complemento = null;
        this.Bairro = null;
        this.Localidade = null;
        this.Uf = null;
        this.Ibge = null;
        this.Gia = null;
    }

    /**
     * Cria um novo CEP completo
     * @param CEP
     * @param Logradouro
     * @param Complemento
     * @param Bairro
     * @param Localidade
     * @param Uf
     * @param Ibge
     * @param Gia 
     */
    public CEP(String CEP, String Logradouro, String Complemento, String Bairro, String Localidade, String Uf, String Ibge, String Gia) {
        this.CEP = CEP;
        this.Logradouro = Logradouro;
        this.Complemento = Complemento;
        this.Bairro = Bairro;
        this.Localidade = Localidade;
        this.Uf = Uf;
        this.Ibge = Ibge;
        this.Gia = Gia;
    }

    /**
     * Cria um novo CEP parcial
     * @param Logradouro
     * @param Localidade
     * @param Uf 
     */
    public CEP(String Logradouro, String Localidade, String Uf) {
        this.Logradouro = Logradouro;
        this.Localidade = Localidade;
        this.Uf = Uf;
    }
}
