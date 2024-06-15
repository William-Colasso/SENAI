
import Classes.Carro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Carro carro = new Carro();
        //Carro com "C" maiúsculo = Classe
        //carro com "c" minúsculo = instância
        carro.setVelocidade(0);//Colocando velocidade ao meu objetivo
        boolean sair = false;
        byte option;
        /* System.out.println("A velocidade do carro poderia ser: "+carro.getVelocidade()+"Km/h");
        carro.acelerar(10);
        carro.partida(true);//Manda o carro ligar
        System.out.println("Status: "+carro.isStatus());*/
        do {

            if (carro.isStatus() == false) {
                System.out.println("======================================");
                System.out.println("=             C A R R O              =");
                System.out.println("============     MENU    =============");
                System.out.println("======================================");
                System.out.println("======================================");
                System.out.println("=1-Ligar                             =");
                System.out.println("=2-Fechar App                        =");

            } else {
                System.out.println("======================================");
                System.out.println("=             C A R R O              =");
                System.out.println("============     MENU    =============");
                System.out.println("======================================");
                System.out.println("======================================");
                System.out.println("=1-Desligar                          =");
                System.out.println("=2-Acelerar                          =");
                System.out.println("=3-Frear                             =");
                System.out.println("=4-Fechar App                        =");
            }

            option = ler.nextByte();

            switch (option) {
                case 1:
                    if (carro.isStatus() == false) {
                        carro.partida(true);
                        System.out.println("Carro Ligado!");
                    } else {

                        if (carro.getVelocidade() >= 80) {

                            System.out.println("Impossivel desligar o carro, veloz demais!");

                        } else {
                            carro.partida(false);
                            System.out.println("Carro desligado!");
                            carro.acelerar(-carro.getVelocidade());
                        }
                    }
                    break;

                case 2:
                    if (carro.isStatus() == false) {
                        sair = true;
                    } else {
                        System.out.println("======================================");
                        System.out.println("=             Acelerar               =");
                        System.out.println("============     MENU    =============");
                        System.out.println("======================================");
                        System.out.println("======================================");
                        System.out.println("=Quanto gostaria de acelerar?        =");
                        carro.acelerar(ler.nextInt());
                        System.out.println("O carro esta com a seguinte velocidade: " + carro.getVelocidade() + "Km/h");

                    }

                    break;

                case 3:
                    System.out.println("======================================");
                    System.out.println("=             Acelerar               =");
                    System.out.println("============     MENU    =============");
                    System.out.println("======================================");
                    System.out.println("======================================");
                    System.out.println("=Quanto gostaria de frear?        =");
                    carro.acelerar(-ler.nextInt());
                    System.out.println("O carro esta com a seguinte velocidade: " + carro.getVelocidade() + "Km/h");
                    break;

                case 4:
                    if (carro.isStatus() == false) {
                        System.out.println("Número Invalido");
                    } else {
                        sair = true;
                    }

                    break;
                default:
                    System.out.println("Número Invalido");
                    break;
            }

        } while (sair == false);

    } //Projestista: William Colasso Pereira

}
