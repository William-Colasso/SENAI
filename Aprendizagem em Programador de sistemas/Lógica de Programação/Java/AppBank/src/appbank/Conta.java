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
        if (this.tpConta == 0 | this.tpConta == 1 | this.tpConta == 2) {
            this.tpConta = tpConta;
        } else {
            System.out.println("Tipo de conta inexistente!");
            this.tpConta = 2;
        }

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

    public void menu_main() {
        System.out.println("======================================");
        System.out.println("=     App de gerenciamento bancário =");
        System.out.println("============     MENU    =============");
        System.out.println("======================================");
        System.out.println("=1-Criar Conta                       =");
        System.out.println("=2-Login                             =");
        System.out.println("=3-Fechar App                        =");
    }

    public void menu_Login() {
        System.out.println("======================================");
        System.out.println("=     App de gerenciamento bancário =");
        System.out.println("============     MENU    =============");
        System.out.println("======================================");
        System.out.println("=1-Sair da conta");
        System.out.println("=2-Sacar");
        System.out.println("=3-Transferir");
        System.out.println("=4-Depositar");
        System.out.println("=5-Status");
        System.out.println("=6-Sair do app");
    }

    //Informação importante: String titular, String senha, int numConta, float saldo, float limite, float limite_Maximo, byte tpConta 
    public void status() {
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

    public void depositar(float vlDep) {
        if (this.tpConta == 0) {
            if (vlDep <= this.limite_Maximo - this.limite) {
                this.limite += vlDep;
            } else {
                vlDep -= this.limite_Maximo - this.limite;
                this.limite = this.limite_Maximo;
                this.saldo += vlDep;
            }
        } else {
            this.saldo += vlDep;
            System.out.println("");
        }
        System.out.println("Foram adicionados  R$" + vlDep + ". " + "A conta de: " + this.titular);
    }

    public void transferir(float vlTransf, Conta conta) {
        if (this.tpConta == 0) {
            if (this.saldo + this.limite >= vlTransf) {
                System.out.println("Estão sendo transferidos R$" + vlTransf + ", para  " + conta.titular + "....");
                if (vlTransf <= this.saldo) {
                    this.saldo -= vlTransf;
                } else {
                    this.limite += this.saldo - vlTransf;
                    this.saldo = 0.0f;
                }
                conta.depositar(vlTransf);
                System.out.println("Foram transferidos R$" + vlTransf + ", para  " + conta.titular + ".");
            } else {
                System.out.println("Você não tem Saldo suficiente para esta operação, mesmo com seu limite atual.");
            }
        } else {
            if (this.saldo >= vlTransf) {
                System.out.println("Foram Transferidos R$" + vlTransf + ".");
                this.saldo -= vlTransf;
                conta.depositar(vlTransf);
            } else {
                System.out.println("Você não tem saldo suficiente para essa transação.");
            }
        }
    }

    public void sacar(float vlSac) {
        System.out.println("Estão sendo sacados R$" + vlSac + "....");
        if (this.tpConta == 0) {
            if (this.saldo + this.limite >= vlSac) {

                if (vlSac <= this.saldo) {
                    this.saldo -= vlSac;
                } else {
                    this.limite += this.saldo - vlSac;
                    this.saldo = 0.0f;
                }

                System.out.println("Foram sacados R$" + vlSac + ".");
            } else {
                System.out.println("Você não tem Saldo suficiente para esta operação, mesmo com seu limite atual.");
            }
        } else {
            if (this.saldo >= vlSac) {
                System.out.println("Foram sacados R$" + vlSac + ".");
                this.saldo -= vlSac;
            } else {
                System.out.println("Você não tem saldo suficiente para essa transação.");
            }
        }

        System.out.println("Digite qualquer coisa para continuar:");
    }

}
