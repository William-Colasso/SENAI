package projeto.grupo.pkg8;

//Importação de bibliotecas
import java.util.Scanner;
//Contador de caracteres em JAVA, William Colasso
public class ProjetoGrupo8 {

    public static void main(String[] args) {
        String frase="";
        while(frase!="0"){
            Scanner scanner = new Scanner(System.in); //Declarar Scanner
            System.out.println("Digite algo para saber a quantidade de caracteres"); //Output
             frase = scanner.nextLine();//Ler/ input da frase
            System.out.println("A quantidade de caracteres é: " + frase.length());//Output 
        }
    }

    

}
