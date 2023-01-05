// Estabelece conexão com o banco de dados Soma

package connection;
    
    import java.sql.*;

public class Conexao {
    Connection conexao;
    
    private final String driver = "org.postgresql.Driver";
    private final String url = "jdbc:postgresql://localhost:5432/projetoSoma";
    private final String user = "postgres";
    private final String pass = "admin";
    
    public static void main(String[] args) {
        new Conexao().contectarBD();
    }
    
    public Connection contectarBD() {
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexão realizada com sucesso");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        return conexao;
    }
}