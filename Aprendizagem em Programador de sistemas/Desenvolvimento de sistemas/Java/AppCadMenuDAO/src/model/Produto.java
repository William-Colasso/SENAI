
public class Produto {
    
    private int cod;
    private String desc;
    private String unidade;
    private float qtd;
    private float preco;
    
    
    
    //Construtores

    public Produto() {
    }

    public Produto(int cod, String desc, String unidade, float qtd, float preco) {
        this.cod = cod;
        this.desc = desc;
        this.unidade = unidade;
        this.qtd = qtd;
        this.preco = preco;
    }
    
    //Getters

    public int getCod() {
        return cod;
    }

    public String getDesc() {
        return desc;
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

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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
