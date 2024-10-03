package model;


public class Fornecedor {

    private int codigo;
    private String empresa;
    private String contato;
    private String fone;
    private String email;

    public Fornecedor() {
    }

    public Fornecedor(int codigo, String empresa, String contato, String fone, String email) {
        this.codigo = codigo;
        this.empresa = empresa;
        this.contato = contato;
        this.fone = fone;
        this.email = email;
    }
    
    public Fornecedor(String empresa, String contato, String fone, String email) {
        this.empresa = empresa;
        this.contato = contato;
        this.fone = fone;
        this.email = email;
    }
    
    //Getters

    public int getCod() {
        return codigo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getContato() {
        return contato;
    }

    public String getFone() {
        return fone;
    }

    public String getEmail() {
        return email;
    }
  
    
    //Setters

    public void setCod(int codigo) {
        this.codigo = codigo;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

}
