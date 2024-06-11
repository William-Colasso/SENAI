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
                c.Menu_Login();
            } else {
                c.Menu_main();
            }

            //Usando o método para o menu principal
            option = ler.nextByte();

            switch (option) {
                case 1:

                    if (login) {

                    } else {
                        Limpar();
                        int numConta;
                        numConta = rd.nextInt(1001);
                        con[numConta] = new Conta();
                        String senha, titular;
                        System.out.println("======================================");
                        System.out.println("=             Criar Conta            =");
                        System.out.println("============     MENU    =============");
                        System.out.println("======================================");
                        System.out.println("=Titular da conta                    =");
                        con[numConta].settitular(ler2.nextLine());
                        Limpar();
                        System.out.println("======================================");
                        System.out.println("=             Criar Conta            =");
                        System.out.println("============     MENU    =============");
                        System.out.println("======================================");
                        System.out.println("=Tipo da conta                       =");
                        con[numConta].settpConta(ler.nextByte());
                        Limpar();
                        System.out.println("======================================");
                        System.out.println("=             Criar Conta            =");
                        System.out.println("============     MENU    =============");
                        System.out.println("======================================");
                        System.out.println("=Saldo                               =");
                        con[numConta].setsaldo(ler.nextFloat());
                        Limpar();
                        if (con[numConta].gettpConta() == 0) {
                            System.out.println("======================================");
                            System.out.println("=             Criar Conta            =");
                            System.out.println("============     MENU    =============");
                            System.out.println("======================================");
                            System.out.println("=Limite                              =");
                            con[numConta].setlimite(ler.nextFloat());
                            Limpar();
                        }
                        System.out.println("======================================");
                        System.out.println("=             Criar Conta            =");
                        System.out.println("============     MENU    =============");
                        System.out.println("======================================");
                        System.out.println("=Senha                               =");
                        con[numConta].setsenha(ler2.nextLine());
                        Limpar();
                        System.out.println("Obrigado por criar uma conta em nosso banco!");
                        System.out.println("1-Ver Status da conta");
                        System.out.println("2-Menu Principal");
                        option = ler.nextByte();

                        switch (option) {
                            case 1:
                                Limpar();
                                con[numConta].Status();
                                System.out.println("Digite qualquer coisa para continuar:");
                                ler.next();
                                Limpar();
                                break;
                            case 2:
                                Limpar();
                                break;
                            default:
                                Limpar();
                                System.out.println("Número invalido");
                                break;
                        }

                    }
                    //Criar conta

                    break;
                case 2:
                    //Status Conta
                    if (login) {

                    } else {

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
                    Limpar();
                    break;

            }

        } while (option != 3 && option != 6);

    }

    //Limpa Console
    public final static void Limpar() {
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
