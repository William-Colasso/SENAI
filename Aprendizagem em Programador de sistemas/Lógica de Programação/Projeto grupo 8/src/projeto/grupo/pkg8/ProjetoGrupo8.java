package projeto.grupo.pkg8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;
//Contador de caracteres em JAVA, William Colasso
public class ProjetoGrupo8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algo para saber a quantidade de caracteres");
        String frase = scanner.nextLine();
        clearConsole();
        System.out.println("A quantidade de caracteres é: " + frase.length());

    }

    //Limpa Console
    public final static void clearConsole() {
        //Função feita por Gabriel Piske
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
