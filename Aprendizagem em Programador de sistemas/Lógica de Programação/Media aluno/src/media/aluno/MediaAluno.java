
package media.aluno;

import java.util.Scanner;
//Importação das bibliotecas
public class MediaAluno {
    
    public static void main(String[] args) {
        float num;//Declarar variavel
         Scanner scanner = new Scanner(System.in);//Declarar Scanner
        
        int[] notas = new int[1000] ;//Declarar vetor
       System.out.println("Ola, quantas notas gostaria de fazer a media?\n");
       num = scanner.nextInt();//Input do console
       
       for(int i = 0; i<num;i++){
           //Laço de repetição para ler a quantidade certa de notas
           System.out.println("Digite a nota "+(i+1)+":\n");
           notas[i]= scanner.nextInt();//Input
       }
       float num2 =0;//Variavel
       for(int i = 0; i<num;i++){
           num2+=notas[i];//Soma
       }
       System.out.println("A media e:"+num2/num);//Resultado final
       
    }
    
}
