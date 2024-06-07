/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appbank;

import java.util.Scanner;

//OBS:Os comentários estarão referenciando a linha de cima
public class AppBank {
    //Criação de variaveis

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        byte option;
        String name;

        //Função main
        Menu m = new Menu();
        //Criando a instância
        m.Menu_main();
        //Usando o método para o menu principal
        option = ler.nextByte();

        switch (option) {
            case 1:
                m.Limpar();
                m.Criar_conta();
                //Criar conta
                
                break;
            case 2:
                //Status Conta
                break;
            case 3:
                //Sacar
                break;

            case 4:
                //Depositar
                break;
            case 5:
                //Fechar App
                break;

            default:
                System.out.println("Número inválido!");
                break;

        }

    }
    //William Colasso Pereira AI PSII
}
