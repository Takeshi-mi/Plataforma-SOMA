/*
 * PARG Desenvolvimento de Sistemas
 * Pablo Alexander - pablo@parg.com.br
 * 
 * Obtem um CEP no ViaCEP
 */
package viacep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Serve como base para a classe ViaCEP
 * @author PABLO
 */
public abstract class ViaCEPBase {
    // pripriedades do CEP
    protected List<CEP> CEPs;
    protected int index;
    protected String currentCEP;
    
    // váriaveis internas
    protected ViaCEPEvents Events;
    
    public ViaCEPBase () {
        CEPs = new ArrayList<>();
        index = -1;
        currentCEP = "00000-000";
        this.Events = null;
    }
    
    // métodos abstratos
    public abstract void buscar(String cep) throws ViaCEPException;
    public abstract void buscarCEP(CEP cep) throws ViaCEPException;
    
    /**
     * Busca um CEP usando um endereço
     * @param Uf estado
     * @param Localidade cidade
     * @param Logradouro nome ou parte do nome da rua, av, viela...
     * @throws br.com.parg.viacep.ViaCEPException
     */
    public void buscarCEP(String Uf, String Localidade, String Logradouro) throws ViaCEPException {
        buscarCEP(new CEP(Logradouro, Localidade, Uf));
    }
    
    /**
     * Retona o index atual;
     * @return 
     */
    public int getIndex() {
        return index;
    }
    
    /**
     * Retorna o total de CEP's
     * @return 
     */
    public int getSize() {
        return CEPs.size();
    }
    
    /**
     * Retonar o CEP
     *
     * @return
     */
    public String getCep() {
        return CEPs.get(index).CEP;
    }

    /**
     * Retorna o nome da rua, avenida, travessa, ...
     *
     * @return
     */
    public String getLogradouro() {
        return CEPs.get(index).Logradouro;
    }

    /**
     * Retorna se tem algum complemento Ex: lado impar
     *
     * @return
     */
    public String getComplemento() {
        return CEPs.get(index).Complemento;
    }

    /**
     * Retorna o Bairro
     *
     * @return
     */
    public String getBairro() {
        return CEPs.get(index).Bairro;
    }

    /**
     * Retorna a Cidade
     *
     * @return
     */
    public String getLocalidade() {
        return CEPs.get(index).Localidade;
    }

    /**
     * Retorna o UF
     *
     * @return
     */
    public String getUf() {
        return CEPs.get(index).Uf;
    }

    /**
     * Retorna o Ibge
     *
     * @return
     */
    public String getIbge() {
        return CEPs.get(index).Ibge;
    }

    /**
     * Retorna a Gia
     *
     * @return
     */
    public String getGia() {
        return CEPs.get(index).Gia;
    }
    
    /**
     * Procedimento para obtem dados via GET
     *
     * @param urlToRead endereço
     * @return conteúdo remoto
     * @throws br.com.parg.viacep.ViaCEPException caso ocorra algum erro
     */
    public final String getHttpGET(String urlToRead) throws ViaCEPException {
        StringBuilder result = new StringBuilder();

        try {
            URL url = new URL(urlToRead);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            
        } catch (MalformedURLException | ProtocolException ex) {
            // verifica os Eventos
            if (Events instanceof ViaCEPEvents) {
                Events.onCEPError(currentCEP);
            }
            
            throw new ViaCEPException(ex.getMessage(), ex.getClass().getName());
        } catch (IOException ex) {
            // verifica os Eventos
            if (Events instanceof ViaCEPEvents) {
                Events.onCEPError(currentCEP);
            }
            
            throw new ViaCEPException(ex.getMessage(), ex.getClass().getName());
        }
        
        return result.toString();
    }
    
    /**
     * Move para um registro específico
     * @param index
     * @return 
     */
    public boolean move(int index) {
        if (CEPs.size() > 0 && index >= 0 && index < CEPs.size()) {
            this.index = index;
            return true;
        }
        
        this.index = -1;
        return false;
    }
    
    /**
     * Move para o primeiro registro
     * @return 
     */
    public boolean moveFirst() {
        if (CEPs.size() > 0) {
            index = 0;
            return true;
        }
        
        index = -1;
        return false;
    }
    
    /**
     * Move para o próximo registro
     * @return 
     */
    public boolean moveNext() {
        if (CEPs.size() > 0 && (index + 1) < CEPs.size()) {
            index += 1;
            return true;
        }
        
        index = -1;
        return false;
    }
    
    /**
     * Move para o registro anterior
     * @return 
     */
    public boolean movePrevious() {
        if (CEPs.size() > 0 && (index - 1) >= 0) {
            index -= 1;
            return true;
        }
        
        index = -1;
        return false;
    }
    
    /**
     * Move para o último registro
     * @return 
     */
    public boolean moveLast() {
        if (CEPs.size() > 0) {
            index = CEPs.size() - 1;
            return true;
        }
        
        index = -1;
        return false;
    }
    
    /**
     * Retorna a lista de CEP's
     * @return 
     */
    public List<CEP> getList() {
        return CEPs;
    }
    
    /**
     * Procedimento para formatar uma string para usar em urls
     * @param string texto que vai ser formatado
     * @return texto formatado
     * @throws ViaCEPException em caso de erro
     */
    protected String formatStringToUri(String string) throws ViaCEPException {
        String out = null;
        
        // verifica está válido
        if (string != null && !string.isEmpty()) {
            try {
                out = URLEncoder.encode(string, "utf-8");
                out = out.replace("+", "%20"); // força espaço como %20
            } catch (UnsupportedEncodingException e) {
                throw new ViaCEPException("Não foi possível codificar o valor solicitado!", UnsupportedEncodingException.class.getName());
            }
        } else {
            throw new ViaCEPException("Valor nulo ou vazio informado!", String.class.getName());
        }
        
        return out;
    }
}
