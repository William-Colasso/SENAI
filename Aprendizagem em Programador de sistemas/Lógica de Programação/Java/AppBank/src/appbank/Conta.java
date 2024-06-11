/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbank;

/**
 *
 * @author william_c_pereira
 */
public class Conta {
    //Atributos da Classe

    private byte tpConta = 0;
    private String titular = "";
    private float saldo = 0.0f;
    private float limite = 0.0f;
    private float limite_Maximo = 0.0f;
    private int numConta = 100;
    private String senha = "";

    public void settpConta(byte tpConta) {
        this.tpConta = tpConta;
    }

    public byte gettpConta() {
        return this.tpConta;
    }

    public void settitular(String titular) {
        this.titular = titular;
    }

    public String gettitular() {
        return this.titular;
    }

    public void setsaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getsaldo() {
        return this.saldo;
    }

    public void setlimite(float limite) {
        this.limite_Maximo = limite;
        this.limite = this.limite_Maximo;
    }

    public float getlimite() {
        return this.limite;
    }

    public void setnumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getnumConta() {
        return this.numConta;
    }

    public void setsenha(String senha) {
        this.senha = senha;
    }

    public String getsenha() {
        return this.senha;
    }

    public void Deposito(float vlDep) {

        if (this.tpConta == 0) {
            if (vlDep <= this.limite_Maximo - this.limite) {
                this.limite += vlDep;
            } else {
                vlDep = this.limite_Maximo - this.limite;
                this.saldo += vlDep;
                this.limite = this.limite_Maximo;
            }

        } else {
            this.saldo += vlDep;
        }
    }

    public void Menu_main() {
        System.out.println("======================================");
        System.out.println("=     App de gerenciamento bancário =");
        System.out.println("============     MENU    =============");
        System.out.println("======================================");
        System.out.println("=1-Criar Conta                       =");
        System.out.println("=2-Login                             =");
        System.out.println("=3-Fechar App                        =");
    }

    public void Menu_Login() {
        System.out.println("======================================");
        System.out.println("=     App de gerenciamento bancário  =");
        System.out.println("============     MENU    =============");
        System.out.println("======================================");
        System.out.println("=1-Sair da conta");
        System.out.println("=2-Sacar");
        System.out.println("=3-Transferir");
        System.out.println("=4-Depositar");
        System.out.println("=5-Lista de contas");
        System.out.println("=6-Sair do app");
    }

    //Informação importante: String titular, String senha, int numConta, float saldo, float limite, float limite_Maximo, byte tpConta 
    public void Status() {
        System.out.println("======================================");
        System.out.println("=             S T A T U S            =");
        System.out.println("============     MENU    =============");
        System.out.println("======================================");
        System.out.println("=Nº da conta: " + this.numConta);
        System.out.println("=Tipo da conta: " + this.tpConta);
        System.out.println("=Titular: " + this.titular);
        System.out.println("=Saldo: " + this.saldo);
        if (this.tpConta == 0) {
            System.out.println("=Limite: " + this.limite_Maximo + "/" + this.limite);
        }
        System.out.println("=Senha: " + this.senha);

    }
    
    public void Login(){
        
    }

}
