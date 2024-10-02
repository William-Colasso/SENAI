package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author william_c_pereira
 */
public class Cliente {

    private int codigo;
    private String nome;
    private String fone;
    private String email;
    private String endereco;

    
    
    //Construtores
    public Cliente() {
    }

    public Cliente(String nome, String fone) {

        this.nome = nome;
        this.fone = fone;

    }
    
    //Getters

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }
    
    //Setters

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
    

}
