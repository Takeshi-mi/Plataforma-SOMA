// Estabelece conexão com o banco de dados Soma

package connection;
    
    import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {
    Connection conexao;
    
    private final String driver = "org.postgresql.Driver";
    private final String url = "jdbc:postgresql://localhost:5432/projetoSoma";
    private final String user = "postgres";
    private final String pass = "1234";
    
    public Connection conectarBD() {
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, pass);
            conexao.createStatement().execute("SET search_path TO soma");
            System.out.println("Conexão realizada com sucesso");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erro em estabelecer conexão com o banco de dados.\n\n"+ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return conexao;
    }
}
