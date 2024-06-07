/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbank;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author william_c_pereira
 */
public class Menu {
    
    
    
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
    }
    
    public void Criar_conta(){
         System.out.println("=============================================");
        System.out.println("=             Criação de Conta               =");
        System.out.println("=============      MENU    ==================");
        System.out.println("=============================================");
        System.out.println("= 1-Titular da conta                        =");

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
