package model;

public class Usuario {
    // evitar hardcode
    public final int ADM = 0;
    public final int EMPRESA = 1;
    
    public int idUsuario; // PK
    public String login;
    public String senha;
    public int tipo; // 0:ADM, 1:EMPRESA
    public String foto;
    public String cnpjEmpresa; // FK
}
