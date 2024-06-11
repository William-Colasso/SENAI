/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author william_c_pereira
 */
public class Carro {

    private int velocidade;
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(int aceleracao){
            this.velocidade += aceleracao;
        
        
        //this.velocidade = aceleracao+getVelocidade();
    }

    public boolean partida(boolean ligar) {
        this.status = ligar;

        return ligar;
    }

}
