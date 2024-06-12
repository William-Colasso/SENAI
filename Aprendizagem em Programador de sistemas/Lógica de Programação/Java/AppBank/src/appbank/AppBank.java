package appbank;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Scanner;

//OBS:Os comentários estarão referenciando a linha de cima
public class AppBank {

    public static void main(String[] args) {
        //Função main

        byte option = 0;
        boolean login = false;
        int numConta = 0;
        int num_login = 0;
        float auxi = 0;
        String senha = "123";
        String senha_correta = "1234";

        //Criação de variaveis
        Scanner ler = new Scanner(System.in);
        Scanner ler2 = new Scanner(System.in);
        Random rd = new Random();
        Conta c = new Conta();
        //Criando Objetos simples
        Conta[] con = new Conta[1002];
        //Criando array de objetos

        do {

            if (login) {
                limpar();
                c.menu_Login();
            } else {
                limpar();
                c.menu_main();
            }

            //Usando o método para o menu principal
            option = ler.nextByte();

            switch (option) {
                case 1:

                    if (login) {
                        login = false;
                        limpar();
                    } else {
                        limpar();//limpando a tela

                        numConta = rd.nextInt(1001);    //Aleatoriza um número de 0 a 1001
                        con[numConta] = new Conta(); //Array de objetos da Classe Conta
                        con[numConta].setnumConta(numConta); //Atribuindo um número de conta a este objeto

                        System.out.println("======================================");
                        System.out.println("=             Criar Conta            =");
                        System.out.println("============     MENU    =============");       //Desenho da criação da conta, nome titular
                        System.out.println("======================================");
                        System.out.println("=Titular da conta                    =");
                        con[numConta].settitular(ler2.nextLine());

                        //limpar();//limpando a tela
                        System.out.println("======================================");
                        System.out.println("=             Criar Conta            =");
                        System.out.println("============     MENU    =============");       //Desenho da criação da conta, Tipo da conta
                        System.out.println("===========Tipo da conta=============");
                        System.out.println("=[0-Corrente 1-salario 2-Poupança]   =");

                        con[numConta].settpConta(ler.nextByte());

                        limpar();//limpando a tela

                        System.out.println("======================================");
                        System.out.println("=             Criar Conta            =");
                        System.out.println("============     MENU    =============");       //Desenho da criação da conta, saldo
                        System.out.println("======================================");
                        System.out.println("=Saldo                               =");

                        con[numConta].setsaldo(ler.nextFloat());

                        limpar();//limpando a tela

                        if (con[numConta].gettpConta() == 0) {
                            System.out.println("======================================");
                            System.out.println("=             Criar Conta            =");
                            System.out.println("============     MENU    =============");       //Desenho da criação da conta, limite da conta
                            System.out.println("======================================");
                            System.out.println("=Limite                              =");

                            con[numConta].setlimite(ler.nextFloat());

                            limpar();//limpando a tela

                        }
                        System.out.println("======================================");
                        System.out.println("=             Criar Conta            =");
                        System.out.println("============     MENU    =============");       //Desenho da criação da conta, senha da conta
                        System.out.println("======================================");
                        System.out.println("=Senha                               =");

                        con[numConta].setsenha(ler2.nextLine());

                        limpar();//limpando a tela

                        System.out.println("Obrigado por criar uma conta em nosso banco!");     //Agradecendo ao usuário pela criação da conta
                        System.out.println("1-Ver status da conta");
                        System.out.println("2-Menu Principal");

                        option = ler.nextByte();    //Ler a opção que o usuario preferir

                        switch (option) {   //Analisando a escolha do usuario
                            case 1:
                                limpar();//limpando a tela
                                con[numConta].status();
                                System.out.println("Digite qualquer coisa para continuar:");
                                ler.next();
                                limpar();//limpando a tela
                                break;
                            case 2:
                                limpar();//limpando a tela
                                break;
                            default:
                                limpar();//limpando a tela
                                System.out.println("Número invalido");
                                break;
                        }

                    }
                    //Criar conta ou sair da conta

                    break;
                case 2:
                    //Sacar ou Login
                    if (login) {

                        System.out.println("======================================");
                        System.out.println("=              S A Q U E             =");
                        System.out.println("============     MENU    =============");       //escrita menu Saque, pedindo o valor requerido
                        System.out.println("======================================");
                        System.out.println("=Valor de saque:                     =");
                        con[num_login].sacar(ler.nextInt());
                        ler.next();
                    } else {
                        limpar(); //Limpando a tela
                        System.out.println("======================================");
                        System.out.println("=              L O G I N             =");
                        System.out.println("============     MENU    =============");       //escrita menu Login, pedindo o numero da conta
                        System.out.println("======================================");
                        System.out.println("=Nº da conta:                        =");
                        numConta = ler.nextInt();
                        if (con[numConta] == null) { //Conferindo se a conta existe
                            limpar();//limpando a tela
                            System.out.println("Número de conta Inválido"); //Caso não exista essa mensagem ira aparecer em cima do menu principal
                        } else {
                            System.out.println("======================================");
                            System.out.println("=              L O G I N             =");
                            System.out.println("============     MENU    =============");       //escrita menu Login, a senha
                            System.out.println("======================================");
                            System.out.println("=Senha:                              =");
                            senha = ler2.nextLine();
                            senha_correta = con[numConta].getsenha();
                            System.out.println(senha_correta);
                            if (senha_correta == null ? senha == null : senha_correta.equals(senha)) {
                                num_login = numConta;
                                login = true;
                                limpar();//limpando a tela
                                System.out.println("Login feito com sucesso!");
                            } else {
                                limpar();//limpando a tela
                                System.out.println("Senha incorreta!");
                                login = false;
                            }

                        }
                    }

                    break;
                case 3:
                    if (login) {

                        System.out.println("======================================");
                        System.out.println("=      T R A N S F E R Ê N C I A     =");
                        System.out.println("============     MENU    =============");
                        System.out.println("======================================");
                        System.out.println("=Valor da transferência:             =");
                        auxi = ler.nextInt();
                        limpar();
                        System.out.println("======================================");
                        System.out.println("=      T R A N S F E R Ê N C I A     =");
                        System.out.println("============     MENU    =============");
                        System.out.println("======================================");
                        System.out.println("=Nº da conta de envio                =");
                        numConta = ler.nextInt();
                        if (con[numConta] == null) {
                            System.out.println("Conta Inexistente.");
                        } else {
                            con[num_login].transferir(auxi, con[numConta]);
                        }

                        System.out.println("Digite algo para continuar:");
                        ler.next();
                        option = 9;
                    } else {

                    }

                    //Sacar
                    break;

                case 4:
                    if (login) {
                        System.out.println("======================================");
                        System.out.println("=      T R A N S F E R Ê N C I A     =");
                        System.out.println("============     MENU    =============");
                        System.out.println("======================================");
                        System.out.println("=Valor depositado:                   =");
                        auxi = ler.nextFloat();
                        con[num_login].depositar(auxi);
                    } else {

                    }

                    //Depositar
                    break;
                case 5:
                    if (login) {
                        limpar();
                        System.out.println("======================================");
                        System.out.println("=             S T A T U S            =");
                        System.out.println("============     MENU    =============");       //escrita menu Login, pedindo a opção
                        System.out.println("======================================");
                        System.out.println("=1-Ver sua conta                     =");
                        System.out.println("=2-Ver de outra conta                =");
                        option = ler.nextByte();

                        if (option == 1) {
                            con[num_login].status();
                            System.out.println("Digite qualquer coisa para continuar");
                            ler.next();
                        } else if (option == 2) {
                            System.out.println("Nº da conta:");
                            numConta = ler.nextInt();
                            limpar();
                            con[numConta].status();
                            System.out.println("Digite qualquer coisa para continuar");
                            ler.next();
                        } else {
                            limpar();
                            System.out.println("Número inválido!");
                        }
                    } else {

                    }

                    //Fechar App
                    break;
                case 6:
                    if (login) {

                    } else {
                        option = 7;
                    }

                    //Depositar
                    break;

                default:
                    limpar();//limpando a tela
                    break;

            }

        } while (option != 3 && option != 6);

    }

    //Limpa Console
    public final static void limpar() {
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(10);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);
        } catch (AWTException ex) {
        }
        //Método feito por Gabriel Piske AI PSII, utilizado com permissão.
    }
    //William Colasso Pereira AI PSII
}
