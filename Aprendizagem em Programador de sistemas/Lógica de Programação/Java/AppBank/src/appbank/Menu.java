/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbank;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author william_c_pereira
 */
public class Menu {
    
    Random rd = new Random();
    Scanner ler2 = new Scanner(System.in);
    Conta[] con = new Conta[200000];
    
    public void Menu_main(){
        System.out.println("=============================================");
        System.out.println("=       App de gerenciamento bancário       =");
        System.out.println("=============      MENU    ==================");
        System.out.println("=============================================");
        System.out.println("= 1- Criar conta                            =");
        System.out.println("= 2- Status da conta                        =");
        System.out.println("= 3- Sacar                                  =");
        System.out.println("= 4- Depositar                              =");
        System.out.println("= 5- Fechar App                             =");
        System.out.println("=============================================");
        for(int i = 0; i<200000; i++){
            con[i] = new Conta(0, "");
        }
    }
    
    public void Criar_conta(){
        int nConta = rd.nextInt(100001);
        
        System.out.println("==============================================");
        System.out.println("=             Criação de Conta               =");
        System.out.println("=============      MENU     ==================");
        System.out.println("==============================================");
        System.out.println("= Titular da conta:                          =");
        con[nConta].numConta = nConta;
        con[nConta].titular = ler2.nextLine();
        Limpar();
        System.out.println("==============================================");
        System.out.println("=             Criação de Conta               =");
        System.out.println("=============      MENU     ==================");
        System.out.println("==============================================");
        System.out.println("= Tipo da conta:                             =");
        con[nConta].tpConta = ler2.nextByte();
        Limpar();
        System.out.println("==============================================");
        System.out.println("=             Criação de Conta               =");
        System.out.println("=============      MENU     ==================");
        System.out.println("==============================================");
        System.out.println("= Saldo:                                     =");
        con[nConta].saldo = ler2.nextFloat();
        Limpar();
        System.out.println("==============================================");
        System.out.println("=             Criação de Conta               =");
        System.out.println("=============      MENU     ==================");
        System.out.println("==============================================");
        System.out.println("= Limite:                                    =");
        con[nConta].limite = ler2.nextFloat();
        Limpar();
        Status(nConta);
    }
    
    public void Status(int nConta){
        System.out.println("==============================================");
        System.out.println("=                 STATUS                     =");
        System.out.println("==============================================");
        System.out.println("=Nº da Conta:..."+nConta+"\t\t\t\t=");
        System.out.println("=Tipo da conta:."+con[nConta].tpConta+"\t\t\t\t=");
        System.out.println("=Titular:......."+con[nConta].titular+"\t\t=");
        System.out.println("=Saldo:.......R$"+con[nConta].saldo+"\t\t\t\t=");
        System.out.println("=Limite:......R$"+con[nConta].limite+"\t\t\t\t=");
           
    }
       
                    
    
    

    
       
    
    
    //Limpa Console
    public  void Limpar() {
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(10);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);
        } catch (AWTException ex) {
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
