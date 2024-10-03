package model;


public class Produto {
    
    private int codigo;
    private String descricao;
    private String unidade;
    private float qtd;
    private float preco;
    
    
    
    //Construtores

    public Produto() {
    }

    public Produto(int codigo, String descricao, String unidade, float qtd, float preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.unidade = unidade;
        this.qtd = qtd;
        this.preco = preco;
    }
    
    //Getters

    public int getCod() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public float getQtd() {
        return qtd;
    }

    public float getPreco() {
        return preco;
    }
    
    //Setters

    public void setCod(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public void setQtd(float qtd) {
        this.qtd = qtd;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    
    
    
    
    
    
}
