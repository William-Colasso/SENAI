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

        byte option;
        boolean login = false;
        int numConta;
        int num_login;
        String senha;
        String senha_correta;
        //Criação de variaveis
        Scanner ler = new Scanner(System.in);
        Scanner ler2 = new Scanner(System.in);
        Random rd = new Random();
        Conta c = new Conta();
        //Criando Objetos simples
        Conta[] con = new Conta[1001];
        //Criando array de objetos

        do {

            if (login) {
                c.menu_Login();
            } else {
                c.menu_main();
            }

            //Usando o método para o menu principal
            option = ler.nextByte();

            switch (option) {
                case 1:

                    if (login) {

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
                        limpar();//limpando a tela
                        System.out.println("======================================");
                        System.out.println("=             Criar Conta            =");
                        System.out.println("============     MENU    =============");       //Desenho da criação da conta, Tipo da conta
                        System.out.println("======================================");
                        System.out.println("=Tipo da conta                       =");
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
                    //status Conta ou Login
                    if (login) {

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

                    } else {

                    }

                    //Sacar
                    break;

                case 4:
                    if (login) {

                    } else {

                    }

                    //Depositar
                    break;
                case 5:
                    if (login) {

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
        //Método feito por Gabriel Piske AI PSII
    }
    //William Colasso Pereira AI PSII
}
