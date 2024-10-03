package model;


public class Cliente {

    private int codigo;
    private String nome;
    private String fone;
    private String email;
    private String endereco;

    
    
    //Construtores
    public Cliente() {
    }

    public Cliente(String nome, String fone, String email, String endereco) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        this.endereco = endereco;
    }

    

    public Cliente(int codigo, String nome, String fone, String email, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        this.endereco = endereco;
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
