/*
 * PARG Desenvolvimento de Sistemas
 * Pablo Alexander - pablo@parg.com.br
 * 
 * Obtem um CEP no ViaCEP
 */
package viacep;

/**
 * Interface para os eventos
 *
 * @author Pablo Alexander da Rocha Gonçalves
 */
public interface ViaCEPEvents {
    /**
     * Quando o CEP for encontrado com sucesso
     * @param cep retorna o objeto ViaCEP
     */
    public void onCEPSuccess(ViaCEP cep);
    
    /**
     * Quando ocorrer qualquer erro ao encontrar o CEP
     * @param cep retorna o CEP que foi requisitado
     */
    public void onCEPError(String cep);
}
