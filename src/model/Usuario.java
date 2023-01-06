/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Usuario {
    public int idUsuario; // PK
    public int idEmpresa; // FK
    public int tipo; // 0:ADM, 1:RECICLADORA, 2:PRODUTORA
    public String login;
    public String senha;
}
