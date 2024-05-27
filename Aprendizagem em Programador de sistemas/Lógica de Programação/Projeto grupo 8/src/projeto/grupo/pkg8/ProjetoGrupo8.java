package projeto.grupo.pkg8;

<<<<<<< HEAD
//Importação de bibliotecas
=======
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
>>>>>>> 381d6bd310127b4846195f69c0aa68cb8cdbbf9c
import java.util.Scanner;
//Contador de caracteres em JAVA, William Colasso
public class ProjetoGrupo8 {

    public static void main(String[] args) {
<<<<<<< HEAD
        String frase="";
        while(frase!="0"){
            Scanner scanner = new Scanner(System.in); //Declarar Scanner
            System.out.println("Digite algo para saber a quantidade de caracteres"); //Output
             frase = scanner.nextLine();//Ler/ input da frase
            System.out.println("A quantidade de caracteres é: " + frase.length());//Output 
        }
    }

    
=======
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
>>>>>>> 381d6bd310127b4846195f69c0aa68cb8cdbbf9c

}
